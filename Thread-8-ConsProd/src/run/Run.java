package run;

import java.util.Vector;

import task.Consumer;
import task.Producer;

public class Run {

	public final static int MESSAGE_SIZE=5;
	
	public static void main (String args[]) {
		
	    Vector messages = new Vector();
		
	    Producer producer=new Producer(messages);
	    Thread consumer=new Consumer(producer);
		
		consumer.start();
		producer.start();
		
	}
}
