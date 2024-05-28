package kosa.oop;

public class Account {
	// 계좌객체 생성 하기 위해
	// 객체로부터 공통된 데이터 구조와 기능을 추출
	// 상태(데이터): 계좌번호, 계좌주, 잔액 => 멤버변수
	// 행동(기능): 입금하다, 출금하다 => 멤버 메소드

	String accountNo; // 계좌번호
	String ownerName; // 계좌주
	int balance; // 잔액

	// 디폴트 생성자
	public Account() {
	}

	public Account(String accountNo, String ownerName, int balnace) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balnace;
	}

	// 입금하다
	public void deposit(int amount) {
		this.balance += amount;
	}

	// 출금하다
	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("잔액부족");
		}
		this.balance -= amount;
		return amount;
	}

}
