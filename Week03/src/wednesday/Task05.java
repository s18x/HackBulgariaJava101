package wednesday;

import java.util.ArrayList;
import java.util.Collection;

public class Task05<T> {

	public static <T> T firstUnique(Collection<T> collection) {
		Object[] collectionArray = new Object[collection.size()];
		collection.toArray(collectionArray);
		boolean isUnique = true;
		for (int i = 0; i < collectionArray.length; i++) {
			isUnique = true;
			for (int j = 0; j < collectionArray.length; j++) {
				if (i == j) {
					continue;
				}
				if (collectionArray[i] == collectionArray[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				return (T)collectionArray[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Collection<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.add(4);
		ints.add(5);
		ints.add(5);
		ints.add(4);
		ints.add(3);
		ints.add(1);
		for (Integer integer : ints) {
			System.out.print(Integer.toString(integer) + " ");
		}
		System.out.println();
		System.out.println(firstUnique(ints));

	}
	
}
