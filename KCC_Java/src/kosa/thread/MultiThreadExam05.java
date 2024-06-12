package kosa.thread;

public class MultiThreadExam05 {

	public static void main(String[] args) {
		AccountSharedArea sharedArea = new AccountSharedArea();

		sharedArea.a1 = new Account("111-1111", "가나다", 10000);
		sharedArea.a2 = new Account("222-2222", "가나다", 5000);

		AccountTransferThread att = new AccountTransferThread(sharedArea);
		AccountPrintThread apt = new AccountPrintThread(sharedArea);

		att.start();
		apt.start();

	}

}
