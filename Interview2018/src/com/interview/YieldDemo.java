package com.interview;

//MyThread extending Thread
class MyThread extends Thread
{
 public void run()
 {
     for (int i=0; i<5 ; i++)
         System.out.println(Thread.currentThread().getName()
                             + " child control");
 }
}

//Driver Class
public class YieldDemo
{
 public static void main(String[]args)
 {
     MyThread t = new MyThread();
     t.start();

     for (int i=0; i<5; i++)
     {
         // Control passes to child thread
         Thread.yield();

         System.out.println(Thread.currentThread().getName()
                 + " in control");
}
}
}