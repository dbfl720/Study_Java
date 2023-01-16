package list_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {
//		1. List 만들기
//		리스트에 주어진 값들을 넣으세요.
//		20 3 5 84 17

//		List<Integer> list = Arrays.asList(20, 3, 5, 84, 17);
//		System.out.println(list);
		
		
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(3);
		list.add(5);
		list.add(84);
		list.add(17);
		
		System.out.println(list);
		
		
//		2. 최소값 구하기
//		List에서 가장 작은 값을 출력하세요.
//		for문을 사용하세요.(향상된 for문 X)
//		출력 예시
//
//		3
//		int min = list.get(0);
//		for (int i = 1; i < list.size(); i++) {  // 1 ~ 4
//			if(min > list.get(i)) {
//			   min = list.get(i);
//			}
//			
//			
//		} 
//		System.out.println(min);
		
		
		
	//	3. 합계 구하기
//		List 요소들의 총 합계를 구하세요.
//		Iterator를 사용하세요.
//		출력 예시
//
//		129
		
		Iterator<Integer> iter = list.iterator();
		int sum = 0;
		while (iter.hasNext()) { // 가리키는게 있는 동안.. 없을 때 끝남.
			Integer value = iter.next();
			sum += value;
			// sum += iter.next();
		}
		System.out.println(sum);
	}

}
