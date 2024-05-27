package kosa.mission02;

import java.util.Scanner;

public class Mission201 {

	public static void main(String[] args) {
		// 2_1 큰 수 출력
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
		}

		int[] answer = solution(numbers);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
		
	}

	private static int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		int count = 0;
		answer[count++] = numbers[0];
		
		for(int i=1; i<answer.length; i++) {
			if(numbers[i]> numbers[i-1]) {
				answer[count++] = numbers[i];
			}
		}
		
		int[] answerRemoveZero = new int[count];
		for(int i=0; i<count; i++) {
			answerRemoveZero[i] = answer[i];
		}
		
		// 원본 배열, 0번째부터, 복사할 배열, 0번째부터, count만큼
		System.arraycopy(answer, 0, answerRemoveZero, 0, count);
		
		return answerRemoveZero;
		
//		for (int i = 0; i < numbers.length; i++) {
//			if (i == 0) {
//				System.out.print(numbers[i] + " ");
//			} else {
//				if (numbers[i - 1] < numbers[i]) {
//					System.out.print(numbers[i] + " ");
//				}
//			}
//		}
	}

}
