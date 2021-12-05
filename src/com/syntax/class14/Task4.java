package com.syntax.class14;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * create a String and print it in revers order Sunday=yadnuS
		 */
		
		String str="Sunday";
		String newstr="";
		
		for (int i=str.length()-1; i>=0;i-- ) {
			
			newstr+=str.charAt(i);	
		}
		System.out.println(newstr);	
	}

}
