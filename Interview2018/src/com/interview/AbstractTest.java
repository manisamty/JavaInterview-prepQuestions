package com.interview;

abstract class Water{
	public abstract void  mineral();
public void bisleri(){
	System.out.println("Bisleri Water:: ");
}
}


class Milk extends Water{

	@Override
	public void mineral() {
		System.out.println("Mineral Water ::");
		
	}
	
}

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Milk m=new Milk();
	m.mineral();
	m.bisleri();
	}

}
