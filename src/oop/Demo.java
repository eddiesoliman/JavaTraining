package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Ed";
		person1.email = "ed@email";
		person1.phone = "123456780";
		
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "De";
		person2.email = "de@email";
		person2.phone = "123456780";
		
		person2.walk();
		person2.sleep();
		person2.eat();
		

	}
}
