package com.syntax.class04;

public class NestedIfTask3 {

	public static void main(String[] args) {
		int age = 19;
		int weight = 120;
		if (age >= 18) {
			System.out.println("Age is eligible");
			if (weight >= 110) {
				System.out.println("We can accept the patient");

			} else {
				System.out.println("We cannot accept the patient");
				
			}

		} else {
			System.out.println("You are not eligible to donate blood");

		}
	}
}
