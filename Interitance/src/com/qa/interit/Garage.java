package com.qa.interit;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> garage = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		this.garage.add(v);
	}

	public void removeVehicle(Vehicle v) {
		this.garage.remove(v);
	}

	public void billGarage(ArrayList<Vehicle> i) {

		int bill;
		int price = 10;

		for (Vehicle v : i) {

			if (v instanceof Car) {
				bill = price * v.getId() * 2;
				System.out.println("The bill for the Car: " + v.getName() + " is £" + bill);
			} else if (v instanceof Motorbike) {
				bill = price * v.getId();
				System.out.println("The bill for the Motorbike: " + v.getName() + " is £" + bill);
			}
		}
	}

	public Vehicle findById(int id) {
		for (Vehicle v : this.garage) {
			if (v.getId() == id) {
				return v;
			}

		}
		return null;
	}
}
