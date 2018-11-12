package exercise_6;

import java.util.HashSet;

public class Set {

	HashSet set=new HashSet<Integer>();
	public boolean flag=false;
	
	public synchronized void putElementOnSet() {
		while(flag) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			flag=true;
			Integer number= (int) (Math.random()*100);
			set.add(number);
			notifyAll();
	}
	
	public synchronized HashSet iterateElementOnSet() {
		while(!flag) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			flag=false;
			notifyAll();
			return set;
	}
	
	

}
