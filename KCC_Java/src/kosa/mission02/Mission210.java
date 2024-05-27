package kosa.mission02;

import java.util.Scanner;

public class Mission210 {

	// 갤러그 문제 .txt
	public static void main(String[] args) {

//		3
//		7 1
//		8 3
//		4 4

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			// 최초 종현 (2배 상승)
			int A = sc.nextInt();
			// 최초 종원 (3배 상승)
			int B = sc.nextInt();

			int day = 0;
			while (A >= B) {
				day++;
				A = A * 2;
				B = B * 3;
			}

			System.out.println("#" + (i + 1) + " " + day);

		}

	}

}
