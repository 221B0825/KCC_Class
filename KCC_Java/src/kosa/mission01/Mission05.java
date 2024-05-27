package kosa.mission01;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// 메뉴를 선택해서 해당 메뉴 명령문 실행
		// 1. 추가
		// 2. 출력
		// 3. 검색
		// 4. 종료

		Scanner sc = new Scanner(System.in);
		while (true) {
			printMenu();
			int selected = sc.nextInt();
			switch (selected) {
			case 0:
				selected = sc.nextInt();
				break;
			case 1:
				System.out.println("추가 선택");
				break;
			case 2:
				System.out.println("출력 선택");
				break;
			case 3:
				System.out.println("검색 선택");
				break;
			case 4:
				System.out.println("종료");
				return;

			}
		}
	}

	public static void printMenu() {
		System.out.println("1. 추가");
		System.out.println("2. 출력");
		System.out.println("3. 검색");
		System.out.println("4. 종료");
	}

}
