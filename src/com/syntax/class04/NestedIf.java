package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean vaccine = true;

		int dose = 2;

		if (vaccine) {
			System.out.println("How many doses have taken?");

			if (dose == 1) {
				System.out.println("When are you taken your 2nd dose?");
			} else {
				System.out.println("You are fully vaccinated");
			}
		}
		System.out.println("------------------------------------");

		String day = "Monday";
		int date = 13;
		int time=12;
		if (day.equals("Friday")) // or if(day=="Friday");
			System.out.println("I am going to movies today");
		else {
			System.out.println("I am going to watch comedy movie");

			if (date == 13)
				System.out.println("I am going to watch scary movie");

			else {

				System.out.println("I need to study");
				if (time>23) {
					System.out.println("I have to go to sleep");
				}
				
			}
		}
	}
}