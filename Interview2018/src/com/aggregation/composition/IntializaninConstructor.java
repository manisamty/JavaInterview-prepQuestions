package com.aggregation.composition;

public class IntializaninConstructor {
	int speed;

	IntializaninConstructor() {
		System.out.println("constructor is invoked");
	}

	IntializaninConstructor(int i) {
		System.out.println("para constructor is invoked");
	}
	static{
		System.out.println("Static block");
	}
	{
		System.out.println("instance initializer block invoked");
	}

	public static void main(String args[]) {
		IntializaninConstructor b3 = new IntializaninConstructor(9);
		IntializaninConstructor b1 = new IntializaninConstructor();
		IntializaninConstructor b2 = new IntializaninConstructor();
		
	}
}
