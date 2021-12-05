package com.syntax.class09;

public class ArraysIntro {

	public static void main(String[] args) {
	int num=10;
	System.out.println(num);
	
	System.out.println("----------------------------");
	
	int[] array=new int[4];
			array[0]=12;
			array[1]=10;
			array[2]=13;
			array[3]=14;
			
			System.out.println(array[2]+array[0]);
	// creating array with double
			double[] arr=new double[3];
			arr[0]=11.99;
			arr[1]=1.09;
			arr[2]=3.08;
	// for changing value
			arr[2]=100.09;
			System.out.println("the new value of arr[2] is "+arr[2]);
			
	// I want to store 4 colours
			String[] colors=new String [4];
			
			//colors[0]="Red";
			colors[1]="Blue";
			colors[2]="Black";
			colors[3]="Yellow";
			//colors[4]="Green"; ArrayIndexOutOfBoundsException
			
			System.out.println("Size of array is "+colors.length);
			System.out.println(colors[0]);
			
	}

}
