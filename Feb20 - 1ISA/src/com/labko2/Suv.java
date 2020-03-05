package com.labko2;

public class Suv extends Car{
	//extends Car will make this child class inherit the capabilities of Car
	double loadCapacity;
	
	public Suv(String engine, String color, double capacity) {
		super(engine, color); //eto ung constructor ng car
		this.loadCapacity = capacity;
	}
	
	/*public Suv() {
		super(engine, color);
	}
	*/
	
	public void setLoadCapacity(double loadCapacity) {		
		//set returns nothing
		this.loadCapacity = loadCapacity;
	}
	
	public double getLoadCapacity() {
		//get returns the value
		return this.loadCapacity;
	}
}