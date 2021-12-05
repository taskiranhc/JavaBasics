package com.syntax.class14;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Today is Tuesday. Today we have a java class.";
		String [] strArr=str.split("[.]");
		System.out.println(Arrays.toString(strArr));
		
		for (String s:strArr) {
			System.out.println(s);
			
		}
	}

}
