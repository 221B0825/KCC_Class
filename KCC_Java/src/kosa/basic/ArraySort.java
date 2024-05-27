package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// 배열내용 정렬
		int arr[] = { 3, 2, 5 };

		System.out.println(Arrays.toString(arr));

		// 오름차순
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// 내림차순 출력(for문)
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[arr.length-1-i]+",");
//		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + ", ");
		}

		// ---------------

		// 내림차순 정렬(for문)
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=i; j<arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//	
		// ---------------

		int arr2[][] = { { 2, 90 }, { 1, 60 }, { 3, 20 } }; // [3][2]
		Arrays.sort(arr2, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// 정렬기준 작성 => 2차원 배열 안에 1차원 첫 번째 인덱스를 기준으로 오름차순
				if (o1[0] < o2[0]) {
					// 자리 이동 X
					return -1;
				} else if (o1[0] > o2[0]) {
					// 자리 바꿈 (양수 값 리턴)
					return 1;
				}
				// 자리 이동 X
				return 0;
			}
		});
		
		System.out.println(Arrays.deepToString(arr2));

	}

}
