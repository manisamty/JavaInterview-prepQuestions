package com.interviewprogram;

public class ArrayTest {

	public static void main(String[] args) {
		/*int [] arr={1,2,3,4,5};
		for(int i=0;i<arr.length-2; ++i){
		
			//1,
			System.out.println(arr[i]);	
		}
*/
	//String s3="Manisa";
	String s=new String("Manisa");
	String s1=new String("Manisa").intern();
	
	System.out.println(s1 == s);
	
	}

}
