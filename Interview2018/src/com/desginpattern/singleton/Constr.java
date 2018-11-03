package com.desginpattern.singleton;

class Book{
	Book(){
		System.out.println("Book Cons");
	}
	
	{
		System.out.println("Intilaization");
	}
}

class Book1 extends Book{
	Book1(int i){
		System.out.println("Book1");
	}
	Book1(){
		System.out.println("Book1-nonparameteriozed");
	}
}

public class Constr {

	public static void main(String[] args) {
		Book b=new Book1();
	

	}

}
