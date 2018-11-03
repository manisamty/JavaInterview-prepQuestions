package com.lock.classlock;

class MyRunnable implements Runnable{
	 
    @Override
    public void run(){
           method1();
           
    }
 
    public static synchronized void method1(){
       for(int i=0;i<5;i++){
           System.out.println(i+" "+Thread.currentThread().getName()+" is executing");
           try {
                  Thread.sleep(500);
           } catch (InterruptedException e) {e.printStackTrace(); }
       }
    }
                  
}
 
 
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class StaticSyncClassLock {
    public static void main(String args[]) throws InterruptedException{
 
           MyRunnable object1=new MyRunnable();
           MyRunnable object2=new MyRunnable();
           
           Thread thread1=new Thread(object1,"Thread-1");
           Thread thread2=new Thread(object2,"Thread-2");
           thread1.start();        
           thread2.start();        
           
           
    }
 
}