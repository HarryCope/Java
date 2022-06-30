package com.qa.interit;

public class Car extends Vehicle {

	public Car() {
		super();
	}

	@Override
	public void sound() {
		System.out.println("car go vroom!");
	}

	public Car(String name, String colour, String brand, int numSeats, int topSpeed, int numWheels, int id) {
		super(name, colour, brand, numSeats, topSpeed, numWheels, id);
	}

	public void car() {
		System.out.println("car");
	}

}
