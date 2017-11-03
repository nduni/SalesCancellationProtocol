package protokolAnulowaniaSprzedazy;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class ProductPanelLabels extends JPanel{
		public ProductPanelLabels() {
			super();
			createComponents();
		}
		private void createComponents() {
			setLayout(null);
			JTextPane productName = new JTextPane();
			productName.setBackground(UIManager.getColor("Button.background"));
			productName.setText("Nazwa produktu");
			productName.setBounds(33, 15, 108, 31);

			JTextPane ordinalNumber = new JTextPane();
			ordinalNumber.setBackground(UIManager.getColor("Button.background"));
			ordinalNumber.setText("L.p.");
			ordinalNumber.setBounds(10, 15, 25, 31);

			JTextPane unitOfMeasure = new JTextPane();
			unitOfMeasure.setBackground(UIManager.getColor("Button.background"));
			unitOfMeasure.setText("J.m.");
			unitOfMeasure.setBounds(217, 15, 25, 31);

			JTextPane quantity = new JTextPane();
			quantity.setBackground(UIManager.getColor("Button.background"));
			quantity.setFont(new Font("Tahoma", Font.PLAIN, 10));
			quantity.setText("Ilo\u015B\u0107");
			quantity.setBounds(243, 15, 25, 31);

			JTextPane pricePerUnit = new JTextPane();
			pricePerUnit.setBackground(UIManager.getColor("Button.background"));
			pricePerUnit.setFont(new Font("Tahoma", Font.PLAIN, 10));
			pricePerUnit.setText("Cena jednostkowa z podatkiem");
			pricePerUnit.setBounds(268, 0, 60, 48);

			JTextPane valueWithTax = new JTextPane();
			valueWithTax.setFont(new Font("Tahoma", Font.PLAIN, 10));
			valueWithTax.setBackground(UIManager.getColor("Button.background"));
			valueWithTax.setText("Warto\u015B\u0107 z podatkiem");
			valueWithTax.setBounds(326, 0, 60, 40);

			JTextPane taxPercent = new JTextPane();
			taxPercent.setBackground(UIManager.getColor("Button.background"));
			taxPercent.setText("%");
			taxPercent.setBounds(385, 15, 25, 22);

			JTextPane includingTax = new JTextPane();
			includingTax.setFont(new Font("Tahoma", Font.PLAIN, 10));
			includingTax.setBackground(UIManager.getColor("Button.background"));
			includingTax.setText("W tym podatek");
			includingTax.setBounds(385, 0, 78, 15);

			JTextPane amountOfTax = new JTextPane();
			amountOfTax.setBackground(UIManager.getColor("Button.background"));
			amountOfTax.setText("Kwota");
			amountOfTax.setBounds(408, 15, 41, 21);

			JTextPane valueWithoutTax = new JTextPane();
			valueWithoutTax.setFont(new Font("Tahoma", Font.PLAIN, 10));
			valueWithoutTax.setBackground(UIManager.getColor("Button.background"));
			valueWithoutTax.setText("Warto\u015B\u0107 bez podatku");
			valueWithoutTax.setBounds(461, 0, 65, 40);
			
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
}

