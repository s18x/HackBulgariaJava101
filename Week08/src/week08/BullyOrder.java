package week08;

public class BullyOrder {

	boolean a = false;
	boolean b = false;
	
	public synchronized void reset() {
		a = !a;
		b = !b;
	}
	
	public synchronized void observe() throws InterruptedException {
		boolean r1 = b;
		boolean r2 = a;
		
		Thread.sleep(10);
		
		boolean r3 = a;
		if (r2 != r3) {
			System.out.println(String.format("r1: %s r2: %s r3: %s", r1, r2, r3));
		}
	}
}
