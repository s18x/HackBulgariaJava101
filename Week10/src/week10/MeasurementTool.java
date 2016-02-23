package week10;

import java.util.LinkedList;
import java.util.Queue;

public class MeasurementTool<T> {

	private Queue<T> queue;
	private static int maxSize;

	public MeasurementTool(int maxSize) {
		queue = new LinkedList<>();
		this.maxSize = maxSize;
	}

	public synchronized T poll() {
		
		while(queue.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notifyAll();
		return queue.remove();
	}

	public synchronized void put(T element) {
		while(queue.size() == maxSize) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		queue.add(element);
		notifyAll();
	}

}