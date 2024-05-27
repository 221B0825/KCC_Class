package kosa.mission02;

import java.util.Scanner;

public class Mission209 {

	public static void main(String[] args) {
// 2-9 격자판 최대합

//		5
//		10 13 10 12 15
//		12 39 30 23 11
//		11 25 50 53 15
//		19 27 29 37 27
//		19 13 30 13 19

//		 solution();
		solutionClass();

	}

	// -----------------------------------------

	public static int classMethod(int n, int arr[][]) {
		int answer = 0;
		int sum1 = 0; // 가로
		int sum2 = 0; // 세로

		for (int i = 0; i < n; i++) {
			sum1 = 0;
			sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1 = 0;
		sum2 = 0;
		
		for(int i=0; i<n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n-1-i];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}

	private static void solutionClass() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(classMethod(n, arr));
	}

	// -----------------------------------------
	private static void solution() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int[][] matrix = new int[N][N];

		// input init
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		// search & diagonal line

		int downDiagonal = 0;
		int upDiagonal = 0;
		for (int i = 0; i < N; i++) {
			int rowSum = 0;
			int colSum = 0;
			for (int j = 0; j < N; j++) {
				rowSum += matrix[i][j];
				colSum += matrix[j][i];
				if (i == j) {
					downDiagonal += matrix[i][j];
				}
				if (i + j == (N - 1)) {
					upDiagonal += matrix[i][j];
				}
			}
			sum = Math.max(rowSum, colSum);
		}

		// compare diagonal line
		if (upDiagonal > sum) {
			sum = upDiagonal;
		}
		if (downDiagonal > sum) {
			sum = downDiagonal;
		}

		System.out.println(sum);

	}

}
