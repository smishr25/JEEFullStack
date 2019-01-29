import java.util.Scanner;
public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname,lname;
		char gen;
		int age;
		double weight;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Name: ");
		fname=s.nextLine();
		System.out.println("Enter Last Name: ");
		lname=s.nextLine();
		System.out.println("Enter Gender (M/F): ");
		gen=s.next().charAt(0);
		System.out.println("Enter Age: ");
		age=s.nextInt();
		System.out.println("Enter Weight: ");
		weight=s.nextDouble();
		System.out.println("First Name: "+fname+"\n");
		System.out.println("Last Name: "+lname+"\n");
		System.out.println("Gender: "+gen+"\n");
		System.out.println("Age: "+age+"\n");
		System.out.println("Weight: "+weight+"\n");
	}

}
/*OUTPUT
Enter First Name: 
Sushil
Enter Last Name: 
Singh
Enter Gender (M/F): 
M
Enter Age: 
22
Enter Weight: 
70
First Name: Sushil

Last Name: Singh

Gender: M

Age: 22

Weight: 70.0
*/