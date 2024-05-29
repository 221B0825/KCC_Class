package kosa.video;


public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("1", "파묘", "최민식");
		Video v2 = new Video("2", "서울의봄", "황정민");
		
		GeneralMember gm = new GeneralMember("a1", "홍길동", "명륜동");
		gm.rental(v2);
		gm.show();
	}	

}
