package com.syntax.class10;

public class AllElementsOfTwoDarrays {

	public static void main(String[] args) {
		String[][] groceries = { 
				{ "banana", "apple", "mango" }, 
				{ "potato", "tomato" },
				{ "milk", "cheese", "ayran", "yogurt" },

		};

		for (String[] grocery : groceries) {
			for (String g : grocery) {
				System.out.print(g + " ");
			}
			System.out.println();
		}

	}
}
