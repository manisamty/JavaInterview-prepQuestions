package com.interviewprogram;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
	public static void main(String a[]) {
		Vector<String> vector = new Vector<String>();
		 //en = null;
		vector.add("JAVA");
		vector.add("JSP");
		vector.add("SERVLET");
		vector.add("EJB");
		vector.add("PHP");
		vector.add("PERL");
		Enumeration<String>	en = vector.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}