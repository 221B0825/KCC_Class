package kosa.thread;

public class AccountPrintThread extends Thread {

	AccountSharedArea sharedArea;

	public AccountPrintThread(AccountSharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			synchronized (sharedArea) {
				System.out.println("잔액 합계: " + sharedArea.getTotal());
			}
		}

		try {
			Thread.sleep(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
