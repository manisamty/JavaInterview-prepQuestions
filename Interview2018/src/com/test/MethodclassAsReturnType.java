package com.test;

class Ma {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ma [name=" + name + "]";
	}

}

public class MethodclassAsReturnType {
	public static void main(String[] args) {

		DB db = new DB();
		System.out.println(db.show1());
	}
}
