package week08;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println(Counter.getCounter());
		System.out.println("Hellow to you too!");
		MyRunnable runnable = new MyRunnable(4, 2);
		Thread thread3 = new Thread(runnable);
		thread3.start();
		System.out.println("LOL I'm Not I'm a MAIN Thread!");
		ThreadVisibility thread4 = new ThreadVisibility();
		thread4.start();
		Thread.sleep(1000);
		thread4.setToFalse();
		System.out.println("keepRunning is false");
	}
}
