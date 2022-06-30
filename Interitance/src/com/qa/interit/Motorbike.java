package com.qa.interit;

public class Motorbike extends Vehicle {

	public Motorbike() {
		super();
	}

	public Motorbike(String name, String colour, String brand, int topSpeed, int numWheels, int id) {
		super(name, colour, brand, id, topSpeed, numWheels, id);
	}

	public void bike() {
		System.out.println("bike");
	}
}
