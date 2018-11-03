package com.test;

import java.util.Scanner;
public class JavaStaticInitBlock
{
	public static void main(String[] args) {
		
		int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        b = sc.nextInt();
        
        sc.close();
	       
	        try{
	            int c=a/b;
	           System.out.println("Enetr the no" + c);
	            
	        }catch(ArithmeticException e){
	        	e.printStackTrace();
	            System.out.println();
	        }
	     finally {
	    	 sc.close();
		}   
	}
}
	
	/*static int B,H;
	static boolean flag = true;
	static {
    	Scanner sc = new Scanner(System.in);
    	B = sc.nextInt();
	    H = sc.nextInt();
	    if(B<=0 || H<=0){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
		}*/
	

