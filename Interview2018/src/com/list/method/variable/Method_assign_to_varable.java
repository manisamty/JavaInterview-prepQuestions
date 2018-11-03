package com.list.method.variable;


class Restaruant{
	public String m1(int n,int m){
	   int k=n+m;
	   System.out.println(k);	
	   return "ALex";
		
	}
}


public class Method_assign_to_varable {

	public static void main(String[] args) {
		Restaruant r=new Restaruant();
		String s =r.m1(2, 3);
		System.out.println(s);
	}

}
