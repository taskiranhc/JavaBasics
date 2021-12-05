package com.syntax.class11;

public class DogTester {
	public static void main(String[] args) {

	Dog alonasDog=new Dog();
	alonasDog.name="Lexy";
	alonasDog.breed="American hound";
	alonasDog.color="Black";
	alonasDog.height=2.5;
	alonasDog.age=10;
	alonasDog.gender='M';
	System.out.println("My dog's name is "+alonasDog.name);
	System.out.println("His breed is "+alonasDog.breed);
	System.out.println("His color is "+alonasDog.color);
	
	Dog jimmaysDog= new Dog();
	jimmaysDog.name="Teddy";
	jimmaysDog.breed="Labrador Retriever";
	jimmaysDog.color="Golden";
	jimmaysDog.height=5;
	jimmaysDog.age=5;
	jimmaysDog.gender='M';
	System.out.println("My dog's name is "+jimmaysDog.name);
	System.out.println("His breed is "+jimmaysDog.breed);
	System.out.println("His color is "+jimmaysDog.color);
	
	Dog arwasDog= new Dog();
	arwasDog.name="Monroe";
	System.out.println("Arwas dog is "+arwasDog.name);

}
}
