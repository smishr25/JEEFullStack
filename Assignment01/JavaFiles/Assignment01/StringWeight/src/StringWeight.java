import java.util.Scanner;

public class StringWeight {

	public static void main(String[] args) {
		String str1;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        String str2=str1.replaceAll("\\s+","");
        StringBuilder sb = new StringBuilder(str2);
        int pos=0,sum=0;
        for (int i = 0; i < sb.length(); i++) {
			char c=sb.charAt(i);
			if (Character.isUpperCase(c)) {
		        sb.setCharAt(i, Character.toLowerCase(c));
			}
			pos=sb.charAt(i)-'a'+1;
			
			sum+=pos;
			//System.out.println(pos);
		}
        System.out.println("Total weight of "+str1+" is: "+sum);

	}

}
