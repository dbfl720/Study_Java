package List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		// 리스트가 제공하는 함수 사용하기
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(1);
		
		// list에 숫자 5가 들어있는가?
		boolean containValue = list.contains(5);  // true
		System.out.println(containValue);
		
		// list에 숫자 7이 들어있는가?
		System.out.println(list.contains(7)); // false
		
		// 오름차순 정렬하기
		list.sort(Comparator.naturalOrder()); // 1,3,5,9
		System.out.println(list);
		
		// 내림차순 정렬하기
		list.sort(Comparator.reverseOrder()); // 9,5,3,1
		System.out.println(list);

		
		//리스트가 비어있는지 확인하기
		System.out.println("리스트가 비어있는가? " + list.isEmpty()); // false
		
		list.clear();
		System.out.println("리스트가 비어있는가?" + list.isEmpty());
	}

}
