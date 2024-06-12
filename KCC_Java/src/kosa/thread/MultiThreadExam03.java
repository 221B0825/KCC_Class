package kosa.thread;

public class MultiThreadExam03 {
	
	public static void main(String[] args) {
		Thread thread = new Thread(new SmallLetters());
		
		thread.start();
		
		for (char ch = 'ㄱ'; ch <= 'ㅎ'; ch++) {
			System.out.println(ch);
		}
	}

}
