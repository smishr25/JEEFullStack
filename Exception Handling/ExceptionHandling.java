
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj = null;
		try {
			System.out.println(obj.toString());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception Handled.");
			System.out.println(e);
		}
	}

}
