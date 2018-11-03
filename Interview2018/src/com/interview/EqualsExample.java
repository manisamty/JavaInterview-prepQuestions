package com.interview;

public class EqualsExample {
	public static void main(String args[]) {
		String str1 = new String("Hello");
		String str2 = new String("Hi");
		String str3 = new String("Hello");
		String str4 = new String("HeLLO");
		
		
		
		System.out.println(str1.equals(str2));
		System.out.println( str1.equals(str3));
		System.out.println(str1.equals("Welcome"));
		System.out.println( str1.equals("Hello"));
		System.out.println("EqualsIgnoreCase : " + str1.equalsIgnoreCase(str4));
	
		System.out.println("Equals : " + str1.equals(str4));
	}
}
