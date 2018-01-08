package ui.panels.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import ui.panels.ReciepeAndTillPanel;

public class TillManager {

	DefaultListModel<String> model;
	private ReciepeAndTillPanel reciepeAndTillPanel;
	private JFrame mainFrame;

	public TillManager(JFrame mainFrame, ReciepeAndTillPanel reciepeAndTillPanel) {
		this.reciepeAndTillPanel = reciepeAndTillPanel;
		this.mainFrame = mainFrame;
		JFrame frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {

				frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
				mainFrame.setEnabled(true);
				reciepeAndTillPanel.redrawList();
				reciepeAndTillPanel.revalidate();
				reciepeAndTillPanel.repaint();
			}
		});

		mainFrame.setEnabled(false);
		model = new DefaultListModel<String>();
		readFile();
		JScrollPane scrollPane = new JScrollPane();
		JList tillsList = new JList(model);
		JButton addTill = new JButton("Dodaj");
		JTextField putTill = new JTextField("");

		JButton removeTill = new JButton("Usuñ");
		JButton saveTill = new JButton("Zapisz");

		scrollPane.setViewportView(tillsList);

		DefaultListSelectionModel m = new DefaultListSelectionModel();
		m.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		m.setLeadAnchorNotificationEnabled(false);
		tillsList.setSelectionModel(m);

		addTill.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!putTill.getText().isEmpty()) {
					model.addElement(putTill.getText());
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
				if (model.getSize() > 0) {
					int selectedIndex = tillsList.getSelectedIndex();
					model.remove(selectedIndex);
				}
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
			FileOutputStream fot = new FileOutputStream("kasy_fiskalne.bin");
			ObjectOutputStream stream = new ObjectOutputStream(fot);
			stream.writeObject(model);
			fot.close();

			JOptionPane.showMessageDialog(null, "Zapisano");
		} catch (Exception e) {
			e.printStackTrace();
			;
		}
	}

}
