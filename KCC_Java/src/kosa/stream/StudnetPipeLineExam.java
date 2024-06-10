package kosa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudnetPipeLineExam {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("가나다", 10), new Student("라마바", 20), new Student("사아자", 30));

		Stream<Student> studentStream = list.stream();
		// 메소드 참조형
		list.stream().map(Student::getName).forEach(name -> System.out.println(name));
		
		// filter "가" 로 시작하는 값들만 뽑기
		list.stream().filter(s -> s.getName().startsWith("가")).forEach(s -> System.out.println(s.getName()));
		
		// IntStream
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		// output
		double avg1 = scoreStream.average().getAsDouble();

		// 메소드 체이닝 패턴
		double avg2 = list.stream().mapToInt(student -> student.getScore()).average().getAsDouble();
		
		System.out.println("평균 점수: "+avg1);
		System.out.println("평균 점수: "+avg2);
	}

}
