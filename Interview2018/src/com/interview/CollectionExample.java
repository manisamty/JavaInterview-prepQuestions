package com.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample {
public static void main(String[] args) {
	/*Set set=new HashSet();
	
	set.add(34);
	set.add(96);
	set.add(11);
	set.add(11);
	set.add("B");
	set.add("A");
	set.add("D");
	set.add("E");*/
	
	
/*Set set=new LinkedHashSet<>();
	
	set.add(34);
	set.add(96);
	set.add(11);
	set.add(11);
	set.add("B");
	set.add("A");
	set.add("D");
	set.add("E");*/
	
/*Set set=new TreeSet<>();
	
	set.add(34);
	set.add(96);
	set.add(11);
	set.add(11);
	set.add("B");
	set.add("A");
	set.add("D");
	set.add("E");
	
	for (Object in : set) {
System.out.println(in);	*/

	 HashMap<String,Integer> map = new HashMap<String,Integer>();           
	   map.put("Man",10);  
	   map.put("san", 20);  
	  
	   System.out.println("Values before remove: "+ map);    
	   // Remove value for key 102  
	   map.remove("Man");  
	   System.out.println("Values after remove: "+ map);  
	   }      
	
	}


