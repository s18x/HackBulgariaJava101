package week10;

import java.util.concurrent.atomic.AtomicInteger;

public class Consumer implements Runnable {

	private CountOddNumbers<Integer> queue;
	private static AtomicInteger consumedElements;

	public Consumer(CountOddNumbers<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (!(consumedElements.addAndGet(0) == queue.getNumbers().size())) {
			Integer integer;
			if ((queue.getNumbers().get(queue.getNumbers().size() - 1) & 1) == 0) {
				 queue.getNumbers().get(queue.getNumbers().size() - 1);
			}
			consumedElements.incrementAndGet();
			notifyAll();
		}
	}

}
