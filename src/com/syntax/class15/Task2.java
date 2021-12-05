package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a string combination of letter number and special  characters
		 * Find our how many alpha characters in the string
		 */

	String str="asdfghjk1342567289!%&/(+)";
	
	System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
	
	
	}
	

}
