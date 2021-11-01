package com.syntax.homeWorks;

import java.util.Scanner;

public class ScannerHW4 {

	public static void main(String[] args) {
		Scanner temperature=new Scanner(System.in);
		System.out.println("PLEASE ENTER YOUR CITY");
		String city=temperature.next();
		System.out.println("Degree in Fahreneit");
		int deg=temperature.nextInt();
		int degInC=((deg-32)*5/9);
		System.out.println("Degree in Celcius");
		System.out.println("Temperature in your city " +city+ " is "+ degInC);
		}

	}


