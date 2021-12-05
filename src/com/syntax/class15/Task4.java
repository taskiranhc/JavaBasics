package com.syntax.class15;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * How to reverse a string word by word
		 */
		String str=" This is a sentence I want to reverse ?";
		
		String[] strArr=str.split(" ");
		
		for(String word:strArr) {
			
			StringBuilder strBuilder=new StringBuilder(word);
			System.out.print(strBuilder.reverse()+" ");
		}
		
	}

}
