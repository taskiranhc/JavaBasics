package com.syntax.class07;

public class DoWhileTask {

	public static void main(String[] args) {
		/*
		 * print number from 30 to 70 print odd numbers from 90 to 1 using do while
		 * 
		 */
		int x = 30;
		do {
			System.out.print(+x + " ");
			x++;

		} while (x <= 70);
		System.out.println(" ");
		System.out.println("---------------------------------- ");

		int y = 89;
		do {
			System.out.print(+y + " ");
			y -= 2;

		} while (y >= 1);

	}
}
