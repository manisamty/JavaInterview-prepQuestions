package com.interview;

class MySingleton1
{
	static MySingleton1 instance=null;
	public int x = 10;

	// private constructor can't be accessed outside the class
	private MySingleton1() { }

	// Factory method to provide the users with instances
	static public MySingleton1 getInstance()
	{
		if (instance == null)	 
			instance = new MySingleton1();
System.out.println("instance :" + instance);
		return instance;
	} 
}

// Driver Class
public class MySingletonTest
{
public static void main(String args[]) 
{
	MySingleton1 a = MySingleton1.getInstance();
	MySingleton1 b = MySingleton1.getInstance();
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	a.x = a.x + 10;
	System.out.println("Value of a.x = " + a.x);
	System.out.println("Value of b.x = " + b.x);
} 
}





