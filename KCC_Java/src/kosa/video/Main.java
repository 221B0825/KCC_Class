package kosa.video;

public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("1", "파묘", "최민식");
		Video v2 = new Video("2", "서울의봄", "황정민");

		// GeneralMember와 SpecialMember를 함께 배열에 넣고
		// 각각의 rental(), show() 호출 출력
		// 특히 SpcialMember는 specialPrint()호출되도록 하여라.

		GeneralMember[] arr = { new GeneralMember("a1", "홍길동", "명륜동"), new SpecialMember("a2", "박길동", "명륜2동", 100) };

		for (int i = 0; i < arr.length; i++) {
			arr[i].rental(v1);
			arr[i].show();
			if (arr[i] instanceof SpecialMember) {
				((SpecialMember) arr[i]).specialPrint();
			}
		}

//		GeneralMember gm = new GeneralMember("a1", "홍길동", "명륜동");
//		SpecialMember sm = new SpecialMember("a2", "박길동", "명륜2동", 100);
//				
//		gm.rental(v2);
//		gm.show();
//		
//		sm.rental(v1);
//		sm.show();

	}

}
