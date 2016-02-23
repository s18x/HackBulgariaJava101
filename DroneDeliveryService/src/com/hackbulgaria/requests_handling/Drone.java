package com.hackbulgaria.requests_handling;

import java.util.concurrent.BlockingQueue;

public class Drone<T> implements Runnable {

	private BlockingQueue<T> requestsQueue;

	public Drone(BlockingQueue<T> queue) {
		super();
		this.requestsQueue = queue;
	}

	@Override
	public void run() {
		for (T i = requestsQueue.poll(); !(i == null); i = requestsQueue.poll()) {
			System.out.format("Delivery Received: %d%n", i);
		}
	}

}
