package ui.panels;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

import ui.MainFrame;

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
	
	public ProductPanel(VatSummaryPanel vatSummaryPanel) {
		super();
		this.vatSummaryPanel = vatSummaryPanel;
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
		amountOfTax.setText(value.divide(tax, 2, BigDecimal.ROUND_HALF_UP).toString());
	}

	private void leaveEmptyFields() {
		valueWithTax.setText("");
		amountOfTax.setText("");
		valueWithoutTax.setText("");

	}

	public double getValueWithTax() {
		if (hasDouble(valueWithTax)) {
			return Double.parseDouble(valueWithTax.getText());
		} else {
			return 0.0;
		}
	}

	public double getTaxPercent() {
		if (hasDouble(taxPercent)) {
			return Double.parseDouble(taxPercent.getText());
		} else {
			return 0.0;
		}
	}

	public double getAmountOfTax() {
		if (hasDouble(amountOfTax)) {
			return Double.parseDouble(amountOfTax.getText());
		} else {
			return 0.0;
		}
	}

	public double valueWithoutTax() {
		if (hasDouble(valueWithoutTax)) {
			return Double.parseDouble(valueWithoutTax.getText());
		} else {
			return 0.0;
		}
	}
	
	public void summingupProductPanel() {
		ArrayList<ProductPanel> productPanels = new ArrayList<ProductPanel>();
		productPanels = MainFrame.getPanels();
		double value = 0.0;
		double tax = 0.0;
		double net = 0.0;
		for (ProductPanel p : productPanels) {
			try {
				value += p.getValueWithTax();
				tax += p.getAmountOfTax();
				net += p.valueWithoutTax();
			} catch (NullPointerException e) {
				
			}
		}
		vatSummaryPanel.setValueSummary(String.valueOf(value));
		vatSummaryPanel.setTaxSummary(String.valueOf(tax));
		vatSummaryPanel.setValueWithoutTaxSummary(String.valueOf(net));
	}
}
