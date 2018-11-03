package com.interview;

import java.util.HashMap;
import java.util.Map;

public class MethodTest {
	public static Map<String, Integer> getOrderTypeData(String code){
	System.out.println("Map");	
	HashMap<String, Integer> hm=new HashMap<>();
	hm.put("Maniasa",123);
		
	System.out.println(code);
	System.out.println("HM :" + hm);
	return hm;
		
	}

	
	public static  int m1(String s){
		System.out.println("M1 : " + s);
		return 0;
		
	}

public static void main(String[] args) {
	
	//hm.put(345, "KLLLL");
	MethodTest.getOrderTypeData("ABinash");
	
	MethodTest.m1("Manisa");
	/*MethodTest m=new MethodTest();
	m.put(9,"AB");*/
}
}
