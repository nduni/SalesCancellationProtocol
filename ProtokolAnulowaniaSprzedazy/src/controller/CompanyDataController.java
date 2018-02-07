package controller;

import java.io.File;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import model.Company;
import model.CompanyAddress;
import model.CompanyDataFactory;
import ui.panels.Menu.CompanyView;

public class CompanyDataController {

	CompanyView companyView;

	public CompanyDataController() {
	}

	public CompanyDataController(CompanyView companyView) {
		this.companyView = companyView;
	}

	public void readCompanyDataAndUpdateView() {

		try {
			File file = new File("company.txt");
			Company companyData = CompanyDataFactory.parseFromFile(file);
			updateCompanyView(companyData);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Nie ma zapisanych danych firmy");
			updateCompanyView(new Company());
		}
	}

	private void updateCompanyView(Company companyData) {
		companyView.getCompanyName().setText(companyData.getName());
		companyView.getCompanyNip().setText(companyData.getNip());
		CompanyAddress address = companyData.getAddress();
		companyView.getCompanyPostalCode().setText(address.getPostalCode());
		companyView.getCompanyCity().setText(address.getCity());
		companyView.getCompanyStreet().setText(address.getStreet());
	}
	public Company readCompanyData() {

		try {
			File file = new File("company.txt");
			Company companyData = CompanyDataFactory.parseFromFile(file);
			return companyData;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Nie ma zapisanych danych firmy");
			return new Company();
		}
	}
	


	public void saveFile() {
			try {
				PrintWriter pw = new PrintWriter("company.txt");
			      pw.println(companyView.getCompanyName().getText());
			      pw.println(companyView.getCompanyStreet().getText());
			      pw.println(companyView.getCompanyPostalCode().getText());
			      pw.println(companyView.getCompanyCity().getText());
			      pw.print(companyView.getCompanyNip().getText());
			      pw.close();
				
				JOptionPane.showMessageDialog(null, "Zapisano dane firmy");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Nie mo¿na zapisaæ danych firmy. Sprawd\u017a czy plik nie jest u¿ywany");
			}
		}
}
