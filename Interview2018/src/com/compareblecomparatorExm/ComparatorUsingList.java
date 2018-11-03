package com.compareblecomparatorExm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee> {
	private String designation;
	private String name;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compare(Employee o1, Employee o2) {

		return 0;
	}

	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", name=" + name + "]";
	}



}

class EmployeeComaparator implements Comparator<Employee> {

	public int compare(Employee m1, Employee m2) {
		return m1.getName().compareTo(m2.getName());

	}

}

public class ComparatorUsingList {
	public static void main(String[] args) {
		
		Employee em = new Employee();
		em.setDesignation("Soft");
		em.setName("GHK");
		
		Employee em1 = new Employee();
		em1.setDesignation("HR");
		em1.setName("ABC");
		
		List <Employee>emp=new ArrayList<>();
		emp.add(em);
		emp.add(em1);
		
		Collections.sort(emp, new EmployeeComaparator());
		
		for(Employee loop:emp){
			System.out.println(loop.getName());
		}

	}
}
