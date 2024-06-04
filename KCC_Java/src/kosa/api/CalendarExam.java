package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
//		GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
//		System.out.println(gc);
		String now = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 " + gc.get(Calendar.DATE) + "일 "
				+ gc.get(Calendar.HOUR) + "시 " + gc.get(Calendar.MINUTE) + "분";
		System.out.println(now);

		gc.add(Calendar.DATE, 100);

		String future = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 " + gc.get(Calendar.DATE)
				+ "일 " + gc.get(Calendar.HOUR) + "시 " + gc.get(Calendar.MINUTE) + "분";
		System.out.println("100일 후: " + future);

		gc.set(2022, 5, 4);
		gc.add(Calendar.DATE, 1000);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str = sdf.format(gc.getTime());
		System.out.println(str);

		// 퀴즈: 2024 ~ 2030년까지 자신의 생일이 무슨 요일?
		// 방법 1)
		char[] week = { '일', '월', '화', '수', '목', '금', '토' };

		for (int i = 2024; i <= 2030; i++) {
			gc.set(i, 5, 4); // 6월 4일
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+" 년의 생일은 "+c+"요일입니다.");
		}

		// -------------------
		// 방법 2)
		Calendar findDay = Calendar.getInstance();
		findDay.set(2024, 8, 25);

		for (int i = 0; i < 7; i++) {
			String day = checkDay(findDay.get(Calendar.DAY_OF_WEEK));
			System.out.println(findDay.get(Calendar.YEAR) + "년 : " + day);
			findDay.set(Calendar.YEAR, (findDay.get(Calendar.YEAR)) + 1);
		}

	}

	private static String checkDay(int i) {
		// TODO Auto-generated method stub
		String answer = "";

		switch (i) {
		case 1:
			answer = "일";
			break;
		case 2:
			answer = "월";
			break;
		case 3:
			answer = "화";
			break;
		case 4:
			answer = "수";
			break;
		case 5:
			answer = "목";
			break;
		case 6:
			answer = "금";
			break;
		case 7:
			answer = "토";
			break;

		default:
			break;
		}

		return answer;
	}

}
