package com.interview;

 class Conditions {
	private String name;

	public Conditions(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

public class Conditionchecks {
	public static void main(String[] args) {
		Conditions c = new Conditions("Manisa");
		Conditions c1 = new Conditions("Manisa1");
		c=c1;
		//Manisa1=Manisa1
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		if (c.equals(c1)) {
			System.out.println("Print");
		} else
			System.out.println("Not print ");

	}
}
