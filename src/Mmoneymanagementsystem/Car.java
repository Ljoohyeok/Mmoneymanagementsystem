package Mmoneymanagementsystem;

public class Car {
	int year;
	String maker;
	int speed;
	
	public Car() {
		
	}
	
	public Car(int year, String maker, int speed) {
		this.year = year;
		this.maker = maker;
		this.speed = speed;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public int getSpeed() {
		return speed;
	}
}
