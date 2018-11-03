package com.compareblecomparatorExm;

import java.util.LinkedList;
import java.util.List;

class Producer implements Runnable{
	List<Integer> sharedQueue;
	public Producer() {
		// TODO Auto-generated constructor stub
		sharedQueue=new LinkedList<Integer>();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			
		
		for(int i=0;i<=10;i++){
			System.out.println("Producer is Producing :" +i);
			sharedQueue.add(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		System.out.println("Production is Over");
		}
	}
	
}
class Consumer implements Runnable{
Producer producer;
public Consumer(Producer producer) {
	// TODO Auto-generated constructor stub
	this.producer=producer;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this.producer) {
			try {
				this.producer.wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int size=this.producer.sharedQueue.size();
			for(int i=0;i<size;i++){
				System.out.println("Consumer has consumed :"+this.producer.sharedQueue.remove(0));
			}
		}
		
	}
	
}
public class ProdCOnsWN {
public static void main(String[] args) {
	Producer p=new Producer();
	Consumer c=new Consumer(p);
	
	Thread t1=new Thread(p);
	Thread t2=new Thread(c);
	
	t1.start();
	t2.start();
}
}
