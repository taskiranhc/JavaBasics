package com.syntax.class16;

public class AccessModifiersDemo {
	private String name;
	int age;
	public double salary;
	
		void displayName() {
			System.out.println(name);
		}
		
		void displayAge() {
			System.out.println(age);
		}
		
		void displaySalary() {
			System.out.println(salary);
			
		}
		
		public static void main(String[] args) {
			AccessModifiersDemo an=new AccessModifiersDemo();
			an.name="Nabil";
			an.age=22;
			an.salary=12000;
}
}