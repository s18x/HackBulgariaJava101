package week08;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	private static AtomicInteger c = new AtomicInteger(0);
	//private static int c = 0;

	public static void increment() {
		c.incrementAndGet();
		//c++;
	}

	public static void decrement() {
		c.decrementAndGet();
	}

	public static AtomicInteger getCounter() {
		return c;
	}

	/*public static int getCounter() {
		return c;
	}*/

}
