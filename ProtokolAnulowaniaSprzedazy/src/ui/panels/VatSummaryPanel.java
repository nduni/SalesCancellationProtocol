package ui.panels;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

import ui.MainFrame;

public class VatSummaryPanel extends JPanel {
	private JTextField valueSummary;
	private JTextField taxPercent;
	private JTextField taxSummary;
	private JTextField valueWithoutTaxSummary;
	private ArrayList<ProductPanel> panels;

	public VatSummaryPanel(ArrayList<ProductPanel> panels) {
		super();
		this.panels = panels;
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		valueSummary = new JTextField();
		valueSummary.setColumns(10);
		valueSummary.setBounds(0, 0, 60, 20);

		taxPercent = new JTextField();
		taxPercent.setColumns(10);
		taxPercent.setBounds(60, 0, 25, 20);

		taxSummary = new JTextField();
		taxSummary.setColumns(10);
		taxSummary.setBounds(85, 0, 60, 20);

		valueWithoutTaxSummary = new JTextField();
		valueWithoutTaxSummary.setColumns(10);
		valueWithoutTaxSummary.setBounds(145, 0, 60, 20);

		add(valueSummary);
		add(taxPercent);
		add(taxSummary);
		add(valueWithoutTaxSummary);
	}

	public void summarize() {
			
			BigDecimal sum = new BigDecimal(0.0);
			for (ProductPanel p : panels) {
				if (((ProductPanel) p).getValueWithTax() != 0.0) {
					sum.add(BigDecimal.valueOf(((ProductPanel) p).getValueWithTax()).setScale(2,
							BigDecimal.ROUND_HALF_UP));
				}
			}
			valueSummary.setText(String.valueOf(sum));
		
	}

	public JTextField getValueSummary() {
		return valueSummary;
	}

	public void setValueSummary(String value) {
		this.valueSummary.setText(value);
	}

	public JTextField getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(JTextField taxPercent) {
		this.taxPercent = taxPercent;
	}

	public JTextField getTaxSummary() {
		return taxSummary;
	}

	public void setTaxSummary(JTextField taxSummary) {
		this.taxSummary = taxSummary;
	}

	public JTextField getValueWithoutTaxSummary() {
		return valueWithoutTaxSummary;
	}

	public void setValueWithoutTaxSummary(JTextField valueWithoutTaxSummary) {
		this.valueWithoutTaxSummary = valueWithoutTaxSummary;
	}

}
