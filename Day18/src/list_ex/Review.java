package list_ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Review {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(1);
		
		System.out.println(list);
	

		
		// list에 숫자 5가 들어있는가?
		boolean containValue = list.contains(5);
		System.out.println(containValue);
		
		// 오름차순 정렬하기
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
		// 내림차순 정렬하기
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		// 리스트가 비어있는지 확인
		System.out.println("리스트가 비어있는가? " + list.isEmpty());
		
		list.clear();
		System.out.println("리스트가 비어있는가? " + list.isEmpty());
		System.out.println(list);
	}

}
