package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {

	public static void main(String[] args) {
		// HashSet
		
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"}; // String1과 Integer 1은 다르다. 나머지 중복은 제거.
				Set set = new HashSet();
				
				for(int i = 0; i < objArr.length; i++) {
					set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
				}
				
				//HashSet에 저장된 요소들을 출력한다. (Iterator이용)
				Iterator it = set.iterator();
				
				while(it.hasNext()) {	// 읽어올 요소가 있는지 확인
					System.out.println(it.next()); // 요소 하나 꺼내오기
				}
				

		}

}
