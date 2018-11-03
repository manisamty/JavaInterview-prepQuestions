package com.interview;

public class Test3 {
	public final static void main(String[] args) {
		method(null);
	}
	public static void method(Object o) {
		System.out.println("Object impl");
	}
	public static void method(String s) {
		System.out.println("String impl");
	}
	

}