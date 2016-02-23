package homework09;

public class ListTest {

	public static void main(String[] args) {

		List list = new List();
		for (int i = 0; i < 10; i++) {
			list.insertAtFront(i);
		}
		System.out.println(list.size());
		System.out.println(list.toString());
	}
}
