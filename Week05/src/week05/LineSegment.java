package week05;

public final class LineSegment  implements Comparable<LineSegment> {

	private final Point a;
	private final Point b;
	
	public LineSegment(Point a, Point b) throws Exception {
		if (a == null || b == null) {
			throw new IllegalArgumentException("Point A or Point B are NOT defined!");
		}
		if (a.equals(b)) {
			throw new Exception("Cannot create a line segment with zero length!");
		}
		this.a = a;
		this.b = b;
	}
	
	public LineSegment(LineSegment line) throws Exception {
		this(line.a, line.b);
	}

	Point getA() {
		return a;
	}

	Point getB() {
		return b;
	}
	
	public double getLength() {
		return (Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY())));
	}

	@Override
	public int hashCode() {
		int hash = 17;
	    hash = hash * 23 + a.hashCode();
	    hash = hash * 23 + b.hashCode();
	    return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineSegment other = (LineSegment) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

	@Override
	public int compareTo(LineSegment segment) {
		if (this.getLength() < segment.getLength()) {
			return -1;
		}
		else if (this.getLength() > segment.getLength()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d) -> (%d, %d)", a.getX(), a.getY(), b.getX(), b.getY());
	}

}
