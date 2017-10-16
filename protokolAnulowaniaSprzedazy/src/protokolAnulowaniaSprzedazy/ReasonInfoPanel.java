package protokolAnulowaniaSprzedazy;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReasonInfoPanel extends JPanel{
	public ReasonInfoPanel() {
		super();
		createComponents();
	}
	private void createComponents() {
		setLayout(null);
		JLabel lblReason = new JLabel("Przyczyna anulowania sprzeda\u017Cy");
		lblReason.setBounds(10, 0, 200, 20);
		
		JComboBox reason = new JComboBox();
		reason.setEditable(true);
		reason.setBounds(210, 0, 342, 20);
		
		add(lblReason);
		add(reason);
	}
}
