package kosa.api;

import java.util.Calendar;

public class CalendarExam02 {

	public static void main(String[] args) {
		// 2024 6월 달력 만들기
		// <2024년 6월>
		// 일 월 화 수 목 금 토
		// 1
		// 2 3 4 5 6 7 8

		Calendar gc = Calendar.getInstance();

		int n = gc.getActualMaximum(Calendar.DATE);
		gc.set(2024, 5, 1); // 2024 6월
		int week= gc.get(Calendar.DAY_OF_WEEK);
		System.out.println("<2024년 6월>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");


		for(int i =1; i<week; i++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=n; i++) {
			System.out.print(i+"\t");
			if((week + i -1) % 7 == 0) {
				System.out.println();
			}
		}
		
		
//		int n = gc.getActualMaximum(Calendar.DATE);
//		gc.set(2024, 5, 1); // 2024 6월
//		int startDay = gc.get(Calendar.DAY_OF_WEEK);
//		int date = 1;
//		
//		System.out.println("<2024년 6월>");
//		System.out.println("일\t월\t화\t수\t목\t금\t토");
//		for(int i=startDay; i<8; i++) {
//			System.out.print("\t");
//		}
//		System.out.print(date++);
//		System.out.println();
//		
//		for(int i=1; i<n; i++) {
//			System.out.print((date++)+"\t");
//			if(i%7 == 0) {
//				System.out.println();
//			}
//		}

	}

}
