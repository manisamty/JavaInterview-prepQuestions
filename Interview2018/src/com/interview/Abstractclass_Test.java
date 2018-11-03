package com.interview;

abstract class Base {
	abstract void fun();
	
	public void defaultMethod(){
	System.out.println("Default Abstract Behavior");	
	}
}


class Derived extends Base {
	void fun() {
		System.out.println("Derived fun() called");
	}
	
}

class Derived1 extends Derived {
	void fun() {
		System.out.println("Derived1 fun() called");
	}
	
}

public class Abstractclass_Test {

	public static void main(String[] args) {
		// Uncommenting the following line will cause compiler error as the
		// line tries to create an instance of abstract class.
		// Base b = new Base();

		// We can have references of Base type.
		Base b = new Derived();
		b.fun();
		b.defaultMethod();

		Base derived1 = new Derived1();
		derived1.fun();
		derived1.defaultMethod();
	}

}
