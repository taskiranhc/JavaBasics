package com.syntax.class06;
import java.util.Scanner;
public class SwitchTask2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		char grade=scan.next().charAt(0);
		String explanation;
		switch (grade) {
		case 'A':
			explanation="Excellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Bad";
			default:
				explanation="Fail";	
			break;
		}
		if (!explanation.equals ("Unknown")) {
System.out.println("Your country is "+grade+" and you are "+explanation);
	}else {
		System.out.println("Please try another country");
}
}
}
