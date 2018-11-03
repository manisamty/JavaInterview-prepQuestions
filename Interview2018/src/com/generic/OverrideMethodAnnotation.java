package com.generic;

class MyParentClass {

    public void justaMethod() {
        System.out.println("Parent class method");
    }
}


class MyChildClass extends MyParentClass {

    @Override
    public void justaMethod() {
        System.out.println("Child class method");
    }
}





public class OverrideMethodAnnotation {

	public static void main(String[] args) {
		MyParentClass c=new MyChildClass();
		c.justaMethod();
		System.out.println();

	}

}
