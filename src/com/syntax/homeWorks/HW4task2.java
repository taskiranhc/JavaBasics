package com.syntax.homeWorks;

import java.util.Scanner;

public class HW4task2 {

	public static void main(String[] args) {
		Scanner scores = new Scanner(System.in);
		System.out.println("Please enter your Quiz, Midterm and Final scores");
		double Quiz = scores.nextDouble();
		double Midterm = scores.nextDouble();
		double Final = scores.nextDouble();
		double result = ((Quiz + Midterm + Final) / 3);
		String grade;
		if (result >= 90) {
			grade = "A";
		} else if (result >= 70 && result < 90) {
			grade = "B";
		} else if (result >= 50 && result < 70) {
			grade = "C";
		} else if (result < 50) {
			grade = "F";
		System.out.println("Your grade is = " + grade);

		}
	}
}