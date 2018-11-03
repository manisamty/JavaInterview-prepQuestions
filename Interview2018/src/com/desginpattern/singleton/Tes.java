package com.desginpattern.singleton;

class F{
	public F instance;
	
	F(){
		//System.out.println("ffff");
	}




public F show(){
	
	if (instance == null)	 
		//instance = new F();
  System.out.println("instance :" + instance);
	return instance;
}


}
public class Tes {

	public static void main(String[] args) {
		F g=new F();
		
		g.show();
	}

}
