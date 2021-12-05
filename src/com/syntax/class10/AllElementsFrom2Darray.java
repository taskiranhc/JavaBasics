package com.syntax.class10;

public class AllElementsFrom2Darray {

	public static void main(String[] args) {

		int[][] numbers = { { 100, 200 }, { 9, 8, 7 }, };

		for (int[] num : numbers) {

			for (int n : num) {

				System.out.print(n + " ");
			}

			System.out.println();
		}
		System.out.println("get all elements by using regular for loop");
		
		for (int i=0; i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				int element=numbers[i][j];
				System.out.print(element+" ");
				
			}
	
			System.out.println();
		}
		
		
	}
}
