package com.upcasting.downcasting;

class Animal {
	public void animal() {
		System.out.println("animal :");

	}

}

class Monkey extends Animal {
	public void animal() {
		System.out.println("monkey :");

	}
}

public class UpcastingRefernce {
	public static void main(String[] args) {

		
		
		
		Animal a = new Monkey();
		Animal b = a;

		b.animal();
	}
}
