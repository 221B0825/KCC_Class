package kosa.thread;

public class AccountSharedArea {

	Account a1;
	Account a2;

	synchronized void transfer(int amount) {
		try {
			a1.withdraw(amount);
			System.out.println(a1.getOwnerName() + "님 인출");
			a2.deposit(amount);
			System.out.println(a2.getOwnerName() + "님 입금");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	synchronized int getTotal() {
		return a1.getBalance() + a2.getBalance();
	}

}
