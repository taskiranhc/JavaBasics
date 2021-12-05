package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[4]='F';
		System.out.println(grades[1]);
		
		int num;
		num=10;
		char[] gender;
		gender=new char[2];
		
		char[] gradeArrays= {'A','B','C','D'}; //another way of creating array like 0,1,2,3,4
		
		System.out.println(gradeArrays.length);
		System.out.println(gradeArrays[0]);
	}

}
