package kosa.io;

import java.io.File;

public class FileExam {

	public static void main(String[] args) {
		String path = "src/kosa";

		File f = new File(path);
		show(f);
//		printFiles(f.listFiles());
//		
	}
	
	public static void show(File file) {
		File list[] = file.listFiles();
		
		for(int i=0; i<list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.println();
				System.out.println("**"+list[i].getName()+"**");
				show(list[i]);
			}else {
				System.out.println("- "+list[i].getName());
			}
		}
	}

	public static void printFiles(File[] files) {
	      for (File file : files) {
	         if (file.isDirectory()) {
	            System.out.println("**" + file.getName());
	            printFiles(file.listFiles());
	         } else {
	            System.out.println("-" + file.getName());
	         }
	      }
	   }
}
