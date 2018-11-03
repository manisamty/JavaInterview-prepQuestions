package com.interviewprogram;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	 static final String i = "kll"; 
     
	    public static void main(String args[]) 
	    { 
	        // re-assigning final variable 
	        // will throw compile-time error 
	       // i = "ioo"; 
	    
	
	
		final List<Integer> al=new ArrayList<>();
		al.add(9);
		al.add(99);
		//ways to iteration ArrayList
	
		/*1st way
		
		Iterator<Integer> itr=al.iterator(); 
		while(itr.hasNext()){
		System.out.println(itr.next());	*/
		
		/*2nd Way
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}*/
		
		//3rd way
		
		 for (Integer num : al) { 		      
	           System.out.println(num); 		
	      }
		

	}

}
