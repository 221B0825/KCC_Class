package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CopyUtil {

	// 디렉토리 복사(해당 폴더를 복사해서 새로운 디렉토리를 생성 후 모든 파일을 복사)
	public static void copyDirectory(File source, File dest) {

		if (source.isDirectory()) {
			// 폴더 생성
			dest.mkdirs();
			
			File[] fileList = source.listFiles();
			for (int i = 0; i < fileList.length; i++) {
				File sourceFile = fileList[i];
				if (sourceFile.isDirectory()) {
					// new File(디렉토리 경로, 파일 이름);
					copyDirectory(sourceFile, new File(dest, sourceFile.getName()));
				} else {
					File file = new File(dest, sourceFile.getName());
					copyFile(sourceFile, file);
				}
			}
		}

	}

	// 바이트 값을 가진 파일 1개를 복사하는 메소드 (dest : 생성될 새로운 파일)
	public static void copyFile(File source, File dest) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte[] buf = new byte[1024];

		try {

			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);

			int readData;
			while ((readData = fis.read(buf)) != -1) {
				fos.write(buf, 0, readData);
			}

			System.out.println("복사 완료");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
