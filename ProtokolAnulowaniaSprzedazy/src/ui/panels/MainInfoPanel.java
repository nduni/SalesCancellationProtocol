package ui.panels;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.xml.bind.DatatypeConverter;

public class MainInfoPanel extends JPanel {
	private JSpinner timeSpinner;
	private JTextField city;
	private JTextField protocolNumber;
	private JLabel lblProtocol;

	public MainInfoPanel() {
		super();
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		lblProtocol = new JLabel("Protok\u00F3\u0142 anulowania sprzeda\u017Cy z kasy fiskalnej nr");
		lblProtocol.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtocol.setBounds(10, 0, 288, 20);

		protocolNumber = new JTextField();
		protocolNumber.setBounds(308, 0, 60, 20);
		protocolNumber.setColumns(10);

		city = new JTextField();
		city.setText("Wroc\u0142aw");
		city.setBounds(385, 0, 60, 20);
		city.setColumns(10);

		add(lblProtocol);
		add(city);
		add(protocolNumber);

		timeSpinner = new JSpinner(new SpinnerDateModel());
		timeSpinner.setSize(90, 20);
		timeSpinner.setLocation(450, 0);
		JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "dd-MM-yyyy");
		timeSpinner.setEditor(timeEditor);
		timeSpinner.setValue(new Date());
		// spinner.setBounds(461, 0, 29, 20);
		add(timeSpinner);

	}

	public String getTimeSpinner() {
	return	new SimpleDateFormat("dd/MM/yyyy").format(timeSpinner.getValue());
	}

	public String getCity() {
		return city.getText();
	}

	public String getProtocolNumber() {
		return protocolNumber.getText();
	}

	public String getLblProtocol() {
		return lblProtocol.getText();
	}
	
}
