package wednesday;

public class Consumer<T> implements Runnable {

	private BlockingQueue<T> queue;

	public Consumer(BlockingQueue<T> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		for (T i = queue.poll(); !(i == null); i = queue.poll()) {
			System.out.format("Integer Received: %d%n", i);
		}
	}

}
