package com.qa.interit;

public class Vehicle {

	private String name;
	private String colour;
	private String brand;
	private int numSeats;
	private int topSpeed;
	private int numWheels;
	private int id;

	public Vehicle() {
		super();
	}

	public Vehicle(String name, String colour, String brand, int numSeats, int topSpeed, int numWheels, int id) {
		super();
		this.name = name;
		this.colour = colour;
		this.brand = brand;
		this.numSeats = numSeats;
		this.topSpeed = topSpeed;
		this.numWheels = numWheels;
		this.id = id;
	}

	public void sound() {
		System.out.println("vroom!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
