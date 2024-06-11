package kosa.phone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

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
		this.phoneInfoList.stream().forEach(p -> p.show());
	}

	public void searchPhoneInfo() {
		// 검색하고자 하는 이름으로 1개의 PhoneInfo객체의 내용을 출력한다.
		System.out.print("이름: ");
		String name = sc.nextLine();

		Stream<PhoneInfo> phoneStream = phoneInfoList.stream();
		phoneStream.forEach(p -> {
			if (p.getName().equals(name)) {
				p.show();
			}
		});

	}

	public void updatePhoneInfo() {
		// 이름 입력 => 해당 phoneInfo 추출 => 수정 전화번호 입력 => 전화번호 수정 완료
		System.out.print("이름: ");
		String name = sc.nextLine();
		phoneInfoList.stream().forEach(p -> {
			if (p.getName().equals(name)) {
				System.out.print("수정 전화번호: ");
				p.setPhoneNo(sc.nextLine());
			}
		});

	}

	public void deletePhoneInfo() throws Exception {
		// 이름 입력 => 대상 객체 검색 => 인덱스 찾기 => 해당 객체 삭제
		System.out.print("이름: ");
		String name = sc.nextLine();

		Stream<PhoneInfo> phoneStream = phoneInfoList.stream();
		PhoneInfo first = phoneStream.filter(p -> p.getName().equals(name)).findFirst()
				.orElseThrow(() -> new Exception("검색 기록이 없습니다"));

		this.phoneInfoList.remove(first);
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

	public void savePhoneInfo() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("phoneInfo.ser")));
			oos.writeObject(this.phoneInfoList);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void openPhoneInfo() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("phoneInfo.ser"));
			this.phoneInfoList = (List<PhoneInfo>)ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
