package kosa.basic;

public class ExceptionExam {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			// 1) noEquals(10, 10);
			// 2)
			noEquals(20, 10);
			System.out.println("2");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		System.out.println("5");

		// 1) 1 3 4 5
		// 2) 1 2 4 5
		System.out.println("done...");
	}

	public static void noEquals(int a, int b) throws Exception {
		if (a == b) {
			throw new Exception("같은 값 안돼");
		}
	}
}
