package com.syntax.class03;

public class TypeCasting {

	public static void main(String[] args) {
		double num = 10.5; // define
		int num2; // define
		num2 = (int) num; // assign moving from bigger box to smaller box (narrowing/manuel)
		System.out.println(num2);
		System.out.println("***************************************");
		int num3 = 10;
		double num4 = num3; // moving from smaller box to bigger box (widening/automatic)
		System.out.println(num4);
		System.out.println("***************************************");
		int num5 = 1257;
		byte num6 = (byte) num5;
		System.out.println(num6); // we will lost big amount of value BECAUSE we tried to move big box to very
									// small box

		// THIS PROCESS CALLED AS TYPE CASTING
		System.out.println("***************************************");
		short num7 = 12;
		byte num8 = (byte) num7;
		System.out.println(num8);
		System.out.println("***************************************");
		int num9 = 100000;
		float f = num9;
		long l = (long) f;
		System.out.println(l);
		System.out.println("***************************************");
		double num10 = 10.5;
		int num11 = (int) num10;
		System.out.println(num11); // WE LOST 0.5 VALUE

		// IF WE MOVE DATA FROM BIGGER BOX TO SMALLER ONE, WE WILL LOSE SOME DATA

	}

}
