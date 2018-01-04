package ui.panels;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;


public class ReciepeAndTillPanel extends JPanel {
	
	private static ArrayList<String>  tillsList;
	private JComboBox tillNr;
	private JTextPane txtpnReciepeAdded;
	private JTextPane txtpnTillNr;
	private JTextField reciepeNr;

	public ReciepeAndTillPanel() {
		super();
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		
		txtpnReciepeAdded = new JTextPane();
		txtpnReciepeAdded.setBackground(UIManager.getColor("Button.background"));
		txtpnReciepeAdded.setText("Za\u0142\u0105czono paragon nr");
		txtpnReciepeAdded.setBounds(0, 20, 120, 20);
		add(txtpnReciepeAdded);

		txtpnTillNr = new JTextPane();
		txtpnTillNr.setBackground(UIManager.getColor("Button.background"));
		txtpnTillNr.setText("Kasa nr");
		txtpnTillNr.setBounds(320, 20, 52, 20);
		add(txtpnTillNr);

		reciepeNr = new JTextField();
		reciepeNr.setBorder(new LineBorder(new Color(171, 173, 179)));
		reciepeNr.setBounds(115, 20, 86, 20);
		add(reciepeNr);
		reciepeNr.setColumns(10);

		tillNr = new JComboBox();
		tillNr.setBounds(371, 20, 150, 20);
		addTillsToComboBox();
		add(tillNr);
	}
	
	private void addTillsToComboBox() {
		DefaultListModel<String> model = new DefaultListModel<String>();
		DefaultComboBoxModel defaultModel = new DefaultComboBoxModel();
		tillsList = new ArrayList<String>(); 
		try {
			FileInputStream fout = new FileInputStream("kasy_fiskalne.bin");
			ObjectInputStream stream = new ObjectInputStream(fout);
			model = (DefaultListModel<String>) stream.readObject();
			tillsList= Collections.list(model.elements());;
			for (Object c:tillsList) {
			defaultModel.addElement(c);
			}
		} catch (Exception e) {
			System.out.println(e);
		}		
		tillNr.setModel(defaultModel);
	}
	public void redrawList() {
		tillNr.removeAllItems();
		addTillsToComboBox();
	}

	public String getTillNr() {
		return tillNr.getSelectedItem()+"";
	}

	public String getTxtpnReciepeAdded() {
		return txtpnReciepeAdded.getText();
	}

	public String getTxtpnTillNr() {
		return txtpnTillNr.getText();
	}

	public String getReciepeNr() {
		return reciepeNr.getText();
	}
	
}
