package com.interview;

class MyT extends Thread{
	
	/*public void start(){
		System.out.println("Start method");
	}*/

	
			public void run() {
				System.out.println("run method");
			}
		
		
	
}

public class Questions {

	public static synchronized void main(String[] args) {

MyT m=new MyT();
/*
m.run();
m.run();*/
//m.start();
m.run();

	}

}
