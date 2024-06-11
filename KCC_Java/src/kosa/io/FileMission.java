package kosa.io;

import java.io.File;

public class FileMission {

	// use CopyUtil
	public static void main(String[] args) {
		// 1. 바이트스트림을 이용하여 이미지 파일을 복사해 보자.
//		 String source = "image/origin/jellyfish.jpg";
//		 String dest = "image/copy/copy.jpg";

//		CopyUtil.copyFile(new File(source), new File(dest));

		String source = "image/origin";
		String dest = "image/copy";
		CopyUtil.copyDirectory(new File(source), new File(dest));
	}

}
