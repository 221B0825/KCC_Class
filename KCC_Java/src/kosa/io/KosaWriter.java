package kosa.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KosaWriter {
	public static void main(String[] args) {
		// 키보드로부터 문자열을 입력 받아 파일에 쓰는 예제를 구현하자.
		// "q" 를 입력하기 전까지 문자여릉ㄹ 파일에 쓰도록 하자.
		// FileWriter : write(문자열)
		// 파일명 : poem2.txt : 미리 생성 X
		// 코드 실행 후 refresh => 파일 생성 확인

//		FileWriter fileWriter = null;
//		try {
//			fileWriter = new FileWriter("peom2.txt", true);
//			Scanner sc = new Scanner(System.in);
//			while (true) {
//				String input = sc.nextLine();
//				if (input.equals("q"))
//					break;
//				fileWriter.write(input+"\n");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				fileWriter.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		// --------교수님 코드
		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;

		String str = "";
		String poem = "";

		while (!(str = sc.nextLine()).equals("q")) {
			poem += str;
			poem += "\n";
		}

		try {
			writer = new FileWriter("poem2.txt", true);
			writer.write(poem);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
