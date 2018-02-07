package model;

public class Company {

	String nip;
	String name;
	CompanyAddress address;

	public Company() {
		this.address = new CompanyAddress();
	}

	public Company(CompanyAddress address) {
		this.address = address;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CompanyAddress getAddress() {
		return address;
	}

	public void setAddress(CompanyAddress address) {
		this.address = address;
	}

}
