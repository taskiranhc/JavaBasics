package com.syntax.class04;

public class NestedIfTask2 {

	public static void main(String[] args) {
		double rate=4;
		int price=400000;
		if (rate>4.5) {
			System.out.println("will not buy a house");
			
		} else {
			System.out.println("will consider buy a house");
			if (price>200000) {
				System.out.println("pay it");
			}else {System.out.println("take a loan");
		}

	}

}
}
