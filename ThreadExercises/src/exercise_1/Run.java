package exercise_1;

public class Run {

	public static  void main(String [] args) {
		
		Thread task1=new Thread(new NumberTask(100));
		Thread task2=new Thread(new CharTask('a',100,task1));
		Thread task3=new Thread(new CharTask('b',100,task2));
		
		task1.start();
		task2.start();
		task3.start();

		
	}
}
