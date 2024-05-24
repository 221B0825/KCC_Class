package kosa.basic;

import java.util.HashMap;
import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		// while : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수직방향
		// 1~10까지 합
//		int sum = 0;
//		int i = 1;
//		while (i <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~10까지 합:" + sum);
	
		// -------------------------------
		
		//퀴즈 > 구구단 7단 출력
//		int i = 1;
//		while(i < 10) {
//			System.out.println("7 * "+i+" = "+(7*i));
//			i++;
//		}
		
		// for: 초기식 -> 조건식 -> 명령문 -> 증감식 : 수평방향
//		int sum = 0;
//		for(int i=1; i<11; i++) {
//			sum += i;
//		}
//		System.out.println("1~10까지 합:" + sum);

		// -------------------------------
		
		// 퀴즈 > 1~100까지 2의 배수와 3의 배수가 아닌 숫자만 출력하시오.
		// continue = skip;
//		for(int i=1; i<101; i++) {
//			if(i % 2 == 0 || i % 3 == 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		// -------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		int n = 0;
//		
//		do {
//			System.out.print("입력: ");
//			n = sc.nextInt();
//			
//			// 입력값이 음수이면 계속 돌아감. 양수 입력 시 종료.
//		}while(n < 0);
//	
//		System.out.println("입력 결과: "+n);

		// -------------------------------
		
	// 퀴즈 > 2개의 정수를 입력 받아 b-a의 결과를 출력하자.
	// b > a가 되도록 입력 => a가 b보다 크면 새로 입력 받도록 하자.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("A 입력: ");
//		int a = sc.nextInt();
//		int b = 0;
//		do {
//			System.out.print("B 입력: ");
//			b = sc.nextInt();
//		}while(b < a);
		
		// -------------------------------
		
//		int n = (int)(Math.random()*9)+1;
//		System.out.println(n);
		
		// 퀴즈 3 > 임의의 난수 3개 받아서 서로 중첩되지 않고 출력하기
//		int a;
//		int b;
//		int c;
//		
//		// 조건이 원하는 조건이 아닐 때 == 참이 아닐 때  !!!
//		
//		do {
//			a = (int)(Math.random()*9)+1;
//			b = (int)(Math.random()*9)+1;
//			c = (int)(Math.random()*9)+1;
//		}while(a == b || b == c || a == c);
//		
//		System.out.println(a + " "+ b+ " "+ c);
//		
		// 다른 풀이 ----------------------------
			
//		int a, b, c;
//		a = (int)(Math.random()*9)+1;
//		do {
//			b = (int)(Math.random()*9)+1;
//		}while(a == b);
//		
//		do {
//			c = (int)(Math.random()*9)+1;
//		}while(a == c || b == c);
		
//		System.out.println(a + " "+ b+ " "+ c);
	
	}

}
