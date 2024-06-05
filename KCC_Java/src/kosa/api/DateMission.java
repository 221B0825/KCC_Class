package kosa.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateMission {

	public static void main(String[] args) {
		// 키보드 => 날짜 입력 2014/06/04
		// 입사일을 입력 받아 => 몇년 몇개월 재직 중

		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);

		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		Date inDate = null;

		while (sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("재입력: ");
			}
		}

		Calendar cal = Calendar.getInstance(); // 입사일
		cal.setTime(inDate);

		Calendar today = Calendar.getInstance(); // 오늘 날짜

		// 총일수 = getTimeInMillis 단위가 밀리세컨이라, 시. 분. 초. 그리고 천을 곱해줘야 일수가 나옴
		long day = (today.getTimeInMillis() - cal.getTimeInMillis()) / (24 * 60 * 60 * 1000);

		int year = (int) (day / 365);
		int month = (int) (day % 365) / 30;

		System.out.println("재직 기간: " + year + "년 " + month + "개월");

		// ----------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입사일 입력: ");
//		String input = sc.nextLine();
//
//		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
//		Date date = null;
//		try {
//			date = df.parse(input);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		
//		long startTime = date.getTime();
//		Date now = new Date();
//		long nowTime = now.getTime();
//		
//		// 약 10년
//		long calculate = nowTime - startTime;
//		
//		Date d = new Date(calculate);
//		// start 19"70"
//		String year = Integer.toString(d.getYear()-70);
//		String month = Integer.toString(d.getMonth());
//		
//		System.out.println(year+"년 "+month+"개월 재직중");

	}
}
