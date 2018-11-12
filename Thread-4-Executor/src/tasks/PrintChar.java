package tasks;

public class PrintChar implements Runnable{

	char harf;
	int cnt;
	public PrintChar(char harf,int cnt) {
		
		this.harf=harf;
		this.cnt=cnt;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<this.cnt;i++) {
			System.out.println("Thread Name:"+Thread.currentThread().getName()+" "+this.harf);
		}		
	}

}
