package kosa.basic;

public class MethodExam {

	// 메서드 정의
	// 메서드 : 재사용성을 높이기 위해서 사용 - 코드 중복 최소화
	// 접근제어자, (static 여부), 리턴형, 메서드 이름(파라미터(인자))
	public static void main(String[] args) {
//		printing('#', 10);
//		printing('?', 20);
//		printing('!', 30);

		int sum = add(10, 20);
		System.out.println(sum);
	}

	public static void printing(char ch, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}
