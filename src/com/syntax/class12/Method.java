package com.syntax.class12;

public class Method {
	int times;
void sayHello() {
	
	System.out.println("Hello batch11");
}
void sayHellomanyTimes() {
	for (int i=0; i<=5; i++) {
		System.out.print("Hellobatch11 ");
	}
}
void sayHellomanyTimeswithState() {
for (int i=0; i<times; i++) {
	System.out.print("Hellobatch11 ");
}
}
void sayHellomanyTimeswithParameter(int times) {
for (int i=0; i<times; i++) {
	System.out.print("Hellobatch11 ");
}
}
}