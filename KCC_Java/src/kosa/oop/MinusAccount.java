package kosa.oop;

public class MinusAccount extends Account {
	private int creditLine; // 마이너스 한도

	public MinusAccount() {

	}

	public MinusAccount(String accountNo, String ownerName, int balnace, int creditLine) {
		super(accountNo, ownerName, balnace);
		this.creditLine = creditLine;
	}

	// 오버라이딩
	// 1. 상속관계
	// 2. 메서드의 시그니처(접근제어자, 리턴형, 이름, 파라미터)는 일치
	@Override
	public int withdraw(int amount) throws Exception {
		if (getBalance() + creditLine < amount) {
			throw new Exception("잔액부족");
		} else {

			int balance = getBalance() - amount;
			setBalance(balance);
			return balance;
		}
	}

}
