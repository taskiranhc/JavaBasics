package com.syntax.class10;

public class twoDarraysDemo {

	public static void main(String[] args) {
		// lets create an 2d array of groceries
		
		String[][] groceries= {
				{"banana","apple","mango"},
				{"potato","tomato"},
				{"milk","cheese","ayran","yogurt"},
				
								};
		System.out.println(groceries.length);
		System.out.println(groceries[2][3]);  //yogurt
		
		//I want to find how many elements my 1 array has
		
		System.out.println("# of elements inside 1 array= "+groceries[0].length);
		System.out.println("# of elements inside 2 array= "+groceries[1].length);
		System.out.println("# of elements inside 3 array= "+groceries[2].length);
		
		//how do we get the all elements???
		
		for (int i=0; i<groceries.length;i++) {
			for(int j=0; j<groceries[i].length;j++) {
				System.out.print(groceries[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
