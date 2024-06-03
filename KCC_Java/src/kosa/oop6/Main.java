package kosa.oop6;

public class Main {

	public static void main(String[] args) {
		// MyType = > 익명 내부 클래스로 선언
		MyType my1 = new MyType() {

			@Override
			public void hello() {
				System.out.println("익명 클래스 형식입니다.");
			}
		};

		my1.hello();

		// 람다식으로 구현 => 추상 메소드가 한 개일 때 가능
		MyType my2 = () -> {
			System.out.println("람다식 형식입니다.");
		};

		my2.hello();

		MyType my3 = () -> System.out.println("람다식 형식2 입니다.");
		
		my3.hello();
		
		// 람다식 선언 1
		YourType yt1 = (String message) -> {
			System.out.println("메시지: "+message);
		};
		
		yt1.talk("안녕");
		
		// 람다식 선언 2
		YourType yt2 = message -> System.out.println("메시지: "+message);
		
		yt2.talk("반가워");
		
		MyNumber mn1 = new MyNumber() {
			
			@Override
			public int getMax(int num1, int num2) {
				if(num1 > num2) {
					return num1;
				}else {
					return num2;
				}
			}
		};
		
		MyNumber mn2 = (x, y) -> (x > y) ? x:y;
		
		
		System.out.println(mn1.getMax(10, 5));
		System.out.println(mn2.getMax(10, 5));
		
		// Runnable => 람다식 구현
		Runnable myThread = () -> {
			// 멀티스레드 작업 내용
			for(int i=1;i<11;i++) {
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println(i);
			}
		};
		
		Thread th = new Thread(myThread);
		th.start();
	}

}
