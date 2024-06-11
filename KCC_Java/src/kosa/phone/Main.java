package kosa.phone;

public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		while (true) {
			try {
				printMenu();
				String menu = DataInput.sc.nextLine();
				switch (menu) {
				case "1":
					m.addPhoneInfo();
					break;
				case "2":
					m.listPhoneInfo();
					break;
				case "3":
					m.searchPhoneInfo();
					break;
				case "4":
					m.updatePhoneInfo();
					break;
				case "5":
					m.deletePhoneInfo();
					break;
				case "6":
					m.sortPhoneInfo();
					break;
				case "7":
					m.savePhoneInfo();
					break;
				case "8":
					m.openPhoneInfo();
					break;

				case "9":
					System.out.println("프로그램 종료");
					return;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

	private static void printMenu() {
		System.out.println("1.추가 2.전체출력 3.검색 4.수정 5.삭제 6.정렬 7.데이터 저장 8.데이터 불러오기 9.종료");
		System.out.print("메뉴입력: ");
	}

}
