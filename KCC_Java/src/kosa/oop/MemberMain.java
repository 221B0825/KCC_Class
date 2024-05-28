package kosa.oop;

public class MemberMain {

	public static void main(String[] args) {
		Member user1 = new Member("가나다", 20); // 객체 생성 => 인스턴스화 : m1 => 인스턴스변수
		Member user2 = new Member("마바사", 30);

		user1.printState();
		System.out.println();
		user2.printState();
	}

}
