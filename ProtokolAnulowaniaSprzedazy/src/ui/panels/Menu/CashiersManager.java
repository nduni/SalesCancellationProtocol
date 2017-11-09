package ui.panels.Menu;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JScrollPane;

public class CashiersManager {
	DefaultListModel<String> model;

	public CashiersManager() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		model = new DefaultListModel<String>();
		readFile();
		JScrollPane scrollPane = new JScrollPane();
		JList cashierList = new JList(model);
		JButton addCashier = new JButton("Dodaj");
		JTextField putCashier = new JTextField("");

		JButton removeCashier = new JButton("Usuñ");
		JButton saveCashiers = new JButton("Zapisz");

		scrollPane.setViewportView(cashierList);

		DefaultListSelectionModel m = new DefaultListSelectionModel();
		m.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		m.setLeadAnchorNotificationEnabled(false);
		cashierList.setSelectionModel(m);

		addCashier.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!putCashier.getText().isEmpty()) {
					model.addElement(putCashier.getText());
					cashierList.repaint();
					putCashier.setText("");
				}
			}
		});
		saveCashiers.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();

			}
		});
		removeCashier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 if (model.getSize() > 0)
			          model.removeElementAt(0);				
			}
		});
		frame.add(scrollPane);
		frame.add(putCashier);
		frame.add(addCashier);
		frame.add(removeCashier);
		frame.add(saveCashiers);
		frame.pack();
	}
	public void readFile() {
		try {
			FileInputStream fout = new FileInputStream("kasjerzy.bin");
			ObjectInputStream stream = new ObjectInputStream(fout);
			model = (DefaultListModel<String>) stream.readObject();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void saveFile() {
		try {
			FileOutputStream fout = new FileOutputStream("kasjerzy.bin");
			ObjectOutputStream stream = new ObjectOutputStream(fout);
			stream.writeObject(model);
			fout.close();
			System.out.println("saved");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
