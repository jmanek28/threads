package threadpackage;

import java.io.Serializable;

class Person implements Serializable {
	public static final long serialVersionUID = 1L; //helps in versioning
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}