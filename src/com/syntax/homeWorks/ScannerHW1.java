package com.syntax.homeWorks;

import java.util.Scanner;

public class ScannerHW1 {

	public static void main(String[] args) {
		
	Scanner num=new Scanner(System.in);
	System.out.println("x");
	int x=num.nextInt();
	System.out.println("y");
	int y=num.nextInt();
	
	if (x>y) {
		System.out.println(x+" is greater than "+y);
	}else {
		System.out.println(x+" less than  "+y);
	}
	}

}
