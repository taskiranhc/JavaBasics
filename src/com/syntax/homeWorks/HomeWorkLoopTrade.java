package com.syntax.homeWorks;

import java.util.Scanner;

public class HomeWorkLoopTrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("WHAT DO YOU WANT TO BUY ?");
		String item = scan.next();
		double price = 14.99;
		double paid = 0;
		System.out.println("PLEASE PAY " + price);
		
		do {
			paid += scan.nextDouble();
			if (price > paid) {
				System.out.println("You need to give extra= " + (price-paid));
				
			} else if (price < paid) {
				System.out.println("Here is your exchange= " + (paid-price));
				break;
			}

		} while (paid != price);
		System.out.println("THANKS FOR SHOPPING");
	}
}
