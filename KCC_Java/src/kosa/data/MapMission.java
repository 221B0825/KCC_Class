package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수를 한 쌍으로 Map 자료구조로 구현하시오. ex) 김자바: 90, 박자바: 60
		// 1. 시험 응시자만 출력
		// 2. 총점, 평균, 최고점수, 최저점수 출력 최고점수와 최저점수는 Collections => max(), min()을 참고

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김자바", 90);
		map.put("박자바", 60);
		map.put("이자바", 70);
		map.put("유자바", 80);

		// map => key 추출
		Set<String> set = map.keySet();
		System.out.println("응시자 명단: " + set);

		// map => value 추출
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		
		int total = 0;
		while (iter.hasNext()) {
			total += iter.next();
		}
		System.out.println("총점: "+total);
		System.out.println("평균: "+(total/map.size()));
		System.out.println("최고점수: "+Collections.max(values));
		System.out.println("최저점수: "+Collections.min(values));
	}

}
