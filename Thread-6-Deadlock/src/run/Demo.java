package run;

import threads.Task1;
import threads.Task2;

public class Demo {

	 public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String args[]) {
		
		Thread thread1=new Thread(new Task1());
		Thread thread2=new Thread(new Task2());
		
		thread1.start();
		thread2.start();
	}
}
