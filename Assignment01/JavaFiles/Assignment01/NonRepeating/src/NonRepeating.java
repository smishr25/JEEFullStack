import java.util.Scanner;

public class NonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int flag = 0;
		char sb;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String: ");
		input = s.nextLine();
		char[] words = input.toCharArray();
		// System.out.println(words.length);
		for (int i = 0; i < words.length; i++) {
			if (words[i] >= 'a' && words[i] <= 'z') {
				sb = words[i];
				flag=0;
				//System.out.println(sb+"*");
				for (int j = i+1 ; j < words.length; j++) {
					if (words[j] >= 'a' && words[j] <= 'z') {
						//System.out.println(words[j]+"//");
						if (sb == words[j]) {
							//System.out.println(words[i] + " * " + words[j]);
							flag = 1;
							words[j] = '-';
							
						}
					}
					
				}
				if (flag == 0) {
					System.out.print(sb + "  ");
					break;
				}
			}
		}
		// System.out.println(words);

	}
}
