package threads;

import run.Demo;

public class Task2 implements Runnable{

	@Override
	public void run() {
	     synchronized (Demo.Lock2) {
	            System.out.println("Thread 2: Holding lock 2...");
	            
	            try { Thread.sleep(10); }
	            catch (InterruptedException e) {}
	            System.out.println("Thread 2: Waiting for lock 1...");
	            
	            synchronized (Demo.Lock1) {
	               System.out.println("Thread 2: Holding lock 1 & 2...");
	            }
	         }
	}

}
