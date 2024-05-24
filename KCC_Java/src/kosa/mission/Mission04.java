package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// 문자열 비교
//		String a = "abc";
//		String b = "abC";
		// String은 값이 같으면 주소값을 동일하게 가짐. "abc"라는 같은 값이 있으면 따로 만드는 게 아니라 참조해버림
//		if (a.equals(b)) {
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}

		// 두 정수와 연산자 문자열을 입력 받아
		// 사칙연산 결과를 출력하시오. (계산기)
		// ex > 정수 1: 10
		// 정수 2: 20
		// 연산자: +
		// 결과 > 30

		Scanner sc = new Scanner(System.in);

		System.out.print("num1: ");
		int num1 = sc.nextInt();
		System.out.print("num2: ");
		int num2 = sc.nextInt();
		System.out.print("연산자: ");
		String op = sc.next();

		if (op.equals("+")) {
			System.out.println("result: " + (num1 + num2));
		} else if (op.equals("-")) {
			System.out.println("result: " + (num1 - num2));

		} else if (op.equals("*")) {
			System.out.println("result: " + (num1 * num2));

		} else if (op.equals("/")) {
			System.out.println("result: " + (num1 / num2));
		}

	}

}
