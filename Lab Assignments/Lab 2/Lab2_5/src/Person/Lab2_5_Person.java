package Person;

import Person.Lab2_5_PersonMain.Gender;

public class Lab2_5_Person {

	String firstName;
	String lastName;
	Gender gender;
	
	String phone;

	public Lab2_5_Person() {
		super();
	}

	public Lab2_5_Person(String firstName, String lastName, Gender gender, String phone) {
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
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
