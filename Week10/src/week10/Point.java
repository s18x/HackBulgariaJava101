package week10;

public class Point {

	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.setX(x);
		this.setY(y);
	}

	public Point() {
		super();
		this.x = 0;
		this.y = 0;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		if (x < 0 || x > 10_000) {
			throw new IllegalArgumentException();
		}
		else {
			this.x = x;
		}
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		if (y < 0 || y > 10_000) {
			throw new IllegalArgumentException();
		}
		else {
			this.y = y;
		}
	}

	@Override
	public String toString() {
		return String.format("(%.2f, %.2f)", x, y);
	}

}
