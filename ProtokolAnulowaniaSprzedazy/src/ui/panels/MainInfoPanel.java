package ui.panels;

import java.awt.Font;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.JSpinner;

public class MainInfoPanel extends JPanel {
	public MainInfoPanel() {
		super();
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		JLabel lblProtocol = new JLabel("Protok\u00F3\u0142 anulowania sprzeda\u017Cy z kasy fiskalnej nr");
		lblProtocol.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtocol.setBounds(10, 0, 288, 20);

		JTextField protocolNumber = new JTextField();
		protocolNumber.setBounds(308, 0, 60, 20);
		protocolNumber.setColumns(10);

		JTextField city = new JTextField();
		city.setText("Wroc\u0142aw");
		city.setBounds(385, 0, 60, 20);
		city.setColumns(10);

		add(lblProtocol);
		add(city);
		add(protocolNumber);

		JSpinner timeSpinner = new JSpinner(new SpinnerDateModel());
		timeSpinner.setSize(90, 20);
		timeSpinner.setLocation(450, 0);
		JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "dd-MM-yyyy");
		timeSpinner.setEditor(timeEditor);
		timeSpinner.setValue(new Date());
		// spinner.setBounds(461, 0, 29, 20);
		add(timeSpinner);

	}
}
