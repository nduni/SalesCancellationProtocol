package ui.panels;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class ProductPanelLabels extends JPanel{
		private JTextPane productName;
		private JTextPane ordinalNumber;
		private JTextPane unitOfMeasure;
		private JTextPane quantity;
		private JTextPane pricePerUnit;
		private JTextPane valueWithTax;
		private JTextPane taxPercent;
		private JTextPane includingTax;
		private JTextPane amountOfTax;
		private JTextPane valueWithoutTax;
		public ProductPanelLabels() {
			super();
			createComponents();
		}
		private void createComponents() {
			setLayout(null);
			productName = new JTextPane();
			productName.setBackground(UIManager.getColor("Button.background"));
			productName.setText("Nazwa produktu");
			productName.setBounds(33, 15, 108, 31);
			productName.setEditable(false);

			ordinalNumber = new JTextPane();
			ordinalNumber.setBackground(UIManager.getColor("Button.background"));
			ordinalNumber.setText("L.p.");
			ordinalNumber.setBounds(10, 15, 25, 31);
			ordinalNumber.setEditable(false);

			unitOfMeasure = new JTextPane();
			unitOfMeasure.setBackground(UIManager.getColor("Button.background"));
			unitOfMeasure.setText("J.m.");
			unitOfMeasure.setBounds(215, 15, 25, 31);
			unitOfMeasure.setEditable(false);
			
			quantity = new JTextPane();
			quantity.setBackground(UIManager.getColor("Button.background"));
			quantity.setFont(new Font("Tahoma", Font.PLAIN, 10));
			quantity.setText("Ilo\u015B\u0107");
			quantity.setBounds(240, 15, 25, 31);
			quantity.setEditable(false);
			
			pricePerUnit = new JTextPane();
			pricePerUnit.setBackground(UIManager.getColor("Button.background"));
			pricePerUnit.setFont(new Font("Tahoma", Font.PLAIN, 10));
			pricePerUnit.setText("Cena jednostkowa z podatkiem");
			pricePerUnit.setBounds(265, 0, 60, 48);
			pricePerUnit.setEditable(false);

			valueWithTax = new JTextPane();
			valueWithTax.setFont(new Font("Tahoma", Font.PLAIN, 10));
			valueWithTax.setBackground(UIManager.getColor("Button.background"));
			valueWithTax.setText("Warto\u015B\u0107 z podatkiem");
			valueWithTax.setBounds(325, 0, 60, 40);
			valueWithTax.setEditable(false);
			
			taxPercent = new JTextPane();
			taxPercent.setBackground(UIManager.getColor("Button.background"));
			taxPercent.setText("%");
			taxPercent.setBounds(385, 15, 25, 22);
			taxPercent.setEditable(false);
			
			includingTax = new JTextPane();
			includingTax.setFont(new Font("Tahoma", Font.PLAIN, 10));
			includingTax.setBackground(UIManager.getColor("Button.background"));
			includingTax.setText("W tym podatek");
			includingTax.setBounds(385, 0, 78, 15);
			includingTax.setEditable(false);
			
			amountOfTax = new JTextPane();
			amountOfTax.setBackground(UIManager.getColor("Button.background"));
			amountOfTax.setText("Kwota");
			amountOfTax.setBounds(408, 15, 41, 21);
			amountOfTax.setEditable(false);
			
			valueWithoutTax = new JTextPane();
			valueWithoutTax.setFont(new Font("Tahoma", Font.PLAIN, 10));
			valueWithoutTax.setBackground(UIManager.getColor("Button.background"));
			valueWithoutTax.setText("Warto\u015B\u0107 bez podatku");
			valueWithoutTax.setBounds(461, 0, 65, 40);
			valueWithoutTax.setEditable(false);
			
			add(productName);
			add(ordinalNumber);
			add(quantity);
			add(unitOfMeasure);
			add(pricePerUnit);
			add(valueWithTax);
			add(taxPercent);
			add(includingTax);
			add(amountOfTax);
			add(valueWithoutTax);
		}
		public String getProductName() {
			return productName.getText();
		}
		public String getOrdinalNumber() {
			return ordinalNumber.getText();
		}
		public String getUnitOfMeasure() {
			return unitOfMeasure.getText();
		}
		public String getQuantity() {
			return quantity.getText();
		}
		public String getPricePerUnit() {
			return pricePerUnit.getText();
		}
		public String getValueWithTax() {
			return valueWithTax.getText();
		}
		public String getTaxPercent() {
			return taxPercent.getText();
		}
		public String getIncludingTax() {
			return includingTax.getText();
		}
		public String getAmountOfTax() {
			return amountOfTax.getText();
		}
		public String getValueWithoutTax() {
			return valueWithoutTax.getText();
		}
}

