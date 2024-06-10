package kosa.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class KosaReader {

//	public static void main(String[] args) {
//		// 파일(poem.txt)에 있는 문자열 데이터를 읽어오기
//		FileReader reader = null;
//		try {
//			reader = new FileReader("poem.txt");
//			while (true) {
//				int data = reader.read();
//				if (data == -1)
//					break;
//				System.out.print((char) data);
//
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				reader.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}

	public static void main(String[] args) {
		// 파일(poem.txt)에 있는 문자열 데이터를 읽어오기
		FileReader reader = null;
		char arr[] = new char[100];

		try {
			reader = new FileReader("poem.txt");

			while (true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				if (data == -1)
					break;
				System.out.println(arr);
			}

//		         while (true) {
//		            int data = reader.read();
//		            if (data == -1)
//		               break;
//		            char ch = (char) data;
//		            System.out.print(ch);
//		         }

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e2) {
			}
		}

	}

}
