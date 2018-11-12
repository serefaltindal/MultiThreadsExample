package threads;

import run.Demo;

public class Task1 implements Runnable{

	@Override
	public void run() {
	     synchronized (Demo.Lock1) {
	            System.out.println("Thread 1: Holding lock 1...");
	            
	            try { Thread.sleep(10); }
	            catch (InterruptedException e) {}
	            System.out.println("Thread 1: Waiting for lock 2...");
	            
	            synchronized (Demo.Lock2) {
	               System.out.println("Thread 1: Holding lock 1 & 2...");
	            }
	         }
	}

}
