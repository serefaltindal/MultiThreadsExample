package exercise_3;

public class SynchronizedRun {

	
	public static void main (String args[]) throws InterruptedException {
		
		for (int i=0;i<1000;i++) {
			Thread thread=new Thread(new SumSynchronized());
			thread.start();
			thread.join();
		}
	}
}
