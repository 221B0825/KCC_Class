package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// 키보드부터 수학수식을 입력
		// ((2+3)+10)) => 괄호 일치 / 불일치 판단

		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();

		System.out.print("수식입력: ");
		String str = sc.nextLine();

		try {
			for (int i = 0; i < str.charAt(i); i++) {
				char ch = str.charAt(i);

				if (ch == '(') {
					stack.push(ch + "");
				} else if (ch == ')') {
					stack.pop();
				}
			}

			if (stack.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 불일치 합니다.");
			}
		} catch (Exception e) {
			System.out.println("괄호가 불일치 합니다.");
		}
	}

}
