package com.syntax.homeWorks;

import java.util.Scanner;

public class ScannerHW3 {

	public static void main(String[] args) {
		Scanner dmv=new Scanner(System.in);
		System.out.println("PLEASE ENTER YOUR AGE");
		int age=dmv.nextInt();
		if (age>=18) {
			System.out.println("we can give you licence");
			
		}else {
			System.out.println("we cannot give you licence");
		}

	}

}
