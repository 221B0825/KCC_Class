package kosa.oop3;

public class Main {
	
	public static void main(String[] args) {
		Student st = new Student();
		Work wk = new Work();
		
		Person p1 = new Person("가나다", st);
		Person p2 = new Person("가나다", new Role() {
			
			@Override
			public void doing() {
				System.out.println("드라이빙 역할");
			
			}
		});
		
		p1.doit();
		p2.doit();
	}

}
