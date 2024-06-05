package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {
		// 1~45 중복되지 않는 로또 번호 6개 출력
		// 1. 배열로 구현
		for (int T = 0; T < 10; T++) {

			int[] arr = new int[6];

			for (int i = 0; i < arr.length; i++) {
				int num;
				do {
					num = (int) (Math.random() * 45) + 1;
				} while (isDuplicate(arr, num));
				arr[i] = num;
			}
			System.out.println(Arrays.toString(arr));
		}

		// 교수님 코드 ----------------
		Random r = new Random();
//		int arr[] = new int[6];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt(45) + 1;
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					i--;
//				}
//			}
//		}
//		System.out.println("---------------------");
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

		// 2. List 구현
		// 자동 박싱되기 때문에 Integer 안써도 알아서 들어가긴 함
		List<Integer> list = new ArrayList<Integer>();

		while (true) {
			int n = r.nextInt(45) + 1;
			if (list.contains(n)) {
				continue;
			} else {
				list.add(n);
			}

			if (list.size() == 6) {
				break;
			}
		}

		System.out.println("---------------------");
		Collections.sort(list);
		System.out.println(list);

		// 3. Set 구현(TreeSet) ==> 중복 허용 X
		System.out.println("---------------------");

		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; set.size() < 6; i++) {
			set.add(r.nextInt(45)+1);
		}
		
		System.out.println(set);
	}

	private static boolean isDuplicate(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}
}
