package com.syntax.class07;

public class ForLoopTask {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------");
	for (int i = 20; i >= 1; i -= 2) {
		System.out.print(i + " ");
	}
	System.out.println();
	System.out.println("--------------------------------------------------------------");
	for (int i = 20; i <= 50; i += 2) {
		System.out.print(i + " ");
	}

	}
}