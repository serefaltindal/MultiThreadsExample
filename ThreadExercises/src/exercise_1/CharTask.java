package exercise_1;

public class CharTask implements Runnable{

	int count;
	char harf;
	Thread thread;
	
	public CharTask(char harf,int count,Thread thread) {
		this.count=count;
		this.harf=harf;
		this.thread=thread;
	}

	@Override
	public void run() {
		
		for (int i=0;i<count;i++) {
			System.out.print(harf);
			if(i==0) {
				try {
					thread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	
}
