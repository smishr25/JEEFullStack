package com.capgemini.beans;

public class City {

	private String cityName;

	public City(String cityName) {
		super();
		this.cityName = cityName;
	}

	public City() {
		// TODO Auto-generated constructor stub
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City [name=" + cityName + "]";
	}

}
