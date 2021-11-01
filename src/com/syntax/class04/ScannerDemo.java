package com.syntax.class04;

import java.util.Scanner;

//shortcut to import existing class to the current class
//ctrl+shift+o

public class ScannerDemo {

	public static void main(String[] args) {
		String str="Abc";
		str="zyx";
		
		
		Scanner scan=new Scanner(System.in);
		String name=scan.next(); //it will capture String value from console
		System.out.println("please enter your name");
System.out.println("hello " +name);
System.out.println("please enter your age");
int age=scan.nextInt();
System.out.println(name+" you are "+age+"years old");

	}

}
