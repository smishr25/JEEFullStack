import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = s.nextInt();
		if(n==1 || n<0) {
			System.out.println("Prime Factors not possible.");
			System.exit(0);
		}
		System.out.print("Factors are: ");
		for (int i = 2; i < n; i++) {

			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
		if (n > 2) {
			System.out.print(n + " ");
		}
	}
}
