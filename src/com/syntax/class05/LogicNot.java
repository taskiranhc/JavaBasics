package com.syntax.class05;

public class LogicNot {

	public static void main(String[] args) {
		boolean boo=!true;
		System.out.println(boo);
		boolean zoo=!false;
		System.out.println(zoo);
		boolean isRain=false;
		if(!isRain) {
			System.out.println("I will go for a walk");
		}
		System.out.println("--------------------------------------------");
		String username="test";
		String password="password";
		if(!username.equals(password)) {
			System.out.println("I can accept your password");
		}
		System.out.println("--------------------------------------------");
		boolean selected=true;
		if(!selected) {
			System.out.println("do click");
		}
	}
	
	
	

}
