import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your marks:");
        n = s.nextInt();
        if(n>=50) {
        	if(n>=60 && n<=74) {
        		System.out.println("You Passed with First Class.");
        	}
        	if(n>=75) {
        		System.out.println("You Passed with Distinction.");
        	}
        	else {
        		System.out.println("You Passed.");
        	}
        }
        else {
        	System.out.println("You are Fail.");
        }

	}

}
