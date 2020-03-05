package com.rhocorp;

public class Test {

	public static void main(String[] args) {
			Parent p = new Parent();	//p is a parent daw
			Child c = new Child();		//c is a child and an object daw
			p = c;
			p.walk("Fast");
			Object obj = c;				//idk why
			System.out.println(p instanceof Object);	//instanceof returns a boolean value compares left to right
			
			Calculator calc = new Calculator();
			int men = calc.add(69, 56, 3);
			System.out.println(calc.display(men));
			Calculator.add(1,5,6);		//possible because of static keyword
			
			someMethod(); 				//static methods can call other static methods
	}
	
	public static void someMethod() {
		Calculator w = new Calculator();
		Parent p = new Child(); 		//Upcasting - converts parent to child
		Child c = (Child) new Parent(); //Downcasting - but throws error at runtime, converts child to parent
	}

}
