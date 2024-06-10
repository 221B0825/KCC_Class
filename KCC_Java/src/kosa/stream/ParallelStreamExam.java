package kosa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExam {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("바나나");
		list.add("포도");
		list.add("딸기");
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name -> {
			System.out.println(name + " : "+ Thread.currentThread().getName());
		});
	}

}
