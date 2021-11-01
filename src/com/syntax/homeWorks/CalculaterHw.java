package com.syntax.homeWorks;
import java.util.Scanner;
public class CalculaterHw {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		double n1 = inp.nextDouble();
		System.out.print("Enter number 2: ");
		double n2 = inp.nextDouble();
		System.out.print("Enter an operator (+; -; *; /): ");
		String operator = inp.next();
		
		switch (operator) {
		case "+":
			System.out.println("The result = " + (n1 + n2));
			break;
		case "-":
			System.out.println("The result = " + (n1 - n2));
			break;
		case "*":
			System.out.println("The result = " + (n1 * n2));
			break;
		case "/":
			System.out.println("The result = " + (n1 / n2));
			if (n2!=0) {
			} else
				System.out.println("Invalid");
			break;
		default:
			System.out.println("Invalid operand. Please try another operand.");
		}

	}

}
