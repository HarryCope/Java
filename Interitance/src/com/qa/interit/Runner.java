package com.qa.interit;

public class Runner {

	public static void main(String[] args) {

		Car g = new Car("Galaxy", "Silver", "Ford", 7, 90, 4, 103);
		g.car();
		g.sound();

		Car e = new Car("E-Type", "Green", "Jaguar", 2, 153, 4, 101);
		e.car();
		e.sound();

		Motorbike d = new Motorbike("Daytona", "Black", "Triumph", 130, 2, 102);
		d.bike();
		d.sound();

		Garage garage = new Garage();
		garage.addVehicle(g);
		garage.addVehicle(e);
		garage.addVehicle(d);

		garage.removeVehicle(g);

		garage.billGarage(garage.garage);

		Vehicle found = garage.findById(102);
		System.out.println(found.getName() + " " + found.getColour() + " " + found.getBrand());

	}

}
