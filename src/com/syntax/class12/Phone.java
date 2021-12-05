package com.syntax.class12;

public class Phone {
	
	String make;
	String model;
	double height;
	int RAM;
	int ROM;
	double screen;
	int camera;
	
	void makePhonecalls() {
		System.out.println(make+" "+model+" "+"is calling someone");
	}
	
	void takePictures() {
		System.out.println(make+" "+model+" "+"is taking pictures");
	}
}
