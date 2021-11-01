package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);
System.out.println("please enter an intem you want to buy");
String item=input.next();
System.out.println("please enter the price of the "+item);
double price=input.nextDouble();
System.out.println("You selected "+item+" with price "+price);
	}

}
