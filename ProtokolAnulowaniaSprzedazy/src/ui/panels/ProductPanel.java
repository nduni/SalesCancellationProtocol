package ui.panels;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
			public void keyPressed(KeyEvent arg0) {

				if (hasDouble(pricePerUnit) && hasDouble(quantity)) {
					multiplication(quantity, pricePerUnit);
				} else {
					valueWithTax.setText("");
					amountOfTax.setText("");
					valueWithoutTax.setText("");

				}
			}
		});

		quantity.setBounds(240, 0, 25, 20);
		quantity.setColumns(10);
		pricePerUnit = new JTextField();
		pricePerUnit.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent arg0) {

				if (hasDouble(pricePerUnit) && hasDouble(quantity)) {
					multiplication(quantity, pricePerUnit);
				} else {
					valueWithTax.setText("");
					amountOfTax.setText("");
					valueWithoutTax.setText("");
				}
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
		double d, d1, d2;
		d1 = Double.parseDouble(jTF1.getText());
		d2 = Double.parseDouble(jTF2.getText());
		d = d1 * d2;
		valueWithTax.setText(String.valueOf(d));
		taxPercent.setText("23");
		valueWithoutTax.setText(BigDecimal.valueOf(d / 1.23).setScale(2, BigDecimal.ROUND_HALF_UP).toString());
		amountOfTax.setText(BigDecimal.valueOf(d - d / 1.23).setScale(2, BigDecimal.ROUND_HALF_UP).toString());
//		vatSummaryPanel.summarize();
	}

	public double getValueWithTax() {
		if (hasDouble(valueWithTax)) {
			return Double.parseDouble(valueWithTax.getText());
		} else {
			return 0.0;
		}
	}

	public double getTaxPercent() {
		return Double.parseDouble(taxPercent.getText());
	}

	public double getAmountOfTax() {
		return Double.parseDouble(amountOfTax.getText());
	}

	public JTextField valueWithoutTax() {
		return valueWithoutTax;
	}

}
