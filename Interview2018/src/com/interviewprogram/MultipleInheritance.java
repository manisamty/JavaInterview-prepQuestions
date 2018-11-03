package com.interviewprogram;

class Pen {
	public void pen() {
		System.out.println("Pen class");

	}

}

class Note extends Pen {

	public void note() {
		System.out.println("note :");
	}

	public void pen() {
		// super.pen(i,j);
		System.out.println("Note class");

	}
}

class Book extends Note {

	public void book() {
		System.out.println("book class :");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {

		
//Here is confusion to call which method
		Book n = new Book();
		n.pen();

	}

}
