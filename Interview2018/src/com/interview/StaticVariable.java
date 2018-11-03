package com.interview;

public class StaticVariable {
	
	//it shared common behavior to all the variable
	static String sum="sum";
	static String diff="Diffrence";
	
	
	//Test diffrent scenario
	  int rollno;//instance variable  
	   String name;  
	   static String company ="Manthan";//static variable  
	   static String dept ="IT";
	   //dept ="ITR";
	  
	   //static method to change the value of static variable  
	     static void change(){  
	    	 dept = "BBDIT";  
	     } 
	   //constructor  
	   StaticVariable(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	
	   void display (){
		   System.out.println(rollno+" "+name+" "+ company + "Dept" + dept);
		   }  
	     
	public static void main(String[] args) {
		int a=10;
		int b=9;
		int c=a+b;
		int d=a-b;
		System.out.println(sum + c);
		System.out.println(diff + d);
	
		//
		StaticVariable.change();
		StaticVariable s1 = new StaticVariable(111,"Karan");  
		StaticVariable s2 = new StaticVariable(222,"Aryan");  
		 //we can change the college of all objects by the single line of code  
		 //Student.college="BBDIT";  
		 s1.display();  
		 s2.display();  
		//String s=null;
		//System.out.println(s.length());
	}

}
