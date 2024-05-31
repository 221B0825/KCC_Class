package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account; // 참조형(클래스 타입)
		account = new Account("111-1111", "홍길동", 22300); // 객체 생성(메모리 할당)

		try {
			account.withdraw(15000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("계좌번호: " + account.getAccountNo());
		System.out.println("계좌주: " + account.getOwnerName());
		System.out.println("잔액: " + account.getBalance());

	}
}
