package com.syntax.class18;

public class Task3 {
	/*
	 * Write a java class that have 4 constructors with 4 different access levels of
	 * constructors(private, public, default, protector) and create 4 objects of
	 * this : class 1 - inside same class; class 2 - outside of this class class 3 -
	 * from different class
	 */
	private Task3() {
		System.out.println("private");
	}

	Task4(String name) {
		System.out.println("default");
	}

	protected Task3(int age) {
		System.out.println("protected");

	}

	public Task3(double weight) {
		System.out.println("public");
	}

	public static void main(String[] args) {
		new Task3();
		new Task3(name:"name");
		new Task3(age:10);
		new Task3(weight:45.2);
	}
}