package com.test;


import java.util.Scanner;

public class ScannerDemo2 {
	
	public static void sum(int num1, int num2){
		
		int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: " + sum);
		
	}
	
	public static void main(String[] args) {
		 ScannerDemo2.sum(2,5);
	    }
	}