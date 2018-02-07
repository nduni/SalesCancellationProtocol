package ui.panels;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import ui.panels.ProductPanel.NumberInWords;
import ui.panels.ProductPanel.ProductPanel;

public class InWordsPanel extends JPanel {

	private static ArrayList<String> cashiersList;
	private JComboBox<Object> cashier;
	private JTextArea inWords;
	private JTextPane amount;
	private JTextPane value;
	private JTextPane inWordsLabel;
	private JLabel lblCashier;

	public InWordsPanel() {
		super();
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		value = new JTextPane();
		value.setBackground(UIManager.getColor("Button.background"));
		value.setText("Warto\u015Bci\u0105 z\u0142");
		value.setBounds(10, 10, 65, 20);
		add(value);

		inWordsLabel = new JTextPane();
		inWordsLabel.setBackground(UIManager.getColor("Button.background"));
		inWordsLabel.setText("s\u0142ownie:");
		inWordsLabel.setBounds(10, 40, 65, 20);
		add(inWordsLabel);

		inWords = new JTextArea();
		inWords.setBorder(new LineBorder(new Color(0, 0, 0)));
		inWords.setBounds(10, 60, 255, 20);
		add(inWords);

		amount = new JTextPane();
		amount.setBorder(new LineBorder(new Color(0, 0, 0)));
		amount.setBounds(85, 10, 86, 20);
		add(amount);

		lblCashier = new JLabel("Nale\u017Cy uzna\u0107 kasjera:");
		lblCashier.setBounds(10, 88, 125, 20);
		add(lblCashier);

		cashier = new JComboBox<Object>();
		cashier.setBounds(142, 87, 123, 22);
		addCashiersToComboBox();
		add(cashier);
	}

	private void addCashiersToComboBox() {
		DefaultListModel<String> model = new DefaultListModel<String>();
		DefaultComboBoxModel defaultModel = new DefaultComboBoxModel();
		cashiersList = new ArrayList<String>();
		try {
			FileInputStream fout = new FileInputStream("kasjerzy.bin");
			ObjectInputStream stream = new ObjectInputStream(fout);
			model = (DefaultListModel<String>) stream.readObject();
			cashiersList = Collections.list(model.elements());
			;
			for (Object c : cashiersList) {
				defaultModel.addElement(c);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		cashier.setModel(defaultModel);
	}

	public void redrawList() {
		cashier.removeAllItems();
		addCashiersToComboBox();
	}

	public void setInWords(String s) {
		inWords.setText(s);
	}

	public void setAmount(String a) {
		amount.setText(a);
	}

	public String getCashier() {
		return cashier.getSelectedItem()+"";
	}

	public String getInWords() {
		return inWords.getText();
	}

	public String getAmount() {
		return amount.getText();
	}

	public String getValue() {
		return value.getText();
	}

	public String getInWordsLabel() {
		return inWordsLabel.getText();
	}

	public String getLblCashier() {
		return lblCashier.getText();
	}

}
