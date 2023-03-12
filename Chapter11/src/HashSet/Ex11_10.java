package HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

	public static void main(String[] args) {
		// HashSet
		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);  // LinkedList(Collection c) // set 모든 요소들을 list에 저장.
		Collections.sort(list); // list를 정렬.
		System.out.println(list);
		
	}

}
