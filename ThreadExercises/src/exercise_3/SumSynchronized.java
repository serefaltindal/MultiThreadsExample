package exercise_3;

public class SumSynchronized implements Runnable {

	public static  int  sum = 0;

	@Override
	public void run() {
			sumMetod();
	}

	public synchronized void sumMetod() {
			System.out.println(sum++);
    }

}
