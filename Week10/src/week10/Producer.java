package week10;

import java.util.concurrent.atomic.AtomicInteger;

public class Producer<T> implements Runnable {

	private CountOddNumbers<T> queue;
	private T element;
	private static AtomicInteger producedElements;

	public Producer(CountOddNumbers<T> queue, T element) {
		super();
		this.queue = queue;
		this.element = element;
	}

	@Override
	public void run() {
		while (!(producedElements.addAndGet(0) == queue.getNumbers().size())) {
			queue.getNumbers().add(element);
			producedElements.incrementAndGet();
			notifyAll();
		}
	}

}