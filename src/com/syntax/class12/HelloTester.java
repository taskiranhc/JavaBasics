package com.syntax.class12;

public class HelloTester {

	public static void main(String[] args) {
		Method methods=new Method();
		methods.sayHello();
		System.out.println("Line after method");
		methods.sayHellomanyTimes();
		System.out.println();
		System.out.println("Line after method");
		methods.times=3;
		methods.sayHellomanyTimeswithState();
		System.out.println();
		System.out.println("Line after method");
		methods.sayHellomanyTimeswithParameter(10);
		
	}

}
