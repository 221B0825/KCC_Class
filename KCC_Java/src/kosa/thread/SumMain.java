package kosa.thread;

public class SumMain {

	public static void main(String[] args) {
		// t1 : 1 ~ 50까지의 합
		// t2 : 51 ~ 100까지의 합
		// main : t1합 + t2합 => 합: 5050 => 문제: join

//		class SumThread extends Thread {
//			private int start;
//			private int end;
//			private int sum;
//
//			public SumThread(int start, int end) {
//				this.start = start;
//				this.end = end;
//			}
//
//			@Override
//			public void run() {
//				for (int i = start; i <= end; i++) {
//					sum += i;
//				}
//			}
//
//			public int getSum() {
//				return sum;
//			}
//		}
//
//		SumThread t1 = new SumThread(1, 50);
//		SumThread t2 = new SumThread(51, 100);
//
//		t1.start();
//		t2.start();
//
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
//
//		int total = t1.getSum() + t2.getSum();
//		System.out.println("Total Sum: " + total);

		// 교수님 코드 --------------

		SumThread t1 = new SumThread(1, 50);
		SumThread t2 = new SumThread(51, 100);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		System.out.println(Thread.currentThread().getName());
		System.out.println("합계: " + (t1.getSum() + t2.getSum()));
	}
}
