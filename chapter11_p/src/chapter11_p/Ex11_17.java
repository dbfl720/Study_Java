package chapter11_p;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_17 {

	public static void main(String[] args) {
		// HashMap 예제2
		
		HashMap map = new HashMap();
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		Set set = map.entrySet();  // entrySet() : 키와 값을 반환
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); // Map.Entry : Map인터페이스 안에 있는 Entry인터페이스.
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue()); // getKey() : key 가져오기, getValue: value 가져오기.
		}
		
		set = map.keySet(); // .keySet() : 저장된 모든 키를 반환
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();  // .values(): 값들만 가져오기
		it = values.iterator();
		
		int total = 0;
		while (it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : "+ Collections.max(values)); // Collections : Collections 클래스 
		System.out.println("최저점수 : " + Collections.min(values));
		

	}

}


//------
//이름 : 안자바, 점수 : 90
//이름 : 김자바, 점수 : 100
//이름 : 강자바, 점수 : 80
//이름 : 이자바, 점수 : 100
//참가자 명단 : [안자바, 김자바, 강자바, 이자바]
//총점 : 370
//평균 : 92.5
//최고점수 : 100
//최저점수 : 80
