import java.util.Scanner;

public class PangramDetector {

	static String findMissingLetters(char[] a) {
		int[] myArray= new int[26];
        int pos=0;
        //char[] char1 = str1.toCharArray();
		for (int i = 0; i < a.length; i++) {
			char c=a[i];
			pos=c-'a';
			//System.out.println(pos);
			myArray[pos]+=1;
		}
		int c=0;
		String b="";
		for(int i=0;i<26;i++) {
			if(myArray[i]==0) {
				b+=(char)(i+97);
				b+=" ";	
				
			}
		}
		return (b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        String str2=str1.replaceAll("\\s+","");
        char[] st=str2.toCharArray();
        System.out.println("Missing Letters = " + findMissingLetters(st));

	}

}
