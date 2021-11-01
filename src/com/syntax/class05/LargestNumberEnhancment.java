package com.syntax.class05;

import java.util.Scanner;

public class LargestNumberEnhancment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double largest;
		if (a > b && a > c) {
			largest = a;
		} else if (b > a && b > a) {
			largest = b;
		} else if (c > a && c > b);
			largest = c;
			System.out.println("The largest number is "+largest);
			if(largest%2==0) {
				System.out.println(largest+" number is even");
			}else {
				System.out.println(largest+" number is odd");

			}
	}

}
