package com.labko2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("v12", "red");
		System.out.println("Car engine is " + c1.getEngine());
		Suv s1 = new Suv("v8", "white", 1.8);
		//Suv s2 = new Suv();
		System.out.println("I have an SUV with " + s1.getEngine() + " with a " + s1.getLoadCapacity() + " that has " + s1.getColor() + " color");
	}

}
