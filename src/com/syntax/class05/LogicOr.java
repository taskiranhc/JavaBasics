package com.syntax.class05;

import java.util.Scanner;

public class LogicOr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("do you have a credit card?");
		String answer = input.next();
		if (answer.equals("yes") || answer.equals("yeah")) {
			System.out.println("please tell me your balance");
		}else {
			System.out.println("do you want to credit card?");
		}
		
		System.out.println("end of code");

	}
	

}
