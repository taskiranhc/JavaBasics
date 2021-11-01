package com.syntax.homeWorks;

import java.util.Scanner;

public class ScannerHW2 {

	public static void main(String[] args) {
		
		Scanner loan=new Scanner(System.in);
		System.out.println("ENTER THE LOAN AMOUNT YOU NEED");
		int amount=loan.nextInt();
		if (amount<=200000) {
			System.out.println("we can give you loan");
			
		}else {
			System.out.println("we cannot give you loan");
		}
	}

}
