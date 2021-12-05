package com.syntax.class18;

public class Task3Tester {

	public static void main(String[] args) {
		new Task3(); // not possible as it is private
		new Task3(name:"name");
		new Task3(age:10);
		new Task3(weight:45.2);
	}

}
