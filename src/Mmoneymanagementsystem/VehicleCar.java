package Mmoneymanagementsystem;

import java.util.Scanner;

public class VehicleCar {
	Car car = new Car(2020, "Hyundai", 150);
	Scanner input;
	VehicleCar(Scanner input) {
		this.input = input;
	}
	
	public void getYear() {
		System.out.println("Year of creation of car : " + car.getYear());
		System.out.println();
	}
	
	public void getMake() {
		System.out.println("Car maker : " + car.getMaker());
		System.out.println();
	}
	
	public void getSpeed() {
		System.out.println("Car speed : " + car.getSpeed());
		System.out.println();
	}
	
	public void Simulating() {
		System.out.println("Year of creation of car : " + car.getYear());
		System.out.println("Car maker : " + car.getMaker());
		System.out.println("Car speed : " + car.getSpeed());
		System.out.println();
	}

}
