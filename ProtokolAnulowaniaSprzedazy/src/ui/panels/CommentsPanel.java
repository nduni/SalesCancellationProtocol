package ui.panels;
 
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.UIManager;
 
public class CommentsPanel extends JPanel {
	private JTextPane txtpnComments;
	private JTextPane txtpnTaxSummary;
	private JTextArea comments;
	 
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
		
		txtpnTaxSummary = new JTextPane();
		txtpnTaxSummary.setBounds(245, 0, 100, 100);
		txtpnTaxSummary.setBackground(UIManager.getColor("Button.background"));
		txtpnTaxSummary.setText("Zestawienie sprzeda\u017Cy wg stawek VAT");
		add(txtpnTaxSummary);
		
		comments = new JTextArea();
		comments.setBounds(10, 20, 230, 80);
		add(comments);

	}

	public String getTxtpnComments() {
		return txtpnComments.getText();
	}

	public String getTxtpnTaxSummary() {
		return txtpnTaxSummary.getText();
	}

	public String getComments() {
		return comments.getText();
	}
	
}
