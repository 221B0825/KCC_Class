package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam02 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();

		list.add(new Person("홍길동", 80));
		list.add(new Person("박길동", 20));
		list.add(new Person("김길동", 50));
		list.add(new Person("서길동", 30));
		list.add(new Person("성길동", 60));

//		Collections.sort(list);

		System.out.println(list);

		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// 이름을 기준으로 오름차순
				// 0 => 앞쪽(AAA) == 뒷쪽(AAA)
				// -1 => 앞쪽(AAA) < 뒤쪽(ABB)
				// 1 => 앞쪽(ABB) > 뒤쪽 (AAA)
				// 사전적으로 ABB가 더 큼

				// o1- o2 > 0 => o2 , o1 (자리 바꿈)
				if (o1.getName().compareTo(o2.getName()) > 0) {
					return 1;

				} // o1-o2 < 0 => o1, o2 (자리 그대로)
				else if (o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}
				return 0;
			}
		}); // 기본 정렬

		System.out.println(list);
	}

}
