package kosa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExam02 {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("가나다", 92), new Student("라마바", 95),
				new Student("아자차", 88), new Student("가카타", 78));

		// 방법 1 // IntStream으로 변환 후 sum 내장함수 활용
		int sum1 = studentList.stream().mapToInt(Student::getScore).sum();

		// 방법 2 // map 함수로 Stream 변환을 score들을 갖고 있는 스트림으로 변환(Stream<Integer> 형태) 후
		// reduce 함수로 합 계산
		int sum2 = studentList.stream().map(Student::getScore).reduce(0, (a, b) -> a + b);

		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);

		// 리턴값인 Collector 구현 객체를 Collectors 클래스의 정적 메소드(toList)로 얻을 수 있다.
		List<Student> filterList = studentList.stream().filter(s -> s.getName().startsWith("가"))
				.collect(Collectors.toList());
		// forEach로 출력
		filterList.stream().forEach( s-> System.out.println(s.toString()));
	
		
	}

}
