package kosa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelStreamExam02 {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		List<Integer> scores = new ArrayList<Integer>();
		for(int i=0; i<100000; i++) {
			scores.add(r.nextInt(101));
		}
		
		double avg = 0.0;
		long startTime = 0;
		long endTime = 0;
		long time = 0;
		
		Stream<Integer> stream = scores.stream();
		startTime = System.nanoTime();
		
		avg = stream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg :" +avg+", 일반 스트림 처리 시간: "+time+" ns");
		
		Stream<Integer> parallelStream = scores.parallelStream();
		startTime = System.nanoTime();
		
		avg = parallelStream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg :" +avg+", 일반 스트림 처리 시간: "+time+" ns");
		

	}

}
