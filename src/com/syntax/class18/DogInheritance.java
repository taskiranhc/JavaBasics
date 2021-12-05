package com.syntax.class18;

public class DogInheritance extends AnimalInheritance {

	boolean loyal = true;

	void printAllInfo() {

		System.out.println(name + breed + color + age + weight);

	}

	void bark() {
		System.out.println(name + " bark");
	}
}
