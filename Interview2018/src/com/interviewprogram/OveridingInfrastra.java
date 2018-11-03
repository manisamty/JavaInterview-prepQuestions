package com.interviewprogram;

class Parent2{
	public void show(){
		System.out.println("parent class");
	}
}

class Child2 extends Parent2 {
	public void show(){
		System.out.println("child class");
	}
}

public class OveridingInfrastra {
public static void main(String[] args) {
	Parent2 p=new Child2();
	p.show();
}
}
