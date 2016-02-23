package wednesday;

import java.util.Collection;

public class Task03<T> {

	private Collection<T> collection;
	
	public void add(T object) {
		if (collection.add(object)) {
			collection.add(object);
		}
		else {
			collection.remove(object);
		}
	}
}
