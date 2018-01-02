package ui.panels.ProductPanel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

import ui.MainFrame;
import ui.panels.InWordsPanel;
import ui.panels.TotalSummaryPanel;
import ui.panels.VatSummaryPanel;

public class ProductPanel extends JPanel {
	private JTextField ordinalNumber;
	private JTextField productName;
	private JTextField unitOfMeasure;
	private JTextField quantity;
	private JTextField pricePerUnit;
	private JTextField valueWithTax;
	private JTextField taxPercent;
	private JTextField amountOfTax;
	private JTextField valueWithoutTax;
	private VatSummaryPanel vatSummaryPanel;
	private InWordsPanel inWordsPanel;
	private TotalSummaryPanel totalSummaryPanel;
	private BigDecimal valueToWord;
	
	public ProductPanel(VatSummaryPanel vatSummaryPanel, InWordsPanel inWordsPanel, TotalSummaryPanel totalSummaryPanel) {
		super();
		this.vatSummaryPanel = vatSummaryPanel;
		this.inWordsPanel = inWordsPanel;
		this.totalSummaryPanel = totalSummaryPanel;
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		ordinalNumber = new JTextField();
		ordinalNumber.setBounds(10, 0, 25, 20);
		ordinalNumber.setColumns(10);

		productName = new JTextField();
		productName.setBounds(35, 0, 180, 20);
		productName.setColumns(10);

		unitOfMeasure = new JTextField();
		unitOfMeasure.setBounds(215, 0, 25, 20);
		unitOfMeasure.setColumns(10);

		quantity = new JTextField();

		quantity.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent arg0) {

				if (hasDouble(pricePerUnit) && hasDouble(quantity)) {
					multiplication(quantity, pricePerUnit);
				} else {
					leaveEmptyFields();
				}
				summingupProductPanel();
			}

		});

		quantity.setBounds(240, 0, 25, 20);
		quantity.setColumns(10);
		pricePerUnit = new JTextField();
		pricePerUnit.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent arg0) {

				if (hasDouble(pricePerUnit) && hasDouble(quantity)) {
					multiplication(quantity, pricePerUnit);
				} else {
					leaveEmptyFields();
				}
				summingupProductPanel();
				totalSummaryPanel.summarizeVat();
				amountInWords();
			}

			
		});

		pricePerUnit.setBounds(265, 0, 60, 20);
		pricePerUnit.setColumns(10);

		valueWithTax = new JTextField();
		valueWithTax.setBounds(325, 0, 60, 20);
		valueWithTax.setColumns(10);

		taxPercent = new JTextField();
		taxPercent.setBounds(385, 0, 25, 20);
		taxPercent.setColumns(10);

		amountOfTax = new JTextField();
		amountOfTax.setBounds(410, 0, 60, 20);
		amountOfTax.setColumns(10);

		valueWithoutTax = new JTextField();
		valueWithoutTax.setBounds(470, 0, 60, 20);
		valueWithoutTax.setColumns(10);
		add(ordinalNumber);
		add(productName);
		add(unitOfMeasure);
		add(quantity);
		add(pricePerUnit);
		add(valueWithTax);
		add(taxPercent);
		add(amountOfTax);
		add(valueWithoutTax);

	}

	public boolean hasDouble(JTextField jT) {
		try {
			double d = Double.parseDouble(jT.getText());
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public void multiplication(JTextField jTF1, JTextField jTF2) {
		BigDecimal d1 = new BigDecimal(jTF1.getText());
		BigDecimal d2 = new BigDecimal(jTF2.getText());
		//d1 = Double.parseDouble(jTF1.getText());
		//d2 = Double.parseDouble(jTF2.getText());
		BigDecimal value = d1.multiply(d2);
		BigDecimal tax = new BigDecimal(1.23);
		valueWithTax.setText(value.setScale(2, BigDecimal.ROUND_HALF_UP).toString());
		taxPercent.setText("23");
		valueWithoutTax.setText(value.divide(tax, 2, BigDecimal.ROUND_HALF_UP).toString());
		amountOfTax.setText(value.subtract(value.divide(tax, 2, BigDecimal.ROUND_HALF_UP)).toString());
	}

	private void amountInWords() {
		String s = NumberInWords.convert(valueToWord);
		inWordsPanel.setInWords(s);
		inWordsPanel.setAmount(valueToWord.toString());
		
	}
	private void leaveEmptyFields() {
		valueWithTax.setText("");
		amountOfTax.setText("");
		valueWithoutTax.setText("");

	}
/**
	public double getValueWithTax() {
		if (hasDouble(valueWithTax)) {
			return Double.parseDouble(valueWithTax.getText());
		} else {
			return 0.0;
		}
		}
		*/
	public String getValueWithTax() {
		if (hasDouble(valueWithTax)) {
			return valueWithTax.getText();
		} else {
			return "";
		}
	}
	public String getTaxPercent() {
		if (hasDouble(taxPercent)) {
			return taxPercent.getText();
		} else {
			return "";
		}
	}

	public String getAmountOfTax() {
		if (hasDouble(amountOfTax)) {
			return amountOfTax.getText();
		} else {
			return "";
		}
	}

	public JTextField getOrdinalNumber() {
		return ordinalNumber;
	}

	public JTextField getProductName() {
		return productName;
	}

	public JTextField getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public JTextField getQuantity() {
		return quantity;
	}

	public JTextField getPricePerUnit() {
		return pricePerUnit;
	}

	public JTextField getValueWithoutTax() {
		return valueWithoutTax;
	}

	public VatSummaryPanel getVatSummaryPanel() {
		return vatSummaryPanel;
	}

	public InWordsPanel getInWordsPanel() {
		return inWordsPanel;
	}

	public TotalSummaryPanel getTotalSummaryPanel() {
		return totalSummaryPanel;
	}

	public BigDecimal getValue() {
		return valueToWord;
	}

	public BigDecimal valueWithoutTax() {
		if (hasDouble(valueWithoutTax)) {
			return new BigDecimal(valueWithoutTax.getText());
		} else {
			return new BigDecimal(0.0);
		}
	}
	
	public void summingupProductPanel() {
		ArrayList<ProductPanel> productPanels = new ArrayList<ProductPanel>();
		productPanels = MainFrame.getProductPanels();
		BigDecimal value =new BigDecimal(0.0);
		BigDecimal tax = new BigDecimal(0.0);
		BigDecimal net = new BigDecimal(0.0);
		for (ProductPanel p : productPanels) {
			try {
				value = value.add(new BigDecimal(notNull(p.getValueWithTax())));
				tax = tax.add(new BigDecimal(notNull(p.getAmountOfTax())));
				net =net.add(p.valueWithoutTax());
			} catch (NullPointerException e) {
				
			}
		}
		vatSummaryPanel.setValueSummary(String.valueOf(value));
		vatSummaryPanel.setTaxSummary(String.valueOf(tax));
		vatSummaryPanel.setValueWithoutTaxSummary(String.valueOf(net));
		vatSummaryPanel.setTaxPercent(getTaxPercent());
		this.valueToWord=value;
	}

	private String notNull(String valueWithTax2) {
			if (valueWithTax2.equals("")) {
		return "0";
			}
			else {
				return  valueWithTax2;
			}
	}
}
