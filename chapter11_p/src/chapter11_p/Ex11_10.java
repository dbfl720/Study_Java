package chapter11_p;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

	public static void main(String[] args) {
		// HashSet 예제2
		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		
		
		// set은 정렬이 불가하기 때문에, 정렬하기 위해서는, Collections클래스의 sort(List list)를 사용.
		// 이 메서드는 List 인터페이스 타입을 필요로 하기 때문에, LinkedList(Collection c) 클래스의 생성자 이용.
		List list = new LinkedList(set);  // LinkedList(Collection c) set에 모든 요소를 list에 저장.
		Collections.sort(list);  // Collections.sort(List list)
		
		System.out.println(list);

	}

}



//---------
//[2, 21, 30, 36, 37, 45]