package com.labko2;

public class Car {
	private String engine;
	private String color;
	
	public Car(String engine, String color) {
		this.engine = engine;
		this.color = color;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getEngine() {
		return this.engine;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void accelarate(double acc) {
		System.out.println("Accelaration of my car is " + acc + " kph^2");
	}
}
