package wednesday;

import java.util.ArrayList;

public class Task02 {

	public static <T> void reverse(ArrayList<T> collection) {
		int size = collection.size() - 1;
		ArrayList<T> reverse = new ArrayList<>(collection.size());
		for (int i = 0; i < collection.size(); i++) {
			reverse.add(collection.get(size));
			size--;
		}
		collection.clear();
		for (T t : reverse) {
			collection.add(t);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<>();
		list.add('a');
		list.add('b');
		list.add('c');
		System.out.println("The List: ");
		for (Character character : list) {
			System.out.print(character.toString() + " ");
		}
		reverse(list);
		System.out.println();
		System.out.println("The Reversed List: ");
		for (Character character : list) {
			System.out.print(character.toString() + " ");
		}
	}
}
