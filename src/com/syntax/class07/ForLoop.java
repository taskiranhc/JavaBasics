package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * We use while when we dont know how many times we have to repeat block of code
		 * 
		 * We use for when we know how many times we have to repeat block of code
		 */
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
		}

		System.out.println("-------- Print Numbers From 1 to 20 ----------");
		
		for(int i=1; i<=20; i++ ) {
			System.out.print(i+" ");
		}
	
	}
	

}
