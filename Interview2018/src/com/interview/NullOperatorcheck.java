package com.interview;

public class NullOperatorcheck {
public static void main(String[] args) {
	EmployeeNull emp=new EmployeeNull();
	emp.setName("Manisa");
	// If value null then it prints If block.....
	// Manisa == null; then it Would skip if block Excutes else block.....
	// Manisa  != null then it would print if block.....
	if(emp.getName()== null){
		System.out.println("If null print :" + emp.getName());
	}else
		System.out.println("If value exist then print : " + emp.getName());

/*String emp="Manisa";
	if(emp== "Manisa"){
		System.out.println("Not found" + emp);
	}*/
}
}
