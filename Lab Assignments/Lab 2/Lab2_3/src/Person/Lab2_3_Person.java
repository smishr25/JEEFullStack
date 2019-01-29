package Person;

public class Lab2_3_Person {

		// TODO Auto-generated method stub
		String firstName;
		String lastName;
		char gender;
		
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
		
		public Lab2_3_Person() {
			
		}
		
		public Lab2_3_Person(String firstName, String lastName, char gender) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
		}
	


}
