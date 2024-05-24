package kosa.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		// 임의의 정수 값에 대하여 전체 자리수 중 짝수, 홀수의 개수를 구하자.
		// 5자리 수 ex)12345
		// 짝수의 개수: 2개
		// 홀수의 개수: 3개

		Scanner sc = new Scanner(System.in);
		System.out.print("5자리 숫자 입력: ");
		String input = sc.nextLine();
		int even = 0;
		int odd = 0;

//		for(int i=0; i<input.length();i++) {
//			if(input.charAt(i) % 2 == 0) {
//				even++;
//			}else {
//				odd++;
//			}
//		}

		for (int i = 0; i < input.length(); i++) {
			int num = input.charAt(i) - '0';
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.println("짝수의 개수: " + even);
		System.out.println("홀수의 개수: " + odd);

		// -------------------------------------
		Scanner sc2 = new Scanner(System.in);
		System.out.print("5자리 숫자 입력: ");
		int num = sc.nextInt();

		int even2 = 0;
		int odd2 = 0;

		even2 += (num / 10000 % 2 == 0) ? 1 : 0;
		even2 += (num / 1000 % 10 % 2 == 0) ? 1 : 0;
		even2 += (num / 100 % 10 % 2 == 0) ? 1 : 0;
		even2 += (num / 10 % 10 % 2 == 0) ? 1 : 0;
		even2 += (num % 2 == 0) ? 1 : 0;

		odd2 = 5 - even2;

		System.out.println("짝수의 개수: " + even2);
		System.out.println("홀수의 개수: " + odd2);
	}

}
