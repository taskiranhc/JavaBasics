package com.syntax.homeWorks;

import java.util.Scanner;

public class LogicalTask2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of day");
		String day = scan.next();
		if (day.equals("1") || day.equals("2") || day.equals("3") || day.equals("4") || day.equals("5")) {
			System.out.println("weekday");
		} else if (day.equals("6") || day.equals("7")) {

			System.out.println("weekend");
		}
	}
}
