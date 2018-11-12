package exercise_6;

import java.util.HashSet;

public class Run {

	public static void main(String args[]) {

		Set set=new Set();
		
		Thread putTask=new Thread(new PutTask(set));
		Thread iterateTask= new Thread( new IterateTask(set));
		
		putTask.start();
		iterateTask.start();
		
	}
}
