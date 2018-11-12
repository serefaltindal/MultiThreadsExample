package task;

import service.Account;

public class AddPennyTask implements Runnable {

	Account account=null;

	public AddPennyTask(Account account) {
		this.account=account;
	}

	@Override
	public void run() {
		account.deposit(1);
	}

}
