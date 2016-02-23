package Task25;

final public class Pair<T> {

	final private T object1;
	final private T object2;

	public Pair(T object1, T object2) {
		this.object1 = object1;
		this.object2 = object2;
	}

	Object getObject1() {
		Object temp;
		temp = object1;
		return temp;
	}

	Object getObject2() {
		Object temp;
		temp = object1;
		return temp;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair<T> other = (Pair<T>) obj;
		if (object1 == null) {
			if (other.object1 != null)
				return false;
		} else if (!object1.equals(other.object1))
			return false;
		if (object2 == null) {
			if (other.object2 != null)
				return false;
		} else if (!object2.equals(other.object2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("First Object: %s \nSecond Object: %s", object1.toString(), object2.toString());
	}

	public static void main(String[] args) {
		Pair<Integer> pair1 = new Pair<Integer>(2, 3);
		Pair<Integer> pair2 = new Pair<Integer>(2, 3);
		System.out.println(pair1.equals(pair2));
		System.out.println(pair1.toString());
		System.out.println(pair2.toString());
	}

}
