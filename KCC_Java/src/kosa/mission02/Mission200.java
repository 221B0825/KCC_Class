package kosa.mission02;

import java.util.Scanner;

public class Mission200 {
	public static void main(String[] args) {
		// 국어, 영어, 수학 => 키보드로 입력 받아 배열로 구현하자.
		// 총점, 평균 구하기 => 메서드 정의 구현
		Scanner sc = new Scanner(System.in);
		String subject[] = {"국어", "영어", "수학"};
		int[] list = new int [subject.length+2];
		
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i]+" 입력: ");
			list[i] = sc.nextInt();
			// sum
			list[subject.length] += list[i];
		}
		
		average(list);
		System.out.println("국어 \t영어\t수학\t총점\t평균");
		for(int n : list) {
			System.out.print(n+"\t");
		}
	}

	private static void average(int[] list) {
		list[list.length-1] = list[list.length-2]/(list.length);
	}

}
