package kosa.basic;

public class CallByExam {
	
	public static void main(String[] args) {
//		int num = 10;
//		num = change(num);
//		System.out.println(num);
	
		int arr[] = {100};
		change2(arr);
		System.out.println(arr[0]);
		
		int arr3[] = {1,2,3};
		int brr[] = arr3;
		brr[0] = 100;
		System.out.println(arr3[0]);
		
		String str1 = "aa";
		String str2 = str1;
		
		// new!
		str2 = "a";
		String a = new String("a");
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public static int change(int num) {
		return num += 10;
	}
	
	public static void change2(int brr[]) {
		brr[0] = 200;
	}

}
