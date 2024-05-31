package kosa.oop;

public class CheckingAccount extends Account {
	private String cardNo;

	public CheckingAccount() {

	}

	public CheckingAccount(String accountNo, String ownerName, int balnace, String cardNo) {
		super(accountNo, ownerName, balnace);
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount) throws Exception {
		if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("결제 실패");
		}

		return withdraw(amount);
	}

	@Override
	public void print() {

		System.out.println("자식");
	}

}
