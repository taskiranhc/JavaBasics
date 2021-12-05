package com.syntax.class17;

public class Car {

	private String name;
	private String make;
	private String model;
	private String color;
	private int year;
	private int engineCC;
	private String VIN;
	private int milage;
	private int maxSpeed;
	private boolean sunroof;

	public Car(String carName, String carMake, String carModel, String carColor, int carYear, int carEngine,
			String carVIN, int carMilage, int carMaxSpeed, boolean SunRoof) {

		name = carName;
		make = carMake;
		model = carModel;
		color = carColor;
		year = carYear;
		engineCC = carEngine;
		VIN = carVIN;
		milage = carMilage;
		maxSpeed = carMaxSpeed;
		sunroof = SunRoof;
	}
	public void printName() {
	System.out.println(name);
}
}
