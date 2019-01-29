
public class Lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = Integer.parseInt(args[0]);
		if (n > 0) {
			System.out.println(args[0] + " is a Positive Number.");
		} else if (n < 0) {
			System.out.println(args[0] + " is a Negative Number.");
		}
		else {
			System.out.println("You have entered zero.");
		}
	}

}
/*
OUTPUT
3 is a Positive Number.

-3 is a Negative Number.

You have entered zero.
*/