import java.util.Scanner;

public class PowerFive {

	public static void main(String[] args) {
		int a;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number: ");
		a = scan.nextInt();
		int n,flag=0;
		int num;
		num=a;
		while(a>=5) {
			n=a%5;
			//System.out.println(n+"*");
			if(n==0) {
				a=a/5;
			}
			else {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+" is in power of 5.");
		}
		else {
			System.out.println(num+ " is NOT in power of 5. ");
		}

	}

}
