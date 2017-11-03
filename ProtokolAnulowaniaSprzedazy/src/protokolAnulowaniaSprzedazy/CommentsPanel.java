package protokolAnulowaniaSprzedazy;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
 
public class CommentsPanel extends JPanel {
	JTextPane txtpnComments;
	JTextField txtfdComments;
	JTextPane txtpnTaxSummary;
	
	public CommentsPanel() {
		super();
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		txtpnComments = new JTextPane();
		txtpnComments.setBackground(UIManager.getColor("Button.background"));
		txtpnComments.setText("Uwagi:");
		txtpnComments.setBounds(10, 0, 230, 20);
		add(txtpnComments);

		txtfdComments = new JTextField();
		txtfdComments.setBounds(10, 20, 230, 80);
		add(txtfdComments);
		txtfdComments.setColumns(10);
		
		txtpnTaxSummary = new JTextPane();
		txtpnTaxSummary.setBounds(240, 0, 60, 100);
		txtpnTaxSummary.setBackground(UIManager.getColor("Button.background"));
		txtpnTaxSummary.setText("Zestawienie sprzeda\u017Cy wg stawek VAT");
		add(txtpnTaxSummary);

	}
}
