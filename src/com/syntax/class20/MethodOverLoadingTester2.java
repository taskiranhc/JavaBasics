package com.syntax.class20;

public class MethodOverLoadingTester2 {

	public static void main(String[] args) {
		MethodOverLoading2.add(10, 10);
		MethodOverLoading2.add(10.5, 10);
		int[] arr= {10,50,40};
		MethodOverLoading2.add(arr);
		
		/* in the end you dont need to give new names of your method.
		 * Java automatically calls the method with data types
		 */
		
	}

}
