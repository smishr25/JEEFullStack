import java.util.Scanner;

public class MaximumOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter String : ");
        str1 = scan.nextLine();
        StringBuilder sb = new StringBuilder(str1);

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
				System.out.println((char)(i+97)+"="+myArray[i]);
			}
		}
	}

}
