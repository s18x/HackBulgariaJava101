package com.hackbulgaria.requests_parsing;

public class Delivery {

	private final int ID;
	private String timestamp;
	private Address addressCoordinates;
	private Products[] products;

	public Delivery(int iD, String timestamp, Address addressCoordinates, Products[] products) {
		super();
		ID = iD;
		this.setTimestamp(timestamp);
		this.setProducts(products);
	}

	public String getTimestamp() {
		String copy = this.timestamp;
		return copy;
	}

	public void setTimestamp(String timestamp) {
		if (timestamp.equals(null)) {
			throw new IllegalArgumentException("No Supply Timestamp!");
		}
		else if (timestamp.isEmpty()) {
			throw new IllegalArgumentException("No Supply Timestamp!");
		}
		else {
			this.timestamp = timestamp;
		}
	}

	public Address getAdresCoordinates() {
		Address copy = this.addressCoordinates;
		return copy;
	}

	public void setAdresCoordinates(Address adresCoordinates) {
		if (adresCoordinates.equals(null)) {
			throw new IllegalArgumentException("No Supply Address!");
		}
		else {
			this.addressCoordinates = adresCoordinates;
		}
	}

	public Products[] getProducts() {
		Products[] copy = new Products[products.length];
		System.arraycopy(products, 0, copy, 0, products.length);
		return copy;
	}

	public void setProducts(Products[] products) {
		if (products.equals(null)) {
			throw new IllegalArgumentException("No Supply Products!");
		}
		else {
			System.arraycopy(products, 0, this.products, 0, products.length);
		}
	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Supply:\n").append("ID: " + ID + "\n").append("Time Stamp: " + timestamp + "\n").append("Address: " + addressCoordinates + "\n").append("Products: \n");
		for (int i = 0; i < products.length; i++) {
			sb.append(products[i].toString() + "\n\n");
		}
		return sb.toString();
	}

}
