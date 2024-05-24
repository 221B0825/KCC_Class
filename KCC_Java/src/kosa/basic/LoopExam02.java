package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {

		// 중첩 for문
		// 전체 구구단 출력
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//		}

		// 퀴즈 > 4x + 5y = 60 => x, y를 구하자 (모든 경우의 수)

//		outerLabel:
//		for (int x = 0; x < 16; x++) {
//			for (int y = 0; y < 13; y++) {
//				if(4*x+5*y == 60) {
//					System.out.println("("+x+" , "+y+")");
//					break outerLabel;
//				}
//			}
//		}

		// 퀴즈 >
//		*
//		**
//		***
//		****
//		*****
//		*****
//		****
//		***
//		**
//		*

		for (int n = 1; n < 6; n++) {
			for (int m = 0; m < n; m++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
