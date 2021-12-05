package com.syntax.class19;

public class Pet {
	String name;
	String color;
	String breed;
	int age;

	Pet(String name, String color, String breed, int age) {
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.age = age;
	}
}

class Dog extends Pet {

	Dog(String name, String color, String breed, int age) {
		super(name, color, breed, age);
	}

	void printName() {
		System.out.println(name);
	}

	class Cat extends Pet {

		Cat(String name, String color, String breed, int age) {
			super(name, color, breed, age);
		}

		void printAge() {
			System.out.println(age);
		}

	}
}
