
public class ThreadExtend extends Thread {
	// run() method contains the code that is executed by the thread.
    @Override
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating thread...");
        Thread thread = new ThreadExtend();

        System.out.println("Starting thread...");
        thread.start();

	}

}
