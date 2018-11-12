package exercise_6;

import java.util.HashSet;

public class PutTask implements Runnable {

	Set set;

	public PutTask(Set set) {
		this.set = set;
	}

	@Override
	public void run() {
		while (true) {
			set.putElementOnSet();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
