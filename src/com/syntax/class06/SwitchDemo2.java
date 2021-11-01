package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		/*
		 * we need to capture a country from a user
		 * based on country we have to define favorite food
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scan.next();
		String favoriteFood;
		switch (country) {
		case "Turkey":
			favoriteFood="Kebab";
			break;
		case "Italy":
			favoriteFood="Pizza";
			break;
		case "Japan":
			favoriteFood="Sushi";
			break;
		case "Mexico":
			favoriteFood="Taco";
			default:
				favoriteFood="Unknown";	
			break;
		}
		if (!favoriteFood.equals ("Unknown")) {
System.out.println("Your country is "+country+" and your favorite food is "+favoriteFood);
	}else {
		System.out.println("Please try another country");
}
}}