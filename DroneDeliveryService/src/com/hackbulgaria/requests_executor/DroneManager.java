package com.hackbulgaria.requests_executor;

import com.hackbulgaria.requests_parsing.Delivery;

public class DroneManager {

	private OurCity city;
	private Delivery deliveryRequest;

	public DroneManager(OurCity city, Delivery deliveryRequest) {
		super();
		this.city = city;
		this.deliveryRequest = deliveryRequest;
	}

	public static double weightChek() {
		double deliveryWeight;
		return 0;
	}

}
