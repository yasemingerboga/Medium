
public class Main {

	public static void main(String[] args) {

		// Thread class which implements Runnable interface
		ThreadDemoImplementsRunnable threadDemoImplementsRunnable = new ThreadDemoImplementsRunnable();

		// You should create thread object with class that we create.
		// NOTE THAT: Thread class implements Runnable and it contains the
		// start() method inside, which is not available in the class we created.
		Thread thread = new Thread(threadDemoImplementsRunnable);

		// After that thread should start
		thread.start();

		// Demo Thread class which extends the Thread class
		ThreadDemoExtendsThread threadDemoExtendsThread = new ThreadDemoExtendsThread();

		// Because of our class extends Thread class, it contains start() method.
		// So, we should start the thread.
		threadDemoExtendsThread.start();
	}
}