package com.syntax.class06;
import java.util.Scanner;
public class SwitchTask {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scan.next();
		String language;
		switch (country) {
		case "Turkey":
			language="Turkish";
			break;
		case "Italy":
			language="Italian";
			break;
		case "Japan":
			language="Japanese";
			break;
		case "Mexico":
			language="Spanish";
			default:
				language="Unknown";	
			break;
		}
		if (!language.equals ("Unknown")) {
System.out.println("Your country is "+country+" and your language is "+language);
	}else {
		System.out.println("Please try another country");
}
}
}
