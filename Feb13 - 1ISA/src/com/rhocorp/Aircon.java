package com.rhocorp;

public class Aircon {
	private double hp;
	private int thermo;
	private String brand;
	
	public void Aircon(double hp, int thermo, String brand) {
		this.hp = hp;
		this.thermo = thermo;
		this.brand = brand;
	}
	
	public void swing(String direction) {
		System.out.println("Aircon swings " + direction + " way");
	}
	
	void changeTemp(int temp) {
		System.out.println("Aircon currently blows " + temp + " degree of air");
	}
	
	public double setHP() {
		return this.hp;
	}
	
	public int setThermo() {
		return this.thermo;
	}
	
	public String setBrand() {
		return this.brand;
	}
}
