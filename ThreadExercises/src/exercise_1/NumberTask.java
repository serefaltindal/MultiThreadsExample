package exercise_1;

public class NumberTask implements Runnable {

	int count;
	
	public NumberTask(int count) {
		this.count=count;
	}

	@Override
	public void run() {

			for(int i=0;i<count;i++) {
				System.out.print(i);
			}
	}
}
