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

public class TillSManager {
	DefaultListModel<String> model;

	public TillSManager() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		model = new DefaultListModel<String>();
		readFile();
		JScrollPane scrollPane = new JScrollPane();
		JList tillList = new JList(model);
		JButton addTill = new JButton("Dodaj");
		JTextField putTill = new JTextField("");

		JButton removeTill = new JButton("Usuñ");
		JButton saveTill = new JButton("Zapisz");

		scrollPane.setViewportView(tillList);

		DefaultListSelectionModel m = new DefaultListSelectionModel();
		m.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		m.setLeadAnchorNotificationEnabled(false);
		tillList.setSelectionModel(m);

		addTill.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!putTill.getText().isEmpty()) {
					model.addElement(putTill.getText());
					tillList.repaint();
					putTill.setText("");
				}
			}
		});
		saveTill.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();

			}
		});
		removeTill.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 if (model.getSize() > 0)
			          model.removeElementAt(0);				
			}
		});
		frame.add(scrollPane);
		frame.add(putTill);
		frame.add(addTill);
		frame.add(removeTill);
		frame.add(saveTill);
		frame.pack();
	}
	public void readFile() {
		try {
			FileInputStream fout = new FileInputStream("kasy_fiskalne.bin");
			ObjectInputStream stream = new ObjectInputStream(fout);
			model = (DefaultListModel<String>) stream.readObject();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void saveFile() {
		try {
			FileOutputStream fout = new FileOutputStream("kasy_fiskalne.bin");
			ObjectOutputStream stream = new ObjectOutputStream(fout);
			stream.writeObject(model);
			fout.close();
			System.out.println("saved");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
