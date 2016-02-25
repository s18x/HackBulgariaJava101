package com.hackbulgaria.requests.handling;

import java.util.concurrent.BlockingQueue;

public class Request<T> implements Runnable {

	private BlockingQueue<T> requestsQueue;
	private T request;

	public Request(BlockingQueue<T> queue, T request) {
		super();
		this.requestsQueue = queue;
		this.request = request;
	}

	@Override
	public void run() {
		while (request != null) {
			try {
				this.requestsQueue.put(request);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
