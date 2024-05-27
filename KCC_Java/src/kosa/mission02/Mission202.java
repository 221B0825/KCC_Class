package kosa.mission02;

import java.util.Arrays;
import java.util.Scanner;

public class Mission202 {
	public static void main(String[] args) {
		// 2_2 보이는 학생 선생님이 볼 수 있는 학생의 수
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int[] students = new int[N]; 
//		for(int i=0; i<N; i++) {
//			students[i] = sc.nextInt();
//		}
//		
//		solution(students);
//		solutionClass(students);
		
		//성적관리 프로그램에서 여러 명의 성적을 구현해 보자.
		// 번호	국어	영어	수학	총점	평균
		//	1	90	80	70	240	80
		//	2	50	40	30	120	40
		// ========================
		//	합계	140	120	100
		//	평균	70	60	50
		// 00 01 02 / 10 11 12
		int score[][] = {{90, 80, 70},{50, 40, 30}};
		
		gradeClass(score);
		
		//grade(score);
		
		
	}
	
	private static void gradeClass(int[][] score) {
		int korTotal = 0;
		int engTotal = 0;
		int matTotal = 0;
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<score.length;i++) {
			int sum = 0;
			int avg = 0;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			matTotal += score[i][2];
			
			System.out.print((i+1)+"\t");
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j]+"\t");
			}
			
			avg = sum / score[i].length;
			System.out.println(sum+"\t"+avg);
			
		}
		
		System.out.println("=============================================");
		System.out.print("\t");
		System.out.print(korTotal+"\t");
		System.out.print(engTotal+"\t");
		System.out.print(matTotal+"\t");
		System.out.println();
		System.out.print("\t"+korTotal/score.length);
		System.out.print("\t"+engTotal/score.length);
		System.out.print("\t"+matTotal/score.length);
		System.out.println();
		
	}

	private static void grade(int[][] score) {
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		int[] subject = {0, 0, 0};
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			double average = 0;
			System.out.print((i+1)+"\t");
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				subject[j] += score[i][j];
				System.out.print(score[i][j]+"\t");
			}
			average = sum / (double)(score[i].length);
			System.out.println(sum+"\t"+average);
		}
		
		System.out.println("=============================================");
		System.out.print("총점\t");
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		System.out.print("평균\t");
		for(int j=0; j<subject.length; j++) {
			System.out.print(subject[j]/(double)2+"\t");
		}
		
	}

	private static void solutionClass(int[] arr) {
		int answer = 1;
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		System.out.println(answer);
	}

	private static void solution(int[] students) {
		int count = 1;
		for(int i=students.length-1;i>1;i--) {
			boolean flag = true;
			for(int j=i-1; j>0; j--) {
				if(students[i] < students[j]) {
					flag = false;
				}
			}
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
	}

}
