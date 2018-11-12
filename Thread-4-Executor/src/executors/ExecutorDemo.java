package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tasks.PrintChar;
import tasks.PrintNum;

public class ExecutorDemo {

	public static void main(String[] args) {
		
		ExecutorService executor= Executors.newCachedThreadPool();
		executor.execute(new PrintChar('a',100));
		executor.execute(new PrintChar('b',100));
		executor.execute(new PrintNum(100));
		
		executor.shutdown();
	}
}
