package com.capgemini.beans;

public class Address {

	private Country country;
	private String addressLine;

	public Address(Country country, String addressLine) {
		super();
		this.addressLine = addressLine;
		this.country = country;

	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [name=" + addressLine + ", country=" + country + "]";
	}

}
