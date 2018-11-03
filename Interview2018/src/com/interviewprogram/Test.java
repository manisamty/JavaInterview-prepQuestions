package com.interviewprogram;
class A{
	public void display(){
		m1();
	}

public void m1(){
	System.out.println("A");
}

}


class B extends A{
	public void m1(){
		System.out.println("B");
	}	
}

public class Test {
	
	public static void main(String[] args) {
		
	
A a=new A();
A a1=new B();
a.display();
a1.display();
}
}