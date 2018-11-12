package run;

import controller.PrintDemo;
import task.Task;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDemo printDemo=new PrintDemo();
		Thread task1=new Thread(new Task(printDemo));
		Thread task2=new Thread(new Task(printDemo));
		
		task1.start();
		task2.start();
		
		try {
			task1.join();
			task2.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
