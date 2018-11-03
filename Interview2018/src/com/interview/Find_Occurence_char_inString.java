package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_Occurence_char_inString {
     //String data="Manisaddf";
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String value : ");
		String str = br.readLine();
		System.out.println("Enter the Char value : ");
		char ch=(char)System.in.read();//Keyboard value
		
     System.out.println("Ch value :" + ch);
	////OPPPPP  str contains
     //O  ch keyboard value :
	int timesWasFound=0;
	for(int i=0; i<str.length();i++){
		char c=str.charAt(i);
	System.out.println("String value :" + str);
		System.out.println("C value   : " + c);
	if(c==ch){
		 timesWasFound++;
	 }
		
	}
	System.out.println(timesWasFound);
	}

}
