package Person;

import java.math.BigInteger;

public class Lab2_4_Person {
	String firstName;
	String lastName;
	char gender;
	String phone;

	public Lab2_4_Person() {

	}

	public Lab2_4_Person(String firstName, String lastName, char gender, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		//BigInteger b= BigInteger.valueOf(phone);
		this.phone = phone;
	}

	

}
