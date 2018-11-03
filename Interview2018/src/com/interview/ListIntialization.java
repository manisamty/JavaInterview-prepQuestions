package com.interview;

import java.util.Arrays;
import java.util.List;

public class ListIntialization {
	public static void main(String args[]) {
	//declaring and initializing array in one line
    String[] oldValues = new String[] {"list" , "set" , "map"};
    String[] values = {"abc","bcd", "def"}; 
  
    //initializing list with array in java
    List init = Arrays.asList(values);
    System.out.println("size: " + init.size() 
                        +" list: " + init);
  
    //initializing List in one line in Java
    List oneLiner = Arrays.asList("one" , "two", "three");
    System.out.println("size: " + init.size() 
                     +" list: " + oneLiner);
  
    // List returned by Arrays.asList is fixed size
    // and doesn't support add or remove

    // This will throw java.lang.UnsupportedOperationException
    oneLiner.add("four"); 

    // This also throws java.lang.UnsupportedOperationException
    //oneLiner.remove("one"); 
  }
}