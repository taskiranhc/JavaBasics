package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		/*
		 * Nested Loops --> Loop inside the Loop
		 */
		for (int i = 1; i <= 3; i++) { //outer loop
			System.out.println("I am outer loop");
			for (int j = 1; j <= 4; j++) { //inner loop
				System.out.println("I am inner loop");
			}
		}
		System.out.println("End of code");
		
		
	} 
}
