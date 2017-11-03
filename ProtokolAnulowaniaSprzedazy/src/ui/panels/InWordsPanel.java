package ui.panels;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class InWordsPanel extends JPanel {
	private static ArrayList<String> cashiersList;
	private JComboBox cashier;
	public InWordsPanel() {
		super();
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		JTextPane txtpnWartociZ = new JTextPane();
		txtpnWartociZ.setBackground(UIManager.getColor("Button.background"));
		txtpnWartociZ.setText("Warto\u015Bci\u0105 z\u0142");
		txtpnWartociZ.setBounds(10, 10, 65, 20);
		add(txtpnWartociZ);

		JTextPane txtpnSownie = new JTextPane();
		txtpnSownie.setBackground(UIManager.getColor("Button.background"));
		txtpnSownie.setText("s\u0142ownie:");
		txtpnSownie.setBounds(10, 40, 65, 20);
		add(txtpnSownie);

		JTextPane textPane = new JTextPane();
		textPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane.setBounds(10, 60, 255, 20);
		add(textPane);

		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_2.setBounds(85, 10, 86, 20);
		add(textPane_2);
		
		JLabel lblCashier = new JLabel("Nale\u017Cy uzna\u0107 kasjera:");
		lblCashier.setBounds(10, 88, 125, 20);
		add(lblCashier);

		cashier = new JComboBox();
		cashier.setBounds(142, 87, 123, 22);
		addCashiers();
		add(cashier);
		
		
		
	}

	private void addCashiers() {
		try {
			FileInputStream fout = new FileInputStream("kasjerzy.bin");
			ObjectInputStream stream = new ObjectInputStream(fout);
			ArrayList<String> cashiersList = (ArrayList<String>) stream.readObject();
			for (String s: cashiersList) {
				cashier.addItem(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}
