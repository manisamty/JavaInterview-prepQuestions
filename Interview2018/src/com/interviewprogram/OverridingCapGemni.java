  package com.interviewprogram;

class Door{
	public void doorMethod(){
		System.out.println("Parent Method : ");
}
}  
class Window extends Door{
	
	//Unchecked Exception child method can throw not checked Exception
	public void doorMethod()throws NullPointerException{
		System.out.println("ParentDerived Method : ");
}  
	public void dM1() throws Exception{
		System.out.println("ParentTest Method : ");
} 	
}	
  
  public class OverridingCapGemni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
