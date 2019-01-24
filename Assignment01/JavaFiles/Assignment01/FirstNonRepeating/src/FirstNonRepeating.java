import java.util.Scanner;

public class FirstNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int flag = 0;
		String sb;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String: ");
		input = s.nextLine();
		String[] words = input.split(" ");
		// System.out.println(words[0]);
		for (int i = 0; i < words.length; i++) {
			flag = 0;
			sb = words[i];

			for (int j = 0; j < sb.length(); j++) {
				flag = 0;
				if (sb.charAt(j) >= 'a' && sb.charAt(j) <= 'z') {
					for (int k = j + 1; k < sb.length(); k++) {
						if (sb.charAt(j) == sb.charAt(k)) {
							//System.out.println(sb.charAt(j) + " * " + sb.charAt(k));
							flag = 1;
							sb = sb.replace(sb.charAt(k), '-');
							//System.out.println(sb);
						}
					}
					if (flag == 0) {
						System.out.print(words[i].charAt(j) + "  ");
						break;
					}
				}
			}

		}

	}
}