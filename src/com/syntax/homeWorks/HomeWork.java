package com.syntax.homeWorks;

public class HomeWork {

	public static void main(String[] args) {
		double x=12.5;
		double y=1.5;
		double z=3.9;
		int w=5;
		int h=8;
		System.out.println("The sum of "+x+" and "+y+" is   "+ (x + y));
		System.out.println("The difference of "+x+" and "+y+" is   "+ (x - y));
		System.out.println("The multiplication of "+x+" and "+y+" is    "+ (x * y));
		System.out.println("The division of "+x+" and "+y+" is    "+ (x / y));
		System.out.println("*************************************************************************");
		System.out.println("The square of "+z+" is equal to    "+ (z*z));
		System.out.println("*************************************************************************");
		System.out.println("The primeter of rectangle with width "+w+" and height "+h+" is    "+ (w+w+h+h));
		System.out.println("The area of rectangle with width "+w+" and height "+h+" is    "+ (w * h));
		System.out.println("*************************************************************************");
		System.out.println("The number is 100");
		int t=100;
		t+=100;
		System.out.println(t);
		t=100;
		t-=67;
		System.out.println(t);
		System.out.println("*************************************************************************");
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		System.out.println("*************************************************************************");
		cakePiece=25;
		cakePiece%=7;
		System.out.println(cakePiece);
	}

}
