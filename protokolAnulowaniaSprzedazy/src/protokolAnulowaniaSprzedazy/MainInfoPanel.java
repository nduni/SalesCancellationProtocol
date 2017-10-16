package protokolAnulowaniaSprzedazy;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainInfoPanel extends JPanel{
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
		
		JTextField protocolDate = new JTextField();
		protocolDate.setBounds(462, 0, 60, 20);
		protocolDate.setColumns(10);
		
		add(lblProtocol);
		add(city);
		add(protocolNumber);
		add(protocolDate);
	}
}
