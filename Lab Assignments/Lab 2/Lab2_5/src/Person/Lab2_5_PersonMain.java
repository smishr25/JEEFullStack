package Person;

public class Lab2_5_PersonMain {

	public void Details() {
		Lab2_5_Person p1 = new Lab2_5_Person("Sushil", "Singh", Gender.M, "9514236521");
		System.out.println("First Name: " + p1.getFirstName() + "\n");
		System.out.println("Last Name: " + p1.getLastName() + "\n");
		System.out.println("Gender: " + p1.getGender() + "\n");
		System.out.println("Phone: " + p1.getPhone() + "\n");

	}
	public enum Gender{
		M,F;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab2_5_PersonMain p = new Lab2_5_PersonMain();

		p.Details();
	
	}

}
