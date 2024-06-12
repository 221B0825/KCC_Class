package kosa.thread;

public class SumThread extends Thread {

	private int sum;
	private int end;
	private int start;

	public SumThread(int start, int end) {
		super();
		this.start = start;
		this.end = end;

	}

	@Override
	public void run() {
//		System.out.println(this.getName());
		for (int i = start; i <= end; i++) {
			sum += i;
		}
	}

	public int getSum() {
		return sum;
	}

}
