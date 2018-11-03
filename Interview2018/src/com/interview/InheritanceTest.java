package com.interview;

class Animal{
	public int add(int a,int b){
		
		int c=a+b;
		System.out.println("Super");
		return c;
	}
}


class Dog extends Animal{
		
	public int add(int d,int e){
		super.add(d, e);
		int c=d+e;
		System.out.println("Child");
		return c;
	}
	
	
	public int sub(int d,int e){
		
		int k=d-e;
		System.out.println("Sub");
		return k;
	}

}
public class InheritanceTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Dog a=new Dog();
	int b=a.add(2, 3);
	int i =a.sub(2, 3);

	System.out.println(b);
	System.out.println(i);
	} 

}
