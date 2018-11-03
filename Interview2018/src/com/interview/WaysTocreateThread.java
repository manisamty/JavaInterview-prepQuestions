package com.interview;


/*Java defines two ways by which a thread can be created.

By implementing the Runnable interface.
By extending the Thread class.*/

class MyThread1 extends Thread
{
 public void run()
 {
  System.out.println("concurrent Thread started running..");
 }
}


class MyThread2 implements Runnable
{
 public void run()
 {
  System.out.println("concurrent Runnable started running..");
 }
}

public class WaysTocreateThread
{
 public static void main( String args[] )
 {
  MyThread1 mt = new  MyThread1();
  mt.start();
  //mt.start();
  //mt.run();
  MyThread2 runn = new MyThread2();
  Thread t = new Thread(runn);
  t.start();
 
 }
}





