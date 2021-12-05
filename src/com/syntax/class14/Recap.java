package com.syntax.class14;

import java.util.Arrays;

public class Recap {

	public static void main(String[] args) {
		
		String name = " Nasiri ";
		System.out.println(name.length());
		System.out.println(name.startsWith("N"));
		System.out.println(name.endsWith("R"));
		System.out.println(name.endsWith("r"));
		System.out.println(name.contains("s"));
		System.out.println(name.equals("NAsir"));
		System.out.println(name.equalsIgnoreCase("NAsir"));
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf("i"));
		System.out.println(name.indexOf("i",4)); //ignores first 4 character
		System.out.println(name.substring(3)); 	//giving answer after from 3rd index
		System.out.println(name.substring(3,5));
		System.out.println(name.isEmpty());
		System.out.println(name.trim());
		String sentence = "This is a Java class ";
		System.out.println(sentence.split(" ").length);
		System.out.println(sentence.split(" ")[0]);
		System.out.println(Arrays.toString(sentence.split(" ")));
}
}