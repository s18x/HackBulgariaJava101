package com.hackbulgaria.warehouse.map;

public class OurCity {

	private String name;
	private final int[][] CITY = null;
	private Warehouse[] warehouses;

	public OurCity(String name, int[][] city, Warehouse[] warehouses) {
		super();
		this.setName(name);
		if (city.equals(null)) {
			throw new IllegalArgumentException("No City Map!");
		}
		else {
			System.arraycopy(city, 0, CITY, 0, city.length);
		}
		this.setWarehouses(warehouses);
	}

	public String getName() {
		String copy = this.name;
		return copy;
	}

	private void setName(String name) {
		if (name.equals(null)) {
			throw new IllegalArgumentException("No City Name!");
		}
		else if (name.isEmpty()) {
			throw new IllegalArgumentException("No City Name!");
		}
		else {
			this.name = name;
		}
	}

	public int[][] getCity() {
		int[][] copy = new int[CITY.length][CITY.length];
		System.arraycopy(CITY, 0, copy, 0, CITY.length);
		return copy;
	}

	public Warehouse[] getWarehouses() {
		return warehouses;
	}

	public void setWarehouses(Warehouse[] warehouses) {
		if (warehouses.equals(null)) {
			throw new IllegalArgumentException("No City Warehouses!");
		}
		else {
			this.warehouses = warehouses;
		}
	}

}
