import java.util.Scanner;

public class Lab3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showMenu();

	}

	private static void showMenu() {
		// TODO Auto-generated method stub
		String str;
		int ch;
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter a String: ");
		 str = s.nextLine();
		//str = "sushilsingh";
		System.out.println("1. Add the string to to itself");
		System.out.println("2. Replace odd positions with #");
		System.out.println("3. Remove duplicate characters in the String");
		System.out.println("4. Change odd characters to upper case");
		System.out.println("5. Exit");
		System.out.println("Enter your choice: ");
		ch = s.nextInt();
		switch (ch) {
		case 1:
			addString(str);
			break;
		case 2:
			replaceString(str);
			break;
		case 3:
			removeDuplicate(str);
			break;
		case 4:
			toUpper(str);
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("You Entered Wrong Choice!");
		}

	}

	private static void toUpper(String str) {
		// TODO Auto-generated method stub
		int len = str.length();
		String s1;
		char[] ch = str.toCharArray();
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] -= 32;
				}
			}
		}
		s1 = new String(ch);
		System.out.println("After changing odd positions to Upper, string is: " + s1);
	}

	private static void removeDuplicate(String str) {
		// TODO Auto-generated method stub
		int len = str.length();
		String s1 = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < len; i++) {
			if (ch[i] != '$') {
				s1 += ch[i];
				for (int j = i + 1; j < len; j++) {
					if (ch[i] == ch[j]) {
						ch[j] = '$';
					}
				}
			}

		}
		// s1 = new String(ch);
		System.out.println("After removing all duplicates, String is: " + s1);

	}

	private static void replaceString(String str) {
		// TODO Auto-generated method stub
		int len = str.length();
		String s1;
		char[] ch = str.toCharArray();
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {
				ch[i] = '#';
			}
		}
		s1 = new String(ch);
		System.out.println("After changing odd positions to #, string is: " + s1);

	}

	private static void addString(String str) {
		// TODO Auto-generated method stub
		str += str;
		System.out.println("After adding String to itself, string is: " + str);

	}

}
