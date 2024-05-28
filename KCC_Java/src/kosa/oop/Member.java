package kosa.oop;

public class Member {
	String userName;
	int userAge;

	public Member(String userName, int userAge) {
		this.userName = userName;
		this.userAge = userAge;
	}

	public void printState() {
		System.out.println("이름: " + this.userName);
		System.out.println("나이: " + this.userAge);
	}

}
