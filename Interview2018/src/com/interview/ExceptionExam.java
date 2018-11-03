package com.interview;

public class ExceptionExam {

	
	public static void main(String[] args) {

	
	try{
		System.out.println("Exception in try");
	}catch (ArithmeticException e) {
		System.out.println("in catch");
	}
	catch (Exception e) {
		System.out.println("in Exce");
	}
}

}
