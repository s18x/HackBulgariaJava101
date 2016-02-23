package week05;

public final class Triangle {

	private final Point a;
	private final Point b;
	private final Point c;

	public Triangle(Point a, Point b, Point c) throws Exception {
		if (a.getX() == b.getX() && b.getX() == c.getX()) {
			throw new Exception("Points are on the same axis.");
		}
		else if (a.getY() == b.getY() && b.getY() == c.getY()) {
			throw new Exception("Points are on the same axis.");
		}
		if (a != null && b != null && c != null) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else {
			throw new Exception("No points set!");
		}
	}

	public Triangle(Triangle triangle) throws Exception {
		this(triangle.a, triangle.b, triangle.c);
	}

	public Point getPointA() {
		return a;
	}

	public Point getPointB() {
		return b;
	}

	public Point getPointC() {
		return c;
	}

	public LineSegment getLineAB() throws Exception {
		return new LineSegment(a, b);
	}

	public LineSegment getLineBC() throws Exception {
		return new LineSegment(b, c);
	}

	public LineSegment getLineCA() throws Exception {
		return new LineSegment(c, a);
	}

	public double base() throws Exception {
		return getLineAB().getLength();
	}

	public double height() throws Exception {
		double p = (getLineAB().getLength() + getLineBC().getLength() + getLineCA().getLength()) / 2;
		double area = Math.sqrt(p * (p - getLineAB().getLength()) * (p - getLineBC().getLength() * (p - getLineCA().getLength())));
		return 2 * area / getLineAB().getLength());
	}

}
