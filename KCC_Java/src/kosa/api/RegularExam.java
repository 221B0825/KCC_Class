package kosa.api;

import java.util.Scanner;

public class RegularExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String str = sc.nextLine();

		// abc문자를 포함 여부 체크

//		if (str.matches(".*abc.*")) {
//			System.out.println("매칭");
//		}else {
//			System.out.println("매칭 실패");
//		}

		// 숫자만 3자리 유무 판단 ==> \\
//		if (str.matches("[\\d]{3}")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("매칭 실패");
//		}

		// 알파벳, 숫자만 5자리 이상
//		if (str.matches("[\\w]{5,}")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("매칭 실패");
//		}

		// 한글만 3자리 이상 5자리 이하
//		if (str.matches("[가-힣]{3,5}")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("매칭 실패");
//		}

		// 이메일 검증
		// abc123@gmail.com
		
		// X
		// 123abc@gmail.com
		// abc123gamil.com
		// abc123@gamil.comcom
		if (str.matches("^[a-zA-Z][\\w]+@[\\w]+(\\.[\\w]{3}$)")) {
			System.out.println("매칭");
		} else {
			System.out.println("매칭 실패");
		}
		
		if (str.matches("^[\\D]\\w+@\\w+\\.\\w{2,3}$")) {
			System.out.println("매칭");
		} else {
			System.out.println("매칭 실패");
		}
		
	}

}
