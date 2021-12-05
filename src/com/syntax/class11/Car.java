package com.syntax.class11;

public class Car {
	String make;
	String model;
	String color;
	int year;
	double milage;
	void moveForward() {
System.out.println("Car can move forward");
	}
	void applyBreaks() {
System.out.println("Applying breaks");
	}
	public static void main(String[] args) {
		
	Car ayshasCar=new Car();
	ayshasCar.make="Tesla";
	ayshasCar.model="S";
	ayshasCar.color="Black";
System.out.println("Aysha's car is "+ayshasCar.make);
System.out.println("Aysha's car is "+ayshasCar.model);
System.out.println("Aysha's car is "+ayshasCar.color);
ayshasCar.moveForward();
ayshasCar.applyBreaks();
}
}