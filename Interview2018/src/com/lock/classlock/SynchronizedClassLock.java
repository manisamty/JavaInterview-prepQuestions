package com.lock.classlock;

/*Thread can acquire lock on class’s class object by-
   1.Entering synchronized block
   2.By entering static synchronized methods.
*/
class MyRunnable1 implements Runnable {

	@Override
	public void run() {
		synchronized (SynchronizedClassLock.class) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " " + Thread.currentThread().getName() + " is executing");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

}

public class SynchronizedClassLock {
	public static void main(String args[]) throws InterruptedException {

		MyRunnable1 object1 = new MyRunnable1();
		MyRunnable1 object2 = new MyRunnable1();

		Thread thread1 = new Thread(object1, "Thread-1");
		Thread thread2 = new Thread(object2, "Thread-2");
		thread1.start();
		thread2.start();

	}

}