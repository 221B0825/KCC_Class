package kosa.api;

import java.util.Scanner;

public class Mission03 {

	
	// input: as12fs4
	// output: 124
	
	// 문자열 입력 받아서 숫자만 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(soilution(str));

	}

	private static int soilution(String str) {
		String answer = "";

		char[] arr = str.toCharArray();

//		for (char x : str.toCharArray()) {
//			if (Character.isDigit(x)) {
//				answer += x;
//			}
//		}

		for (char x : str.toCharArray()) {
			if (x >= 48 && x <= 57) {
				answer += x;
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			// isDigit
//			if (Character.isDigit(arr[i])) {
//				answer += arr[i];
//			}
//		}

		return Integer.parseInt(answer);
	}

}
