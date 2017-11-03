package ui.panels;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class ReciepeAndTillPanel extends JPanel {
	public ReciepeAndTillPanel() {
		super();
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		
		JTextPane txtpnReciepeAdded = new JTextPane();
		txtpnReciepeAdded.setBackground(UIManager.getColor("Button.background"));
		txtpnReciepeAdded.setText("Za\u0142\u0105czono paragon nr");
		txtpnReciepeAdded.setBounds(0, 20, 120, 20);
		add(txtpnReciepeAdded);

		JTextPane txtpnTillNr = new JTextPane();
		txtpnTillNr.setBackground(UIManager.getColor("Button.background"));
		txtpnTillNr.setText("Kasa nr");
		txtpnTillNr.setBounds(320, 20, 52, 20);
		add(txtpnTillNr);

		JTextField reciepeNr = new JTextField();
		reciepeNr.setBorder(new LineBorder(new Color(171, 173, 179)));
		reciepeNr.setBounds(115, 20, 86, 20);
		add(reciepeNr);
		reciepeNr.setColumns(10);

		JComboBox tillNr = new JComboBox();
		tillNr.setBounds(371, 20, 150, 20);
		add(tillNr);
	}
}
