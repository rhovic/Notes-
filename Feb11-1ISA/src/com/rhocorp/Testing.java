package com.rhocorp;

public class Testing {

	public static void main(String[] args) {
		Person me = new Person();
	
		//1st object
		System.out.println("Person 1 Details:\n");
		System.out.println("My name is " + me.getName() + " and I am " + me.getAge() + " years old");
		System.out.println("My height is " + me.height + " and " + me.gender);
		me.walk(9.8);
		me.sleep(5);
		
		
		//2nd object
		Person me2 = new Person();
		me2.getName = "Rhovic";
		me2.getAge = 19;
		me2.height = 166.2;
		me2.gender = "Male";
		System.out.println("Person 2 Details:\n");
		System.out.println("My name is " + me2.name + " and I am " + me2.age + " years old");
		System.out.println("My height is " + me2.height + " and " + me2.gender);
		me2.walk(5);
		me2.sleep(4.8);
		
		/*
		//3rd object
		Person me3 = new Person();
		me3.name = "Paulino";
		me3.age = 68;
		me3.height = 155;
		me3.gender = "Female";
		System.out.println("Person 3 Details:\n");
		System.out.println("My name is " + me3.name + " and I am " + me3.age + " years old");
		System.out.println("My height is " + me3.height + " and " + me3.gender);
		me3.walk(5);
		me3.sleep(4.8);
		
		System.out.println("\n" + me.name + " and " + me3.name + " are cousins");
		*/
	}

}
