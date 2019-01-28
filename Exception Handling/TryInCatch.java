
public class TryInCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = null;
		int a = 5, b = 0, c;
		try {
			System.out.println(obj.toString());
		} catch (NullPointerException e) {

			try {
				c = a / b;
			} catch (ArithmeticException er) {
				System.out.println("1. Arithmetic Exception Handled.");
				System.out.println(er);
			}
			System.out.println("2. Null Pointer Exception Handled.");
			System.out.println(e);
		}

	}

}
