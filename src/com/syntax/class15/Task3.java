package com.syntax.class15;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * " Is saturday ? Is it raining ? Today do we have a Java class ? "
		 * Calculate how many sentences do we have in this string !
		 */
		String str=" Is saturday ? Is it raining ? Today do we have a Java class ?";
		System.out.println(str.split("[?]").length);
	}

}
