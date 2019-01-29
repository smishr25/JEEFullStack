package Person;

public class Lab2_4_PersonMain {

	public void addDetails() {
		Lab2_4_Person p1 = new Lab2_4_Person();
		p1.setFirstName("Sushil");
		p1.setLastName("Singh");
		p1.setGender('M');
		p1.setPhone("9854121354");
	}

	public void showDetails() {
		Lab2_4_Person p1 = new Lab2_4_Person("Sushil", "Singh", 'M', "9514236521");
		System.out.println("First Name: " + p1.getFirstName() + "\n");
		System.out.println("Last Name: " + p1.getLastName() + "\n");
		System.out.println("Gender: " + p1.getGender() + "\n");
		System.out.println("Gender: " + p1.getPhone() + "\n");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab2_4_PersonMain p = new Lab2_4_PersonMain();

		p.addDetails();
		p.showDetails();

	}

}
