package protokolAnulowaniaSprzedazy;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class VatSummaryPanel extends JPanel {
	private JTextField textField00;
	private JTextField textField01;
	private JTextField textField02;
	private JTextField textField03;

	public VatSummaryPanel() {
		super();
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
	textField00 = new JTextField();
	textField00.setColumns(10);
	textField00.setBounds(0, 0, 60, 20);
	

	textField01 = new JTextField();
	textField01.setColumns(10);
	textField01.setBounds(60, 0, 25, 20);

	textField02 = new JTextField();
	textField02.setColumns(10);
	textField02.setBounds(85, 0, 60, 20);

	 textField03 = new JTextField();
	textField03.setColumns(10);
	textField03.setBounds(145, 0, 60, 20);

	add(textField00);
	add(textField01);
	add(textField02);
	add(textField03);
}
}