package com.syntax.homeWorks;

import java.util.Scanner;

public class HW4task1 {

	public static void main(String[] args) {
		Scanner season = new Scanner(System.in);
		System.out.println("Please enter your the month you born");
		String month = season.next();
		if ((month.equalsIgnoreCase("January")) || (month.equalsIgnoreCase("February")) || (month.equalsIgnoreCase("December"))) {
			System.out.println("You were born in Winter season");
		} else if ((month.equalsIgnoreCase("March")) || (month.equalsIgnoreCase("April")) || (month.equalsIgnoreCase("May"))) {
			System.out.println("You were born in Spring season");
		} else if ((month.equalsIgnoreCase("June")) || (month.equalsIgnoreCase("July")) || (month.equalsIgnoreCase("August"))) {
			System.out.println("You were born in Summer season");
		} else if ((month.equalsIgnoreCase("September")) || (month.equalsIgnoreCase("October")) || (month.equalsIgnoreCase("December"))) {
			System.out.println("You were born in Autmn season");
		} else {
			System.out.println("Invalid Month");

		}

	}
}