package Mmoneymanagementsystem;

import java.util.Scanner;

public class CarSimulation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VehicleCar vehiclecar = new VehicleCar(input);
		int num = 0;
		
		while (num != 5) {
			System.out.println("1. Year of creation of car");
	        System.out.println("2. Car maker");
	       	System.out.println("3. Car speed");
	       	System.out.println("4. Referance Simulating");
	       	System.out.println("5. Exit");
	       	num = input.nextInt();
		    
	       	if(num == 1) {
	       		vehiclecar.getYear();
	       	}
        	else if(num == 2) {	        		
        		vehiclecar.getMake();
	       	}
	       	else if(num == 3) {
	       		vehiclecar.getSpeed();
	       	}
	       	else if(num == 4) {
	       		vehiclecar.Simulating();
	       	}
		}
	}
}
