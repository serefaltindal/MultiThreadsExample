package controller;

public class PrintDemo {

	public void printCount() {
		for (int i=0;i<5;i++) {
			System.out.println("Thread"+Thread.currentThread().getName()+" i->"+i);
		}
	}
}
