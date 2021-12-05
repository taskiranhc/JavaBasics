package com.syntax.class14;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a string if string is not empty perform the following:
		 * if the string has an odd number of characters and has 3 or more character print
		 * the middle character of the string 
		 */
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		if (!str.isEmpty()&&str.length()%2!=0 && str.length()>=3) {
				System.out.println(str.charAt(str.length()/2));	
			}
			
		}
		
		
		
	}


