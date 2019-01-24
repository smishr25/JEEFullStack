import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
        String str1,str2;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        str2 = scan.nextLine();
        
        char[] char1 = str1.toCharArray();
        Arrays.sort(char1);
        String sort1 = new String(char1);
        char[] char2 = str2.toCharArray();
        Arrays.sort(char2);
        String sort2 = new String(char2);
        
        if(sort1.equals(sort2)) {
        System.out.println(str1+" and "+str2+" are Anagrams");
        }
        else
        {
            System.out.println(str1+" and "+str2+" are NOT Anagrams");
        }
        		
	}

}
