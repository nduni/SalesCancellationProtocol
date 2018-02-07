package ui.panels.Menu;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.CompanyDataController;

public class CompanyView {
	private JFrame mainFrame;
	private JTextField companyName;
	private JTextField companyStreet;
	private JTextField companyPostalCode;
	private JTextField companyCity;
	private JTextField companyNip;
	private CompanyDataController companyDataController;
	private JFrame frame;
	
	public CompanyView(JFrame mainFrame) {
		this.setMainFrame(mainFrame);
		createFrame();
	}

	private void createFrame() {
		setFrame(new JFrame());
		companyDataController = new CompanyDataController(this);
		getFrame().setLocationRelativeTo(null);
		getFrame().setVisible(true);
		getFrame().getContentPane().setLayout(new BoxLayout(getFrame().getContentPane(), BoxLayout.Y_AXIS));
		getFrame().setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		CompanyViewListener companyViewListener = new CompanyViewListener(this);
		getFrame().addWindowListener(companyViewListener);
		getMainFrame().setEnabled(false);
		JButton saveCompany = new JButton("Zapisz");
		saveCompany.addActionListener(companyViewListener);
		JLabel lblName = new JLabel("Nazwa");
		getFrame().getContentPane().add(lblName);
		companyName = new JTextField();
		getFrame().getContentPane().add(companyName);
		companyName.setColumns(10);
		JLabel lblStreet = new JLabel("Ulica");
		getFrame().getContentPane().add(lblStreet);
		companyStreet = new JTextField();
		getFrame().getContentPane().add(companyStreet);
		companyStreet.setColumns(10);
		JLabel lbPostalCode = new JLabel("Kod pocztowy");
		getFrame().getContentPane().add(lbPostalCode);
		companyPostalCode = new JTextField();
		getFrame().getContentPane().add(companyPostalCode);
		companyPostalCode.setColumns(10);
		JLabel lblCity = new JLabel("Miasto");
		getFrame().getContentPane().add(lblCity);
		companyCity = new JTextField();
		getFrame().getContentPane().add(companyCity);
		companyCity.setColumns(10);
		JLabel lblNip = new JLabel("NIP");
		getFrame().getContentPane().add(lblNip);
		companyNip = new JTextField();
		getFrame().getContentPane().add(companyNip);
		companyNip.setColumns(10);
				
		companyDataController.readCompanyDataAndUpdateView();
		getFrame().getContentPane().add(saveCompany);
		getFrame().pack();
	}


	public JTextField getCompanyName() {
		return companyName;
	}

	public void setCompanyName(JTextField companyName) {
		this.companyName = companyName;
	}

	public JTextField getCompanyStreet() {
		return companyStreet;
	}

	public void setCompanyStreet(JTextField companyStreet) {
		this.companyStreet = companyStreet;
	}

	public JTextField getCompanyPostalCode() {
		return companyPostalCode;
	}

	public void setCompanyPostalCode(JTextField companyPostalCode) {
		this.companyPostalCode = companyPostalCode;
	}

	public JTextField getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(JTextField companyCity) {
		this.companyCity = companyCity;
	}

	public JTextField getCompanyNip() {
		return companyNip;
	}

	public void setCompanyNip(JTextField companyNip) {
		this.companyNip = companyNip;
	}

	public JFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(JFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public CompanyDataController getCompanyDataController() {
		return companyDataController;
	}

	public void setCompanyDataController(CompanyDataController companyDataController) {
		this.companyDataController = companyDataController;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	}

