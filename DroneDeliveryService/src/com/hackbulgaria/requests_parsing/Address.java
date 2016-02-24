package com.hackbulgaria.requests_parsing;

public class Address {

	private int xCoordinate;
	private int yCoordinate;

	public Address(int xCoordinate, int yCoordinate) {
		super();
		this.setxCoordinate(xCoordinate);
		this.setyCoordinate(yCoordinate);
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		if (xCoordinate < 0) {
			throw new IllegalArgumentException("Wrong Address Coordinates!");
		}
		else {
			this.xCoordinate = xCoordinate;
		}
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		if (yCoordinate < 0) {
			throw new IllegalArgumentException("Wrong Address Coordinates!");
		}
		else {
			this.yCoordinate = yCoordinate;
		}
	}

	@Override
	public String toString() {
		return String.format("Address at: (%d, %d)", xCoordinate, yCoordinate);
	}

}
