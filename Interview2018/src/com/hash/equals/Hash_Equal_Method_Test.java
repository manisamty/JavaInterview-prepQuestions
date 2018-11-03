package com.hash.equals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Student{
	private String name;
	private int age;
	
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student: [name=" + name + ", age=" + age + "]";
	}
	


}


public class Hash_Equal_Method_Test {

	public static void main(String[] args) {
	//Using Map
		//To remove the duplicacy in collection and maintain uniqueness we overide hashcoade() and equals()
		Map<Student,Integer>map=new HashMap<>();
		map.put(new Student("Manisa", 12),13);
		map.put(new Student("Manisa", 12),13);
		
		//Using Set
		Student s2=new Student("Abi", 11);
		Student s3=new Student("Abi", 11);
		Set<Student> result=new HashSet<Student>();
		result.add(s2);
		result.add(s3);
		System.out.println("Set :" + result);
		
		
		//System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		 for (Map.Entry<Student, Integer> entry : map.entrySet()) 
	            System.out.println("Name = " + entry.getKey().getName() +
	                             ", Age = " + entry.getKey().getAge());
	
	}}