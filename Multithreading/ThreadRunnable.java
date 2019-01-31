
public class ThreadRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside : " + Thread.currentThread().getName());

		System.out.println("Creating Runnable...");
		Runnable runnable = new ThreadRunnable();

		System.out.println("Creating Thread...");
		Thread thread = new Thread(runnable);

		System.out.println("Starting Thread...");
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Inside : " + Thread.currentThread().getName());
	}
}

