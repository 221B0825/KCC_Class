package kosa.api;

import java.util.Scanner;

public class Mission01 {

	
	// input : Computercooler
	//       : c
	// output: 2
	
	// 입력한 글자가 나오는 횟수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		char c = sc.nextLine().charAt(0);

		System.out.println(solution(str, c));
	}

	private static int solution(String str, char c) {
		int answer = 0;

		str = str.toUpperCase();
		c = Character.toUpperCase(c);

		// 1. for문
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == c) {
//				answer++;
//			}
//		}

		// 2. 향상된 for문
		for (char x : str.toCharArray()) {
			if (x == c) {
				answer++;
			}
		}
		return answer;
	}

}
