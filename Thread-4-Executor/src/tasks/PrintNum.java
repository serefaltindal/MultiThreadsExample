package tasks;

public class PrintNum implements Runnable{

	int cnt;
	
	public PrintNum(int cnt) {
	this.cnt=cnt;	
	}

	@Override
	public void run() {
		int i=0;
		while(i<this.cnt) {
			System.out.println("Thread Name:"+Thread.currentThread().getName()+" "+i);
			i++;
			
		}
		
	}
}
