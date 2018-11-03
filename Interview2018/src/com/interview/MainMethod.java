package com.interview;

public class MainMethod {
	
	    public static void main(String[] args)
	    {
	        System.out.println("Execution starts from this method");
	    }
	 
	   public static int main(int args)
	    {
	        System.out.println("Another main method");
			return args;
	    }
	 
	    double main(int i, double d)
	    {
	        System.out.println("Another main method");
	 
	        return d;
	    }
	
}
