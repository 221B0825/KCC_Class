package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {

		Account arr[] = { new Account("111-111", "홍길동", 10000), new CheckingAccount("111-111", "홍길동", 20000, "222-222"),
				new MinusAccount("111-111", "홍길동", 30000, 20000) };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof CheckingAccount) {
				try {
					((CheckingAccount) arr[i]).pay("222-222", 5000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
		System.out.println(arr[1].getBalance());

		// Account ca = new CheckingAccount( "222-222");

//		CheckingAccount ca = new CheckingAccount("111-111", "홍길동", 10000, "222-222");
//		MinusAccount ma = new MinusAccount("111-111", "홍길동", 10000, 10000);

		try {
			// 자식으로 강제 형변환
			// CheckingAccount ca2 = (CheckingAccount) ca;

//			if (ca instanceof CheckingAccount) {
//				// 부모로 형변환 후 자신만이 가지고 있는 메소드는 접근되지 않기 때문에, 다운캐스팅 함
//				((CheckingAccount) ca).pay("222-222", 3000);
//			} else {
//				System.out.println("형변환 불가");
//			}

//			((CheckingAccount) (ca)).pay("222-222", 3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		System.out.println(ca.getBalance());
//
//		try {
//			ma.withdraw(15000);
//			System.out.println(ma.getBalance());
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

	}

}
