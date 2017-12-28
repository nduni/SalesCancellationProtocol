package ui.panels;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class TotalSummaryPanel extends JPanel {
	private VatSummaryPanel vatSummaryPanel;
	private JTextPane totalValue;
	private JTextPane tax;
	private JTextPane netValue;
	private JTextPane txtpnTotalProtocolValue;
	private JTextPane txtpnDecreasingGrossSales;
	private JTextPane txtpnDecreasingNetSales;
	private JTextPane txtpnDecreasingTax;

	public TotalSummaryPanel(VatSummaryPanel vatSummaryPanel) {
		super();
		this.vatSummaryPanel = vatSummaryPanel;
		createComponents();
	}

	private void createComponents() {
		setLayout(null);

		totalValue = new JTextPane();
		totalValue.setBorder(new LineBorder(new Color(0, 0, 0)));
		totalValue.setBounds(190, 70, 60, 20);

		tax = new JTextPane();
		tax.setBorder(new LineBorder(new Color(0, 0, 0)));
		tax.setBounds(190, 90, 60, 20);

		netValue = new JTextPane();
		netValue.setBorder(new LineBorder(new Color(0, 0, 0)));
		netValue.setBounds(190, 110, 60, 20);

		txtpnTotalProtocolValue = new JTextPane();
		txtpnTotalProtocolValue.setBackground(UIManager.getColor("Button.background"));
		txtpnTotalProtocolValue.setText("\u0141\u0105czna warto\u015B\u0107 protoko\u0142u");
		txtpnTotalProtocolValue.setBounds(0, 25, 170, 20);

		txtpnDecreasingGrossSales = new JTextPane();
		txtpnDecreasingGrossSales.setBackground(UIManager.getColor("Button.background"));
		txtpnDecreasingGrossSales.setText("Zmniejszenie sprzeda\u017Cy brutto");
		txtpnDecreasingGrossSales.setBounds(0, 70, 170, 20);

		txtpnDecreasingNetSales = new JTextPane();
		txtpnDecreasingNetSales.setBackground(UIManager.getColor("Button.background"));
		txtpnDecreasingNetSales.setText("Zmniejszenie sprzeda\u017Cy netto");
		txtpnDecreasingNetSales.setBounds(0, 90, 170, 20);

		txtpnDecreasingTax = new JTextPane();
		txtpnDecreasingTax.setBackground(UIManager.getColor("Button.background"));
		txtpnDecreasingTax.setText("Zmniejszenie podatku PTU");
		txtpnDecreasingTax.setBounds(0, 110, 170, 20);

		add(totalValue);
		add(tax);
		add(txtpnTotalProtocolValue);
		add(netValue);
		add(txtpnDecreasingGrossSales);
		add(txtpnDecreasingNetSales);
		add(txtpnDecreasingTax);
		
	}

	public void summarizeVat() {
		totalValue.setText(vatSummaryPanel.getValueSummary().getText());
		tax.setText(vatSummaryPanel.getTaxSummary().getText());
		netValue.setText(vatSummaryPanel.getValueWithoutTaxSummary().getText());

	}

	public String getTotalValue() {
		return totalValue.getText();
	}

	public String getTax() {
		return tax.getText();
	}

	public String getNetValue() {
		return netValue.getText();
	}

	public String getTxtpnTotalProtocolValue() {
		return txtpnTotalProtocolValue.getText();
	}

	public String getTxtpnDecreasingGrossSales() {
		return txtpnDecreasingGrossSales.getText();
	}

	public String getTxtpnDecreasingNetSales() {
		return txtpnDecreasingNetSales.getText();
	}

	public String getTxtpnDecreasingTax() {
		return txtpnDecreasingTax.getText();
	}
	
}
