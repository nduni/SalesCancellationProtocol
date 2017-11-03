package protokolAnulowaniaSprzedazy;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class VatSummaryPanel extends JPanel {
	private JTextField valueSummary;
	private JTextField taxPercent;
	private JTextField taxSummary;
	private JTextField valueWithoutTaxSummary;

	public VatSummaryPanel() {
		super();
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
	valueSummary = new JTextField();
	valueSummary.setColumns(10);
	valueSummary.setBounds(0, 0, 60, 20);
	/**valueSummary.addKeyListener(new KeyAdapter() {

		@Override
		public void keyPressed(KeyEvent arg0) {

			valueSummary.setText(String.valueOf(arg0.getKeyChar()));
			valueSummary.
			}
		
	});*/
	
	taxPercent = new JTextField();
	taxPercent.setColumns(10);
	taxPercent.setBounds(60, 0, 25, 20);

	taxSummary = new JTextField();
	taxSummary.setColumns(10);
	taxSummary.setBounds(85, 0, 60, 20);
	/**taxSummary.addKeyListener(new KeyAdapter() {

		@Override
		public void keyPressed(KeyEvent arg0) {

			valueSummary.setText(String.valueOf(arg0.getKeyChar()));

			}
		
	});
	*/
	 valueWithoutTaxSummary = new JTextField();
	valueWithoutTaxSummary.setColumns(10);
	valueWithoutTaxSummary.setBounds(145, 0, 60, 20);
	/**valueWithoutTaxSummary.addKeyListener(new KeyAdapter() {

		@Override
		public void keyPressed(KeyEvent arg0) {

			valueSummary.setText(String.valueOf(arg0.getKeyChar()));

			}
		
	});
*/
	add(valueSummary);
	add(taxPercent);
	add(taxSummary);
	add(valueWithoutTaxSummary);
}
	public static void summarize() {
		/**BigDecimal value,net,tax = 0;
		for(ProductPanel p:panels) {
			p.getTextField_05()
		}*/
	}

	public JTextField getValueSummary() {
		return valueSummary;
	}

	public void setValueSummary(JTextField valueSummary) {
		this.valueSummary = valueSummary;
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
