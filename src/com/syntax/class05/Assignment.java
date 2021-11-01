package com.syntax.class05;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter current time");
		int time = in.nextInt();
		if (time >= 1 && time <= 11) {
			System.out.println("Its morning");
		} else if (time >= 12 || time <= 15) {
			System.out.println("Its afternoon");
		} else if (time >= 16 || time <= 20) {
			System.out.println("Its evening");
		} else if (time >= 21 || time <= 24) {
		}
		System.out.println("Its evening");
		System.out.println("-----------------------------------");
		String timeOfDay;
		if (time >= 1 && time <= 11) {
			timeOfDay = "morning";
		} else if (time >= 12 && time <= 15) {
			timeOfDay = "afternoon";
		} else if (time >= 16 && time <= 20) {
			timeOfDay = "evening";
		} else if (time >= 21 && time <= 24)
			;
		timeOfDay="night";
		System.out.println("It is " + timeOfDay);
	}

}
