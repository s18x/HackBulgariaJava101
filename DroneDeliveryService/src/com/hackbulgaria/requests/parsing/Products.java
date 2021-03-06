package com.hackbulgaria.requests.parsing;

public class Products {

	private String name;
	private double weightPerUnit;
	private int quantity;

	public Products(String name, double weightPerUnit, int quantity) {
		super();
		this.setName(name);
		this.setWeightPerUnit(weightPerUnit);
	}

	public String getName() {
		String copy = this.name;
		return copy;
	}

	public void setName(String name) {
		if (name.equals(null)) {
			throw new IllegalArgumentException("No Product Name!");
		}
		else if (name.isEmpty()) {
			throw new IllegalArgumentException("No Product Name!");
		}
		else {
			this.name = name;
		}
	}

	public double getWeightPerUnit() {
		return weightPerUnit;
	}

	public void setWeightPerUnit(double weightPerUnit) {
		if (weightPerUnit <= 0) {
			throw new IllegalArgumentException("Product Weight Not Specified!");
		}
		else {
			this.weightPerUnit = weightPerUnit;
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity <= 0) {
			throw new IllegalArgumentException("Product Quantity Not Specified!");
		}
		else {
			this.quantity = quantity;
		}
	}

	public double sumOfWeight() {
		return this.weightPerUnit * this.quantity;
	}

	@Override
	public String toString() {
		return String.format("Product:\nname: %s\nWeight per unit: %.2f\nQuantity: %d", this.name, this.weightPerUnit, this.quantity);
	}

}
