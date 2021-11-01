package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		char gender='m';
		String description;
		switch(gender) {
		case 'm':
			description="male";
			break;
		case 'f':
			description="female";
			break;
			default:
				description="Unknown";
		}
		System.out.println(gender+" means "+description);
		
		/*
		 * limitation
		 * 1. we cannot use logical operators
		 * 2. we cannot use relational operators
		 * 
		 * limitation of data types
		 * 1. cannot use boolean
		 * 2. cannot use double/float/long
		 */
		
	}

}
