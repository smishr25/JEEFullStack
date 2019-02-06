package com.capgemini.beans;

public class Country {

	private String countryName;
	private City city;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(String countryName, City city) {
		super();
		this.countryName = countryName;
		this.city = city;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [name=" + countryName + ", city=" + city + "]";
	}

}
