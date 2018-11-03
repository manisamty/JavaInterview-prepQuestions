package com.objectlevel_classlevelock;

public class Display{
	public synchronized void wish(String name) throws InterruptedException{
        for(int i=0; i<5; i++){
              System.out.println("Good morning "+name);
              Thread.sleep(2000);
        }
  }
}

