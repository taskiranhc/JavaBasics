package com.syntax.class14;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy or girl ?
		 * Based on input suggest a name for baby Example output: "Mom's"
		 * first name ? Mary Dad's first name ? Daniel Boy or Girl ? boy suggest name :  Danry
		 */
		
		String fathersName="Daniel"; //    "7/2=3"
		String mothersName="Mary";	//     "4/2=2"
		Scanner scan = new Scanner(System.in);
		String isBoyGirl=scan.next() ;
		if (isBoyGirl.equalsIgnoreCase("Boy")) {
			String firstPart=fathersName.substring(0,fathersName.length()/2);
			String secondPart=mothersName.substring(mothersName.length()/2);
			System.out.println(firstPart+secondPart);
		} else {
			String firstPart=mothersName.substring(0,mothersName.length()/2);
			String secondPart=fathersName.substring(fathersName.length()/2);
			System.out.println(firstPart+secondPart);
		}
		
		
	}

}
