package com.syntax.class05;

import java.util.Scanner;

public class LogicOrDemo {

	public static void main(String[] args) {
		/* ask user to enter today's date
		 * if monday or friday --> no class
		 * tuesday or wednesday --> manual class
		 * saturday or sunday --> java class
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter today's day");
		String day=scan.next();
		if (day.equals("monday") || day.equals("friday")) {
			System.out.println("no class");
		} else if (day.equals("tuesday") ||day.equals ("wednesday") ) {
			
			System.out.println("manuel class");
	} else if (day.equals ("saturday") ||day.equals ("sunday")) {
		System.out.println("java class");}
	}

}
