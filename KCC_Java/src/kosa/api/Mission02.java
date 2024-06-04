package kosa.api;

import java.util.Scanner;

public class Mission02 {

	
	// input: This is simple
	// output: simple
	
	// 가장 긴 단어 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "";
		String[] arr = str.split(" ");

		for (String x : arr) {
			if (x.length() > answer.length()) {
				answer = x;
			}
		}

//		String word = arr[0];
//		for (int i = 1; i < arr.length - 1; i++) {
//			if (arr[i].length() > arr[i + 1].length()) {
//				word = arr[i];
//			} else {
//				word = arr[i + 1];
//			}
//		}
		return answer;
	}

}
