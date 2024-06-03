package kosa.oop2;

public class Main {

	public static void main(String[] args) {
		MySQLDao dao = new MySQLDao();
		MyService myService = new MyService(dao);
		
		MyService ms = new MyService(new Dao() {
			
			@Override
			public void insert() {
				System.out.println("이너 클래스로 호출");
			}
		});

		myService.insertService();
		ms.insertService();
	}

}
