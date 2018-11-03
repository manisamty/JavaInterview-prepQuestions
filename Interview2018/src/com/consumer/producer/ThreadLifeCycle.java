package com.consumer.producer;

class MyThread extends Thread{
	
	public void run(){
		System.out.println(this.getState());
		System.out.println("I am run ");
	}
}


public class ThreadLifeCycle {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
	}

}
