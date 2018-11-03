package com.objectlevel_classlevelock;

class MyThread extends Thread {
	Display d;
	String name;

	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public synchronized void run() {
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

public class ObjectLevelLock {
	public static void main(String[] args) throws Exception {
		Display d = new Display();
		MyThread thread1 = new MyThread(d, "Rama");
		MyThread thread2 = new MyThread(d, "Seetha");
		thread1.start();
		thread2.start();
	
	while(thread1.isAlive()){
		System.out.println("Current state of Thread1 : " + thread1.getState());
		System.out.println("Current state of Thread2 : " + thread2.getState());
		
		Thread.sleep(2000);
	}
	}
}
