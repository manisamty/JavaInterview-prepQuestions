package com.interview;

public class EncapsulationMain {

	public static void main(String[] args) {
		{
		      EmployeeCount obj = new EmployeeCount ();
		    // obj.name="sor"; Error
		     
		      obj.setName("");
		      System.out.println(obj.getName());
		    }
		}

	}

