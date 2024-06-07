package kosa.phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// 전화번호 관리 전반적인 기능
public class Manager {

	// 필드 변수들은 기본적으로 초기값이 존재함 (null 또는 0)
	private List<PhoneInfo> phoneInfoList;
	private Scanner sc = DataInput.sc;
	private int count;

	public Manager() {
		phoneInfoList = new ArrayList<PhoneInfo>();
//		sc = new Scanner(System.in);
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

		phoneInfoList.add(new PhoneInfo(name, phoneNo, birth));
	}

	public void listPhoneInfo() {
		System.out.println("**전체내역**");
		for (PhoneInfo p : phoneInfoList) {
			p.show();
		}
	}

	public void searchPhoneInfo() {
		// 검색하고자 하는 이름으로 1개의 PhoneInfo객체의 내용을 출력한다.
		System.out.print("이름: ");
		String name = sc.nextLine();

		int idx = -1;

		for (PhoneInfo p : phoneInfoList) {
			if (p.getPhoneInfo(name) != null) {
				p.show();
				idx = 1;
			}
		}

		if (idx == -1) {
			System.out.println("유저를 찾을 수 없습니다.");
		}

	}

	public void updatePhoneInfo() {
		// 이름 입력 => 해당 phoneInfo 추출 => 수정 전화번호 입력 => 전화번호 수정 완료
		System.out.print("이름: ");
		String name = sc.nextLine();
		int idx = -1;

		for (PhoneInfo p : phoneInfoList) {
			if (p.getName().equals(name)) {
				System.out.print("수정 전화번호: ");
				String phoneNo = sc.nextLine();
				p.setPhoneNo(phoneNo);
				idx = 1;
			}
		}

		if (idx == -1) {
			System.out.println("유저를 찾을 수 없습니다.");
		}

	}

	public void deletePhoneInfo() {
		// 이름 입력 => 대상 객체 검색 => 인덱스 찾기 => 해당 객체 삭제
		System.out.print("이름: ");
		String name = sc.nextLine();
		int idx = -1;

		for (PhoneInfo p : phoneInfoList) {
			if (p.getPhoneInfo(name) != null) {
				phoneInfoList.remove(p);
				idx = 1;
				break;
			}
		}

		if (idx == -1) {
			System.out.println("유저를 찾을 수 없습니다.");
		}

	}

	public void sortPhoneInfo() {
		System.out.println("정렬 기준 선택(오름차순)");
		System.out.println("1.이름 순 2.번호 순 3.생년월일 순");
		String selected = sc.nextLine();

		switch (selected) {
		case "1":
			sortName();
			break;
		case "2":
			sortPhoneNo();
			break;

		case "3":
			sortBirth();
			break;

		default:
			System.out.println("잘못된 입력 값입니다.");
			break;
		}
	}

	private void sortBirth() {
		System.out.println("번호 순 정렬");
		System.out.println("1.오름차순 2.내림차순");
		String selected = sc.nextLine();

		switch (selected) {
		case "1":
			Collections.sort(phoneInfoList, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					return o1.getBirth().compareTo(o2.getBirth());
				}
			});
			listPhoneInfo();
			break;
		case "2":
			Collections.sort(phoneInfoList, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					return -(o1.getBirth().compareTo(o2.getBirth()));
				}
			});
			listPhoneInfo();
			break;

		default:
			break;
		}
	}

	private void sortPhoneNo() {
		System.out.println("번호 순 정렬");
		System.out.println("1.오름차순 2.내림차순");
		String selected = sc.nextLine();

		switch (selected) {
		case "1":
			Collections.sort(phoneInfoList, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					return o1.getPhoneNo().compareTo(o2.getPhoneNo());
				}
			});

			listPhoneInfo();
			break;
		case "2":
			Collections.sort(phoneInfoList, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					return -(o1.getPhoneNo().compareTo(o2.getPhoneNo()));
				}
			});

			listPhoneInfo();
			break;

		default:
			System.out.println("잘못된 입력 값입니다.");
			break;
		}
	}

	private void sortName() {
		System.out.println("이름 순 정렬");
		System.out.println("1.오름차순 2.내림차순");
		String selected = sc.nextLine();

		switch (selected) {
		case "1":
			Collections.sort(phoneInfoList, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});

			listPhoneInfo();
			break;
		case "2":
			Collections.sort(phoneInfoList, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					return -(o1.getName().compareTo(o2.getName()));
				}
			});

			listPhoneInfo();
			break;

		default:
			System.out.println("잘못된 입력 값입니다.");
			break;
		}

	}

}
