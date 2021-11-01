package com.syntax.class07;
import java.util.Scanner;
public class DoWhileExample {

	public static void main(String[] args) {
		/*
		 * Create a secret number [1 to 100)
		 * 
		 * ask user guess my secret number
		 * 
		 * keep asking for a number till user guess the secret number
		 */
int secretNumber=78;
Scanner scan=new Scanner(System.in);
int userNumber;
do {
	System.out.println("Please guess my secret number, between 1 to 100");

 userNumber=scan.nextInt();

}
while(userNumber!=secretNumber);
System.out.println("You got it");

	}

}
