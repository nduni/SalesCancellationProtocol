package ui.panels.ReasonInfoPanel;

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
		
		JComboBox reasonComboBox = new JComboBox();
		reasonComboBox.setEditable(true);
		reasonComboBox.setBounds(210, 0, 342, 20);
		reasonComboBox.addItem(new Reasons("5", "---"));
		reasonComboBox.addItem(new Reasons("0", "Klient nie odebra� przesy�ki za pobraniem"));
		reasonComboBox.addItem(new Reasons("1", "Zwrot w ci�gu 30 dni"));
		reasonComboBox.addItem(new Reasons("2", "Zwrot z tytu�u reklamacji"));
		reasonComboBox.addItem(new Reasons("3", "Klient zrezygnowa� z zam�wienia przed wysy�k�"));
		reasonComboBox.addItem(new Reasons("4", "B��d podczas drukowania paragonu"));
		


		add(lblReason);
		add(reasonComboBox);
		
		
	}
}
