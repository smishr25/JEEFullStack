import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len, n, r,sum = 0, num = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of n:");
		n = s.nextInt();

		long factorial = 1;
		sum = 0;
		num = n;
		while (num > 0) {
			factorial = 1;
			r = num % 10;
			num = num / 10;
			for (int j = 1; j <= r; ++j) {
				// factorial = factorial * i;
				factorial *= j;
			}
			sum += factorial;
			//System.out.println(sum);
		}
		if (sum == n) {
			System.out.print(n + " is a Strong Number");

		} else {
			System.out.print(n + " is not a Strong Number");
		}

	}

}
