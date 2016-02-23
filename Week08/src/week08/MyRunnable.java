package week08;

public class MyRunnable implements Runnable {

	private int _a;
	private int _b;

	public MyRunnable(int a , int b) {
		_a = a;
		_b = b;
	}

	@Override
	public void run() {

		System.err.println("I'm Runnable!" + "Divide: " + divide(_a, _b) + " Sum: " + sum(_a, _b) + " Product: " + product(_a, _b));
		
	}

	private double divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("No divide by ZERO!!!");
		}
		return a/b;
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int product(int a, int b) {
		return a * b;
	}

}
