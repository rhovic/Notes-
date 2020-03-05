package com.rhocorp;

public class Calculator {
	
	public static int add(int ...x) {	//... keeps accepting argument (vararg argument)
		int sum = 0;
		for(int all: x) {
			sum += all;
		}
		return sum;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		return x / y;
	}
	
	public String display(int result) {
		return "Result is " + result;
	}
}
