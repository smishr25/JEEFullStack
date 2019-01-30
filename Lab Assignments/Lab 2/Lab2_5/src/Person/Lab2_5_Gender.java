package Person;

public enum Lab2_5_Gender {
	Male('M'),
	Female('F');	
	private char gender;
	Lab2_5_Gender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
