package com.interview;

public class Employee {
 String empName;
 int empId;
 double empSal;
public Employee(String empName,int empId,double empSal){
	this.empName=empName;
	this.empId=empId;
	this.empSal=empSal;
}

public String toString(){
	return empId + empName + empSal;
}
}
/*public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
}

}*/
