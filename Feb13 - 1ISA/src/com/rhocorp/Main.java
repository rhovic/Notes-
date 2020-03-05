package com.rhocorp;

public class Main {

	public static void main(String[] args) {
		/*
			System.out.println("fsdgsdfgsfdg");
			System.out.println( add(954,456));
			for(int x = 0; x < 10; x++) {
				System.out.println("Sum: " + add(2, x) + "\t Producuct: " + multiply(5, x));
			}
		*/
		Student me = new Student("NASd" , 21);
		System.out.println("HIIII im " + me.name + " ulululul" + me.age);
	}

	static int add(int x, int y) {
		return x + y;
	}
	
	static int multiply(int x, int y) {
		return x * y;
	}
}
//encapsulation private the data then make a public getter method
//inheritance 
//polymorphism