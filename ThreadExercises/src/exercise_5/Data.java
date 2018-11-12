package exercise_5;

public class Data {

	private String packet;
	
	 // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;
    
    public synchronized void send(String packet) {
    	while(!transfer) {
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Interrupted Exception");
			}
    	}
    	transfer=false;
    	
    	this.packet=packet;
    	notifyAll();
    }
    
    public synchronized String receive() {
    	while(transfer) {
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Interrupted Exception");
			}	
    	}
    	transfer =true;
    	
    	notifyAll();
    	return this.packet;
    }
}
