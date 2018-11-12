package service;

public class Account {
	
	private int balance=0;
	
	public int getBalance() {
		return this.balance;
	}
	
	public void deposit(int amount) {
		int newbalance=this.balance+amount;
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.balance=newbalance;
	}

}
