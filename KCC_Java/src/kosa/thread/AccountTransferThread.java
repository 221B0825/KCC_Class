package kosa.thread;

public class AccountTransferThread extends Thread {

	AccountSharedArea sharedArea;

	public AccountTransferThread(AccountSharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sharedArea.transfer(1000);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

}
