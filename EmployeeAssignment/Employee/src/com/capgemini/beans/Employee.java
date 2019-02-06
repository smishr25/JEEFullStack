package com.capgemini.beans;

public class Employee {

	

	private int id;
	private Address address;
	private String empName;

	public Employee(Address address, int id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
		this.address = address;
	}
	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + empName + ", address=" + address + "]";
	}

}
