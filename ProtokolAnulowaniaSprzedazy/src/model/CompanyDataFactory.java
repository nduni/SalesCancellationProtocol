package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CompanyDataFactory {

	public static Company parseFromFile(File file) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    
		CompanyAddress address = new CompanyAddress();
		Company company = new Company(address);
		company.setName(br.readLine());
		address.setStreet(br.readLine());
		address.setPostalCode(br.readLine());
		address.setCity(br.readLine());
		company.setNip(br.readLine());
		br.close();
		return company;
	}
	
}
