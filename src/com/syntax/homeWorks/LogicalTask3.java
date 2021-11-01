package com.syntax.homeWorks;

import java.util.Scanner;

public class LogicalTask3 {

	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int a = numbers.nextInt();
		System.out.println("Please enter 2nd number");
		int b =numbers.nextInt();
		System.out.println("Please enter 3rd number");
		int c= numbers.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a+" is the largest number");

		} else if (b>a && b>c) {
			System.out.println(b+ " is the largest number");

		} else if (c>b && c>a) {
			System.out.println(c+ " is the largest number");

		}
	}

}
