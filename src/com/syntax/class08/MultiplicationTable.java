package com.syntax.class08;

public class MultiplicationTable {

	public static void main(String[] args) {
		int num = 1;
		for (int a = 1; a <= 10; a++) {
			System.out.println(num + " x " + a + " = " + num * a);
		}

		System.out.println("--------------------------------------------------------------------");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			
			System.out.println("--------------------------------------------------------------------");

		}
	}

}
