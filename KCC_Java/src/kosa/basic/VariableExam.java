package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// 변수는 데이터를 담는 그릇 ex) 홍길동 / 100 / 3.14 / true
		// byte, short, int, long, float, double, boolean, char : primitive type
		int num; // 변수 선언: 메모리 할당
		int arr[]; // 배열 선언 : Object Type
		num = 10;

		// 변수 선언, 초기화
		int num2 = 100;
		
		// 문자열: String
		String name = "홍길동"; // String name = new String("홍길동");
		System.out.println(name+" 님");
		
		// 변수 선언 주의사항
		// 변수명 : 특수문자 X, 숫자 시작 X, 소문자로 시작, _도 사용 가능
		
		// 기본 리터럴: 100 => int, "" => String, 'A' => char, true => boolean, 3.14 => double
		float a = 3.14f;
		
		//casting(형변환)
		// 기준: byte < short < int < long < float < double
		// int<=>char 상호 형변환 가능
		double b = 100;
		int c = (int) 3.14;
		System.out.println(c);
		
		float num3 = 3.14f;
		long num4 = 100L;
		
		int num5 = 010;
		System.out.println(num5);
	}
}
