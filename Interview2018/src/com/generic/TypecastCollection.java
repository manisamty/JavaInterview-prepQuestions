package com.generic;

import java.util.ArrayList;
import java.util.List;

class Employe{
	private String name;
	//private int age;

	public String getName() {
		return name;
	}

	public Employe(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}




public class TypecastCollection {
//Compilation Error
	//To solve Type-cast problem Type-Safety
	// To resolve java.lang.ClassCastException
	
	public static void main(String[] args) {
		List list = new ArrayList();  
		list.add("Manisa");  
		String s = (String) list.get(0);//we have to do typecasting  bcz didnot provide Generic
		System.out.println(s);
		
		
		/*ArrayList <Employe>al=new ArrayList<>();
	al.add(new Employe("Manisa"));
	//al.add(new Integer(10));
		String s=al.get(0).getName();
	System.out.println(s);*/
	
	
	}
}
