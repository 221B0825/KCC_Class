package kosa.oop;

public class Member {
	// 회원정보에 대한 클래스와 객체를 생성 후 출력해 봅시다.
	// 상태, 행동 구성
	private String userName;
	private int userAge;

	public Member(String userName, int userAge) {
		this.userName = userName;
		this.userAge = userAge;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public void printState() {
		System.out.println("이름: " + this.userName);
		System.out.println("나이: " + this.userAge);
	}

}
