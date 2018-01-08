package ui.panels.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Company {
	private JFrame mainFrame;
	private JTextField companyName;
	private JTextField companyStreet;
	private JTextField companyPostalCode;
	private JTextField companyCity;
	private JTextField companyNip;
	
	public Company(JFrame mainFrame) {
		this.mainFrame=mainFrame;
		createFrame();
	}

	private void createFrame() {
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
				
			}
		});

		mainFrame.setEnabled(false);
		
		JButton saveCompany = new JButton("Zapisz");
		
		saveCompany.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();

			}
		});
		
		JLabel lblName = new JLabel("Nazwa");
		frame.getContentPane().add(lblName);
		
		companyName = new JTextField();
		frame.getContentPane().add(companyName);
		companyName.setColumns(10);
		
		JLabel lblStreet = new JLabel("Ulica");
		frame.getContentPane().add(lblStreet);
		
		companyStreet = new JTextField();
		frame.getContentPane().add(companyStreet);
		companyStreet.setColumns(10);
		
		JLabel lbPostalCode = new JLabel("Kod pocztowy");
		frame.getContentPane().add(lbPostalCode);
		
		companyPostalCode = new JTextField();
		frame.getContentPane().add(companyPostalCode);
		companyPostalCode.setColumns(10);
		
		JLabel lblCity = new JLabel("Miasto");
		frame.getContentPane().add(lblCity);
		
		companyCity = new JTextField();
		frame.getContentPane().add(companyCity);
		companyCity.setColumns(10);
		
		JLabel lblNip = new JLabel("NIP");
		frame.getContentPane().add(lblNip);
		
		companyNip = new JTextField();
		frame.getContentPane().add(companyNip);
		companyNip.setColumns(10);
		
		
		readCompanyData();
		frame.getContentPane().add(saveCompany);
		frame.pack();
	}

	private void readCompanyData(){
		String[] list = new String[5];
		try {
			File file = new File("company.txt");
		    BufferedReader br = new BufferedReader(new FileReader(file));
		    
		    int x = 0;
		    for (String line = br.readLine(); line != null; line = br.readLine()) {
		    	list[x]= line;
		    	++x;
		    }
		    br.close();
		} catch (Exception e) {
			e.printStackTrace();
			;
		}
		companyName.setText(list[0]);
		companyStreet.setText(list[1]);
		companyPostalCode.setText(list[2]);
		companyCity.setText(list[3]);
		companyNip.setText(list[4]);
	}

	protected void saveFile() {
			try {
				PrintWriter pw = new PrintWriter("company.txt");
			      pw.println(companyName.getText());
			      pw.println(companyStreet.getText());
			      pw.println(companyPostalCode.getText());
			      pw.println(companyCity.getText());
			      pw.print(companyNip.getText());
			      pw.close();
				
				JOptionPane.showMessageDialog(null, "Zapisano dane firmy");
			} catch (Exception e) {
				e.printStackTrace();
				;
			}
		}
	}

