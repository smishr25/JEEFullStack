import java.util.Scanner;

public class Lab3_7 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		boolean b;
		System.out.println("Enter Your Username: ");
		str=s.nextLine();
		int len=str.length();
		if(len>=12) {
			b=validUsername(str);
			if(b) {
				System.out.println("Username "+str+" is  valid!");
			}
		}else {
			System.out.println("Username "+str+" is not valid!");
		}
		
	}

	private static boolean validUsername(String str) {
		// TODO Auto-generated method stub
		int i = str.length() - 4, j = str.length();
		String s1 = str.substring(i, j);
		if (s1.compareTo("_job") == 0) {
			return true;
		}
		return false;
	}

}
