package com.rhocorp;
import java.util.Scanner;

public class Person {
	private int age;
	String gender;
	private String name;
	double height;
	
	Person(){
		Scanner cin = new Scanner(System.in);
		//age = cin.nextInt();
		gender = "male";
		height = 6.7;
		name = "Christopher";
		System.out.println("Person created, initialized and ready to roll...");
		System.out.println("age is " + this.age + "years old");
	}
	
	void sleep(double duration) {
		System.out.println("Person sleeps " + duration + " hours a day!!!");
	}
	
	void walk(double distance) {
		System.out.println("Person walks " + distance + " miles per day!!!");
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setName(String name){
		this.name = name;
	}
	
}
