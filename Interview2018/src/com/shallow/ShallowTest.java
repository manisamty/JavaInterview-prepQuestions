package com.shallow;

public class ShallowTest {

	public static void main(String[] args) {

		System.out.println("Original Employee object:::");
		EmployeeShallow employee1 = new EmployeeShallow(1001, "KK", 30, "kishan.javatrainer@gmail.com", "pass@123");
		System.out.println(employee1);
		
		try {
			Object object = employee1.clone();
			EmployeeShallow employee2 =(EmployeeShallow)object;
			System.out.println("Cloned Employee object:::");
			System.out.println(employee2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
