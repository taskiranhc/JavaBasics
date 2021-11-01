package com.syntax.class07;
import java.util.Scanner;
public class GuessNumberWhileLoop {

	public static void main(String[] args) {
		int secretNumber=78;
		Scanner scan=new Scanner(System.in);
		int userNumber;
		System.out.println("Please guess my secret number, between 1 to 100");
		userNumber=scan.nextInt();
		while(userNumber!=secretNumber) {
			System.out.println("Please guess my secret number, between 1 to 100");
userNumber=scan.nextInt();
		}
	
		System.out.println("YOU GOT IT");

	}
	

}
