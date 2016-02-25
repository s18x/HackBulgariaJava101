package com.hackbulgaria.warehouse.map;

import com.hackbulgaria.requests.parsing.Address;

public class Warehouse {

	private String name;
	private Address warehouseAddress;

	public Warehouse(String name, Address warehouseAddress) {
		super();
		this.setName(name);
		this.setWarehouseAddress(warehouseAddress);
	}

	public String getName() {
		String copy = this.name;
		return copy;
	}

	private void setName(String name) {
		if (name.equals(null)) {
			throw new IllegalArgumentException("No Warehouse Name!");
		}
		else if (name.isEmpty()) {
			throw new IllegalArgumentException("No Warehouse Name!");
		}
		else {
			this.name = name;
		}
	}

	public Address getWarehouseAddress() {
		Address copy = this.warehouseAddress;
		return copy;
	}

	public void setWarehouseAddress(Address warehouseAddress) {
		if (warehouseAddress.equals(null)) {
			throw new IllegalArgumentException("No Warehouse Address!");
		}
		else {
			this.warehouseAddress = warehouseAddress;
		}
	}

}
