package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {

		// 성적관리 구현
		// 국어, 영어, 수학 점수를 키보드로부터 입력받고
		// 총점과 평균을 출력하세요. (단 평균은 실수형)

		Scanner sc = new Scanner(System.in);
		int kor, eng, mat;
		int total;
		int aver;

		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		mat = sc.nextInt();

		total = kor + mat + eng;
//		aver = total / (double) 3;
		// casting
		aver = (int) (total / 3.0);

		System.out.println("총점: " + total);
		System.out.println("평균: " + aver);
	}
}
