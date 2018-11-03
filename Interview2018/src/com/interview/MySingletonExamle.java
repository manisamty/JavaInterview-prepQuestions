package com.interview;

class MySingleton {
private static MySingleton myobj;
private MySingleton(){
	
}

public static MySingleton getInstance(){
	if(myobj==null){
		
	
	myobj=new MySingleton();
}
	return myobj;
	}
public void doSomething(){
	System.out.println("Mysingleton App :");
}
}


public class MySingletonExamle{
public static void main(String[] args) {
	MySingleton ms= MySingleton.getInstance();
	ms.doSomething();
	MySingleton ms1= MySingleton.getInstance();
	ms1.doSomething();
	
}
	
	
}

