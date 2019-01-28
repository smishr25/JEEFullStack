
public class TryInFinally {
	public static void main(String[] args) {
		Object obj = null;
		int a=5,b=0,c;
		try {
			System.out.println(obj.toString());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception Handled.");
			System.out.println(e);
		}
		finally {
			System.out.println("I'm finally block.");
			try {
				//System.out.println(obj.toString());
				c=a/b;
			} catch (ArithmeticException er) {
				System.out.println("1. Arithmetic Exception Handled.");
				System.out.println(er);
			}
		}
	}

}
