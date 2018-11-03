package com.marker;

public class MarkerIntrface extends A implements Marker { // if this class will
															// not implement
															// Marker, throw
															// exception
	public static void main(String[] args) {
		MarkerIntrface a = new MarkerIntrface();
		try {
			a.m1();
		} catch (MyException e) {

			System.out.println(e);
		}

	}

}

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

class A {
	void m1() throws MyException {
		if ((this instanceof Marker)) {
			System.out.println("successfull");
		} else {
			throw new MyException("Must implement interface Marker ");
		}
	}
}