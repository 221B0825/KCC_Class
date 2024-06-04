package kosa.api;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);

		// 주소 값 비교 ==
		// String 값 비교 - equals
		if (p1.equals(p2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		System.out.println(p1.toString());
	}

}
