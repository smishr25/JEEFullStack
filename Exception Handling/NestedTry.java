
public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj = null;
		int a=5,b=0,c;
		try {
			//System.out.println(obj.toString());
			/* If you write this statement here then only Null Pointer will be handled 
			 * as it is not going in nested try block*/	
			try {
				//System.out.println(obj.toString());
				c=a/b;
			} catch (ArithmeticException er) {
				System.out.println("1. Arithmetic Exception Handled.");
				System.out.println(er);
			}
			System.out.println(obj.toString());
			/*Writing this statement here will print both the exceptions*/
		} catch (NullPointerException e) {
			System.out.println("2. Null Pointer Exception Handled.");
			System.out.println(e);
		}
	}

}
