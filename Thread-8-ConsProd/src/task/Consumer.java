package task;

import java.util.Vector;

public class Consumer extends Thread {
 
    Producer producer;

    public Consumer(Producer p) {
        producer = p;
    }
 
    @Override
    public void run() {
    	System.out.println("Consumer run");
        try {
            while (true) {
                String message = producer.getMessage();
                System.out.println("Got message: " + message);
                sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
  

 
}