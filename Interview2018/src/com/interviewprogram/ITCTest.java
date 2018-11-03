package com.interviewprogram;




public class ITCTest {

	public static void main(String[] args) {
		
		String s="Manisa";
		String s1=new String("Manisa").intern(); //intern() will take from constant pool chache not from Object (Heap)
		//String s3=s;
		System.out.println(s==s1);//true
	}
	
	
	
	}
				

	


