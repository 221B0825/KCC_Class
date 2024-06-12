package kosa.thread;

public class MultiThreadExam {

	public static void main(String[] args) {
		Thread thread = new DigitThread();
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
