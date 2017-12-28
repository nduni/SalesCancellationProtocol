package ui.panels.ReasonInfoPanel;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReasonInfoPanel extends JPanel{
	private JComboBox reasonComboBox;
	private JLabel lblReason;
	public ReasonInfoPanel() {
		super();
		createComponents();
	}
	private void createComponents() {
		setLayout(null);
		lblReason = new JLabel("Przyczyna anulowania sprzeda\u017Cy");
		lblReason.setBounds(10, 0, 200, 20);
		
		reasonComboBox = new JComboBox();
		reasonComboBox.setEditable(true);
		reasonComboBox.setBounds(210, 0, 342, 20);
		reasonComboBox.addItem(new Reasons("5", "---"));
		reasonComboBox.addItem(new Reasons("0", "Klient nie odebra³ przesy³ki za pobraniem"));
		reasonComboBox.addItem(new Reasons("1", "Odst¹pienie od umowy"));
		reasonComboBox.addItem(new Reasons("2", "Zwrot z tytu³u reklamacji"));
		reasonComboBox.addItem(new Reasons("3", "Klient zrezygnowa³ z zamówienia przed wysy³k¹"));
		reasonComboBox.addItem(new Reasons("4", "B³¹d podczas drukowania paragonu"));
		
		add(lblReason);
		add(reasonComboBox);
	}
	public String getReasonComboBox() {
		return reasonComboBox.getSelectedItem()+"";
	}
	public String getLblReason() {
		return lblReason.getText();
	}
	
}
