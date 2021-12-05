package com.syntax.class17;

public class Dog {
	
	private String name;
	private String color;
	private String breed;
	private int age;
	private double weight;
	public Dog(String dogName, String dogColor, String dogBreed, int dogAge, double dogWeight) {
		System.out.println("Dog constructor is called");
		name=dogName;
		color=dogColor;
		breed=dogBreed;
		age=dogAge;
		weight=dogWeight;
	}
	
	public void printName(){
		System.out.println(name);
	}
	
}
