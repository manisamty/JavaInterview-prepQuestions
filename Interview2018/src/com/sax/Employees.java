package com.sax;

import java.util.ArrayList;

/*class Codebeautify {
	Employees EmployeesObject;

	// Getter Methods

	public Employees getEmployees() {
		return EmployeesObject;
	}

	// Setter Methods

	public void setEmployees(Employees EmployeesObject) {
		this.EmployeesObject = EmployeesObject;
	}
}*/

public class Employees {

	ArrayList<Object> Employee = new ArrayList<Object>();

	// Set getter
	public ArrayList<Object> getEmployee() {
		return Employee;
	}

	public void setEmployee(ArrayList<Object> employee) {
		Employee = employee;
	}

}