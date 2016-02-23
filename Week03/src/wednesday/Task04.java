package wednesday;

import java.util.ArrayList;
import java.util.Collection;

public class Task04<T> {

	private Collection<T> collection = new ArrayList<>();
	private int rotateStep;
	
	public Task04(Collection<T> collection, int rotateStep) {
		Object[] temp = new Object[collection.size()];
		for (T t : collection) {
			for (int i = 0; i < temp.length; i++) {
				this.collection.add((T)temp[i]);
			}
		}
		this.rotateStep = rotateStep;
	}
	
	static <T> void rotate(Collection<T> collection, int rotateStep) {
		Object[] coll = new Object[collection.size()];
		collection.toArray(coll);
		Collection<T> temp = new ArrayList<>();
		int size = collection.size();
		rotateStep %= size;
		if (rotateStep < 0) {
			rotateStep += size;
		}
		for (int i = rotateStep; i < size + rotateStep; i++) {
			temp.add((T)coll[i % size]);
		}
		collection.clear();
		for (T t : temp) {
			collection.add(t);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> collection = new ArrayList<>();
		collection.add("One");
		collection.add("Two");
		collection.add("Three");
		collection.add("Four");
		collection.add("Five");
		collection.add("Six");
		collection.add("Seven");
		int rotateStep = -3;
		Task04<String> t = new Task04<>(collection, rotateStep);
		for (String string : collection) {
			System.out.print(string + " ");
		}
		t.rotate(collection, rotateStep);
		System.out.println();
		for (String string : collection) {
			System.out.print(string + " ");
		}
	}
}
