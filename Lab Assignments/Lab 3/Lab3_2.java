import java.util.Scanner;

public class Lab3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		boolean b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		str = s.nextLine();
		b = checkString(str);
		if (b) {
			System.out.println("The given string is positive.");
		} else {
			System.out.println("The given string is NOT positive.");
		}
	}

	private static boolean checkString(String str) {
		// TODO Auto-generated method stub
		char[] c = str.toCharArray();
		int v = 0, j;
		for (int i = 0; i < c.length - 1; i++) {
			j = i + 1;
			if ((int) c[i] < (int) c[j]) {
				v += 1;
			}
			else {
				break;
			}
		}
		if (v == c.length - 1) {
			return true;
		}
		return false;
	}

}
