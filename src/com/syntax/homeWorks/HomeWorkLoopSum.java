package com.syntax.homeWorks;

public class HomeWorkLoopSum {
									
										//SUM OF EVEN AND ODD NUMBERS BETWEEN 1 AND 100
	
	public static void main(String[] args) {
		int sum1 = 0;
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + " ");
			sum1 += i;
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("sum of odd numbers=" + sum1);
		
		System.out.println("----------------------------------------------------------------------------");
		
		int sum2 = 0;
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
			sum2 += i;
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("sum of odd numbers=" + sum2);

	}
}
