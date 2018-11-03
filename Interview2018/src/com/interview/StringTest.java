package com.interview;

public class StringTest {
	public static void main(String[] args) {
		
	
/*String s1="Manisa";
String s2="Test";
s2 = s2+"hel";
System.out.println(s2);*/
	/*String s=new String("Mani");
	String s1=new String("Mani");
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());

	System.out.println(s.equals(s1));*/
	
	String s1="Manisa";
	String s2="Manisa";
	String s3=new String("Manisa").intern();
	String s4=new String("Manisa");
	
	System.out.println(s1==s3);
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s3.equals(s4));
	System.out.println(s3==s4);
	}
}