package kosa.bank;

public class Customer {

	private String id;
	private String name;
	private Account account;

	public Customer() {

	}

	public Customer(String id, String name, long balance) {
		this.id = id;
		this.name = name;
		this.account = new Account(id, balance);
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
