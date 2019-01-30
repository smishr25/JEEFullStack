import java.util.Scanner;
import java.util.Arrays;

public class Lab3_8 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("Enter the string: ");
		str = s.nextLine();
		String[] s2 = str.split(" ");
		int len = s2.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (s2[i].compareTo(s2[j]) > 0) {
					String temp = s2[i];
					s2[i] = s2[j];
					s2[j] = temp;
				}
			}
		}
		if (len % 2 == 0) {
			for (int i = 0; i < len / 2; i++) {
				s2[i] = s2[i].toUpperCase();
			}
		} else {
			for (int i = 0; i < (len / 2) + 1; i++) {
				s2[i] = s2[i].toUpperCase();
			}

		}
		String s3 = "";
		for (int i = 0; i < len; i++) {
			s3 += s2[i];
			s3 += " ";
		}
		System.out.println("the output string is: " + s3);

	}

}
