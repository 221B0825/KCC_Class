package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		// 지역변수(로컬변수) 특징
		// 1. 반드시 초기화 후 사용
		// 2. 선언된 변수는 정의된 범위 안에서만 사용 가능

		int num = 1;
		int a = 0;
		if (num == 1) {
			a = 100;
		}
		System.out.println("a: " + a);

//		for(int i=0; i<=10; i++) {
//			System.out.println(i+" ");
//		}

		int i = 1;
		for (; i <= 10; i++) {
			System.out.print(i + " ");
		}

		// i = 11;
		System.out.println("최종 i 값: " + i);

		// 변수 사용시 고민
		// 1. 어떤 종류의 데이터? => 데이터 타입 선언 결정
		// 2. 데이터를 어디까지 사용하는지? => 변수 선언 위치 결정

		// 연산자 %
		System.out.println(10 % 3);

		if (11 % 2 == 0) {
			System.out.println("2의 배수");
		} else {
			System.out.println("2의 배수 아님");
		}

		int num2 = 1;
		// num2 = num2 + 1;
		// num2 +=1;
		num2++;
		System.out.println(num2);

		int x = 10;
		int y = 0;

		y = x++;

		// 증감자는 출력문에도 영향을 미침
		System.out.println("x: " + x++);
		System.out.println("y: " + y);

		double d = 3.14 + 1;
		System.out.println(d);
		if (d == 4.14) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		int b = 10;
		int c = 20;
		
		int max = (b > c) ? b : c;

	}

}
