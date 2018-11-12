package run;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import service.Account;
import task.AddPennyTask;

public class AccountWithoutSync {


	private static Account account=new Account();
	
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++) {
			executorService.execute(new AddPennyTask(account));
		}
		
		executorService.shutdown();
		
		while(!executorService.isTerminated()) {
		}
	
	System.out.println("What is balance->"+account.getBalance());
				
	}

}
