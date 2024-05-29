package kosa.phone;

import java.util.Scanner;

// 전화번호 관리 전반적인 기능
public class Manager {

	// 필드 변수들은 기본적으로 초기값이 존재함 (null 또는 0)
	private PhoneInfo arr[];
	private Scanner sc;
	private int count;

	public Manager() {
		arr = new PhoneInfo[10];
		sc = new Scanner(System.in);
	}

	public void addPhoneInfo() {
		// 키보드로부터 이름, 전화번호, 생년월일을 입력받아
		// PhoneInfo를 생성해서 배열에 추가하는 것
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();

		arr[count++] = new PhoneInfo(name, phoneNo, birth);
		System.out.println(count);
	}

	public void listPhoneInfo() {
		System.out.println("***전체출력***");
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

}
