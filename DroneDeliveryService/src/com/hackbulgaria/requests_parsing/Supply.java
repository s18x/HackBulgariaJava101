package com.hackbulgaria.requests_parsing;

import java.util.Calendar;

public class Supply {

	private final int ID;
	private Calendar timestamp;
	private Products[] products;

	public Supply(int iD, Calendar timestamp, Products[] products) {
		super();
		ID = iD;
		this.setTimestamp(timestamp);
		this.setProducts(products);
	}

	public Calendar getTimestamp() {
		Calendar copy = this.timestamp;
		return copy;
	}

	public void setTimestamp(Calendar timestamp) {
		if (timestamp.equals(null)) {
			throw new IllegalArgumentException("No Supply Timestamp!");
		}
		else {
			this.timestamp = timestamp;
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
		sb.append("Supply:\n").append("ID: " + ID + "\n").append("Time Stamp: " + timestamp.getTime().toString() + "\n").append("Products: ");
		for (int i = 0; i < products.length; i++) {
			sb.append(products[i].toString() + "\n\n");
		}
		return sb.toString();
	}

}
