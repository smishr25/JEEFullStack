import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		String str1;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        String str2=str1.replaceAll("\\s+","");
        StringBuilder sb = new StringBuilder(str2);

        int[] myArray= new int[26];
        int pos=0;
        //char[] char1 = str1.toCharArray();
		for (int i = 0; i < sb.length(); i++) {
			char c=sb.charAt(i);
			if (Character.isUpperCase(c)) {
		        sb.setCharAt(i, Character.toLowerCase(c));
			}
			pos=sb.charAt(i)-'a';
			//System.out.println(pos);
			myArray[pos]+=1;
		}
		int c=0;
		for(int i=0;i<26;i++) {
			if(myArray[i]!=0) {
				c+=1;
			}
		}
		if(c==26) {
			System.out.println("Given string is Pangram");
		}
		else {
			System.out.println("Given string is NOT Pangram");
		}
	}

}
