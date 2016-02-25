package com.hackbulgaria.requests.handling;

import java.util.Calendar;
import java.util.concurrent.BlockingQueue;

import com.hackbulgaria.requests.parsing.Delivery;

public class Drone<T> implements Runnable {

	private BlockingQueue<T> requestsQueue;
	private Delivery delivery;
	private int weightCapacity;
	private int batteryUnit;
	private int chargingRate;
	private Calendar estimatedTimeOfArrival;

	public Drone(BlockingQueue<T> queue, int weightCapacity, int batteryUnit, int chargingRate) {
		super();
		this.requestsQueue = queue;
		this.setWeightCapacity(weightCapacity);
		this.setBatteryUnit(batteryUnit);
		this.setChargingRate(chargingRate);
	}

	public int getWeightCapacity() {
		return weightCapacity;
	}

	public void setWeightCapacity(int weightCapacity) {
		if (weightCapacity <= 0) {
			throw new IllegalArgumentException("Drone Capacity Not Valid!");
		}
		else {
			this.weightCapacity = weightCapacity;
		}
	}

	public int getBatteryUnit() {
		return batteryUnit;
	}

	public void setBatteryUnit(int batteryUnit) {
		if (batteryUnit <= 0) {
			throw new IllegalArgumentException("Drone Battery Unit Not Valid!");
		}
		else {
			this.batteryUnit = batteryUnit;
		}
	}

	public int getChargingRate() {
		return chargingRate;
	}

	public void setChargingRate(int chargingRate) {
		if (chargingRate <= 0) {
			throw new IllegalArgumentException("Drone Charging Rate Not Valid!");
		}
		else {
			this.chargingRate = chargingRate;
		}
	}

	private boolean weightCheck() {
		double deliveryWeight = 0;
		for (int i = 0; i < delivery.getProducts().length; i++) {
			deliveryWeight += delivery.getProducts()[i].sumOfWeight();
		}
		return (weightCapacity > deliveryWeight);
	}

	private int distanceCalculator() {
		Double distance = Math.sqrt((42 - delivery.getAdresCoordinates().getxCoordinate()) * (42 - delivery.getAdresCoordinates().getxCoordinate())
				+ (42 - delivery.getAdresCoordinates().getyCoordinate()) * (42 - delivery.getAdresCoordinates().getyCoordinate()));
		return distance.intValue() * 2;
	}

	private int timetoLoadUnload() {
		int items = 0;
		for (int i = 0; i < delivery.getProducts().length; i++) {
			items += delivery.getProducts()[i].getQuantity();
		}
		return items * 2;
	}

	private int timeToCharge() {
		int timeToCharge = (batteryUnit - distanceCalculator()) / chargingRate;
		if (timeToCharge < 1) {
			return 1;
		}
		else {
			return timeToCharge;
		}
	}

	private Calendar calculateETA() {
		estimatedTimeOfArrival = delivery.getTimestamp();
		estimatedTimeOfArrival.add(Calendar.MINUTE, distanceCalculator() + timetoLoadUnload());
		return estimatedTimeOfArrival;
	}

	@Override
	public void run() {
		for (T i = requestsQueue.poll(); !(i == null); i = requestsQueue.poll()) {
			this.delivery = (Delivery) i;
			System.out.format("The estimated time of arrival is: %s\n", calculateETA().getTime().toString());
		}
	}

}
