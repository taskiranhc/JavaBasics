package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		
		Phone Iphone=new Phone();
		
		Iphone.make="Iphone";
		Iphone.model="Iphone 13 Pro Max";
		Iphone.RAM=6;
		Iphone.ROM=512;
		Iphone.screen=6.7;
		Iphone.camera=36;
		Iphone.makePhonecalls();
		Iphone.takePictures();
		
		System.out.println("-------------------------------");
		
		Phone googlePixel=new Phone();
		
		googlePixel.make="Google";
		googlePixel.model="Google Pixel 6 Pro";
		googlePixel.RAM=6;
		googlePixel.ROM=512;
		googlePixel.screen=6.7;
		googlePixel.camera=36;
		googlePixel.makePhonecalls();
		googlePixel.takePictures();
		
	}

}
