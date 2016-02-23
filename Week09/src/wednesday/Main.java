package wednesday;

public class Main {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new BlockingQueue<>();
		Integer[] queueElements = new Integer[]{
			1, 2, 3, 4, 5
		};
		(new Thread(new Producer<Integer>(queue, queueElements))).start();
		(new Thread(new Consumer<Integer>(queue))).start();

	}

}
