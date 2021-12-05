package com.syntax.class16;

public class StudentTester {

	public static void main(String[] args) {
		Student student=new Student();
		student.Name="Sebastian";
		student.Id="123";
		Student.numberOfStudents++;
		
		Student student2=new Student();
		student.Name="Hormat";
		student.Id="456";
		Student.numberOfStudents++;
		
		Student student3=new Student();
		student.Name="Ceyhun";
		student.Id="789";
		Student.numberOfStudents++;
		
		System.out.println(Student.numberOfStudents);
	}

}
