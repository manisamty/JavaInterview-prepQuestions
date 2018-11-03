package com.exception;


/*In most of time, StackOverflowError occurs when your program is calling 
a method recursively without proper terminating condition. 
Below example demonstrates the StackOverflowError.*/

public class StackOverflowErrorExample {
	private static void addItself(int i)
    {
        addItself(i+i);   //calling itself with no terminating condition
    }
     
    public static void main(String[] args) 
    {
        addItself(10);
    }
}