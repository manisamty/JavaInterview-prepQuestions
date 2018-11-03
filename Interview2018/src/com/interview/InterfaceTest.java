package com.interview;

class Juice implements Glass{

	@Override
	public void drink() {
		
	System.out.println("drink----coffee");	
	}
	@Override
	public void noDrink() {
		
	System.out.println("no----coffee");	
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		Juice j=new Juice();
		j.drink();
		j.noDrink();

	}

}
