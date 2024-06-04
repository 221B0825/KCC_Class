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

		Scanner sc = new Scanner(System.in);
		System.out.print("입사일 입력: ");
		String input = sc.nextLine();

		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;
		try {
			date = df.parse(input);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		long startTime = date.getTime();
		Date now = new Date();
		long nowTime = now.getTime();
		
		// 약 10년
		long calculate = nowTime - startTime;
		
		Date d = new Date(calculate);
		// start 19"70"
		String year = Integer.toString(d.getYear()-70);
		String month = Integer.toString(d.getMonth());
		
		System.out.println(year+"년 "+month+"개월 재직중");


	}
}
