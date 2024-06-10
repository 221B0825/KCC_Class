package kosa.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam01 {

	public static void main(String[] args) {
		//  set 의 stream 활용
		Set<String> set = new HashSet<String>();
		set.add("사과");
		set.add("바나나");
		set.add("포도");
		
		Stream<String> stream = set.stream();
		stream.forEach(name -> System.out.println(name));
		
		// 배열의 Arrays.stream 활용
		String[] arr1 = {"사과", "바나나", "포도"};
		Stream<String> stream1 = Arrays.stream(arr1);
		stream1.forEach(item -> System.out.print(item+ ", "));
		
		// IntStream을 사용하여 숫자 List 생성 & 출력
		List<Integer> list3 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		list3.stream().forEach(System.out::println);
		// IntStream of 메소드 사용
		List<Integer> list4 = IntStream.of(2, 4, 5, 6, 8, 10).boxed().collect(Collectors.toList());
		list4.stream().forEach(System.out::println);
		
		// 문자열 배열 => List, Stream 변환
		String[] arr2 = {"BB", "CC","AA"};
		// List 변환
		List<String> list2 = Arrays.asList(arr2);
		Stream<String> stream2 = list2.stream();
		stream2.sorted().forEach(System.out::println);
	}
}
