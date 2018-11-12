package task;

import controller.PrintDemo;

public class Task implements Runnable{

	PrintDemo PD;
	
	public Task(PrintDemo PD) {
		this.PD=PD;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" starting");
		synchronized (PD) {
			PD.printCount();
		}
		System.out.println(Thread.currentThread().getName()+" existing");
	}
	
 

}
