package kosa.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CopyExam {

	public static void main(String[] args) {
		// poem2.txt => 복사한 poem3.txt : 복사를 구현해 보자.
//		FileReader fileReader = null;
//		FileWriter fileWriter = null;
//		try {
//
//			fileReader = new FileReader("poem2.txt");
//			fileWriter = new FileWriter("poem3.txt");
//
//			while (true) {
//				int inputChar = fileReader.read();
//				if (inputChar == -1) {
//					break;
//				}
//				fileWriter.write((char)inputChar);
//			}
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//		try {
//			fileReader.close();
//			fileWriter.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

		// 교수님 코드 ----------------------------------
		FileReader reader = null;
		FileWriter writer = null;
		char[] arr = new char[100];
		try {
			reader = new FileReader("poem2.txt");
			writer = new FileWriter("poem4.txt");

			while (true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				if (data == -1) {
					break;
				}
				writer.write(arr);
			}
			System.out.println("복사완료");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
