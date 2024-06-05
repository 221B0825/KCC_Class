package kosa.data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		// List 자료구조를 활용하여 키보드로부터 문자열을 입력받아 처리하자.
		List<String> list = new LinkedList<String>();
		// 1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1.데이터 추가 2.데이터 삭제 3.데이터 출력 4.종료");
			System.out.print("메뉴 입력: ");

			int idx = -1;

			String selected = sc.nextLine();
			switch (selected) {
			case "1":
				System.out.print("추가: ");
				list.add(sc.nextLine());
				break;
			case "2":
				System.out.print("삭제: ");
				idx = list.indexOf(sc.nextLine());
				if (idx != -1) {
					list.remove(idx);
				} else {
					System.out.println("존재하지 않습니다.");
				}
				break;
			case "3":
//				for (int i = 0; i < list.size(); i++) {
//					System.out.println(list.get(i));
//				}

				Iterator<String> iter = list.iterator();
				while (iter.hasNext()) {
					System.out.print(iter.next()+" ");
				}
				
				
				System.out.println();
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;

			default:
				break;
			}
		}

	}

}
