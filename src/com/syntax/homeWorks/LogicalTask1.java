package com.syntax.homeWorks;

import java.util.Scanner;

public class LogicalTask1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your height");
		int h=scan.nextInt();
		if (h<60) {
			System.out.println("short");
			
		}else if (h>=60 || h<=72) {
			System.out.println("medium");
		}else if (h>72) {
			System.out.println("tall");
		}

	}

}
