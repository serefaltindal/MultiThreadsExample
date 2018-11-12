package exercise_6;

import java.util.HashSet;
import java.util.Iterator;

public class IterateTask implements Runnable {

	Set set;

	public IterateTask(Set set) {
		this.set = set;
	}

	@Override
	public void run() {
		int iterate=0;
		while (true) {
			HashSet <Integer> hashSet = set.iterateElementOnSet();
			iterate++;
			System.out.println("Wave"+iterate);
			for(Integer number:hashSet) {
				System.out.print("["+number+"] ");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
