package kosa.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam02 {

	public static void main(String[] args) {
		String data[] = { "bat", "bba", "bbg", "bonus", "CA", "ca", "c232", "car", "date", "dic", "diraaa" };

		// ca 랑 car 만 뽑기
//		Pattern p = Pattern.compile("c[a-z]*");
		
		// 영문만
//		Pattern p = Pattern.compile("[a-zA-Z]*");

		// b로 시작하는 모든 것들
//		Pattern p = Pattern.compile("^b[a-zA-Z]*");
//
//		for (int i = 0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if (m.matches()) {
//				System.out.println(data[i]);
//			}
//		}
		

		// 특수문자 ? 를 기준으로 그룹화하는 것
//		String source = "ab?cd?ef?gh";
//		String reg = "(\\w*)";
//		
//		Pattern p = Pattern.compile(reg);
//		Matcher m = p.matcher(source);
//		
//		while(m.find()) {
//			System.out.println(m.group());
//		}
		
		
		String source = "HP: 010-1111-1111, HOME: 02-222-2222";
//		String reg = "((010|02)\\-([0-9]{3,4})\\-[0-9]{4})";
		// 교수님 코드 ------------------
		String reg = "(\\d{2,3}-\\d{3,4}-\\d{4})";
		//---------------------------
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(source);
		
		while (m.find()) {
			System.out.println(m.group());
		}				
		
	}

}
