package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {

		// Checks if both variables contain same thing

		int num1 = 10;
		int num2 = 10;
		System.out.println(num1 == num2);
		num2 = 20; 
		System.out.println(num1 == num2);
		System.out.println("***************************************");
		boolean result = num1 == num2;
		System.out.println(result);
		System.out.println("***************************************");

		// Check well if you used == rather than = !!!

		System.out.println(num1 = num2);
		System.out.println("***************************************");
		System.out.println(num1 > num2);
		num2 = 5; // Re-assing num2 to see difference
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println("***************************************");
		num1=10;
		num2=10;
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println("***************************************");
		num1=10;
		num2=5;
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
	}

}
