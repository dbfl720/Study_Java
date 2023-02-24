package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Pquiz02 {

	public static void main(String[] args) {
		// 반복문으로 리스트 접근하기
		
//	1. List 만들기
//		리스트에 주어진 값들을 넣으세요.
//		20 3 5 84 17
		List<Integer> list1 = new ArrayList<> (Arrays.asList(20,3,5,84,17));
		
		System.out.println(list1);
		
		
//		2. 최소값 구하기
//		List에서 가장 작은 값을 출력하세요.
//		for문을 사용하세요.(향상된 for문 X)
		
		int min = list1.get(0);
		for ( int i = 0; i < list1.size(); i++) {
			if(min > list1.get(i)) {
				min = list1.get(i);
			}
			
		}
		System.out.println(min);
		
		
		
//		3. 합계 구하기
//		List 요소들의 총 합계를 구하세요.
//		Iterator를 사용하세요.
		int sum = 0;
		Iterator<Integer> iter = list1.iterator();
		while (iter.hasNext()) {
		
			
			sum += iter.next();
			
		}
		System.out.println(sum);
		
	}

}
