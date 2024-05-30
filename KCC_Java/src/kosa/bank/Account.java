package kosa.bank;

public class Account {

	private String id;
	private long balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String id, long balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(long amount) {
		balance += amount;
	}
	
	public boolean withdraw(long amount) {
		if (balance < amount) {
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}

	public String getId() {
		return id;
	}

	public long getBalance() {
		return balance;
	}

}
