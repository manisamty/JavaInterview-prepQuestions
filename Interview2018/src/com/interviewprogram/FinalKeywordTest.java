package com.interviewprogram;

//can inherit final class
class Final1{

	/*constructor we can not make final in costructor
	public final Final1(){
		
	}*/
//we can overload final Method
	public final void show(){
	System.out.println("Show no-args");	
	}
public final void show(int i){
	System.out.println("Show with-args");	
	System.out.println(i);	
}
}

//Method Overriding not possible
class Final2 extends Final1{
	/*public final void show(){
		System.out.println("Show no-args");	
		}*/	
}


public class FinalKeywordTest {

	final int i=7;
	//i=8;//error we can change the property value
	
	public static void main(String[] args) {
	Final1 f=new Final1();
	f.show();
	f.show(9);
}
}
