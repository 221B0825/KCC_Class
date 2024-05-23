package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {

	public static void main(String[] args) {
		// 키보드로부터 데이터 입력
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력: ");
//		int num = Integer.parseInt(sc.nextLine()); // 10 + enter 값이 들어감. 10이 들어가면서 enter값이 str에 들어가게 됨
//
//		// sc.nextLine();
//
//		System.out.print("문자열 입력: ");
//		String str = sc.nextLine();
//
//		System.out.println(num);
//		System.out.println(str);

		// int <==> char
		char ch = 'A';
//		System.out.println((int)ch);

		for (int i = 65; i < 91; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();

		// int <==> String
		String num2 = "100";
		int num3 = Integer.parseInt(num2);
		int result = num3 + 100;
		System.out.println(result);

		int num4 = 10;
		String num5 = String.valueOf(num4);
		String num6 = num4 + "";

		String str = 7 + "7" + 7;
		System.out.println(str);
	}
}
