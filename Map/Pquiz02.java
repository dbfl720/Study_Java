package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Pquiz02 {

	public static void main(String[] args) {
		// Map 활용하기(1) - '이'씨 찾기
//		Map 활용하기
//		Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화 하세요.
//
//		성씨가 '이'씨인 경우에는 값을 'O'로 바꾼다.
//		Iterator를 사용한다.
//		출력 예시
//
//		{이지은=O, 서장훈=X, 유재석=X, 이광수=O, 박나래=X}

		
		Map<String, String> map = new HashMap<>();
		map.put("이지은", "X");
		map.put("서장훈", "X");
		map.put("유재석", "X");
		map.put("이광수", "X");
		map.put("박나래", "X");
		// System.out.println(map);
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext() ) {
			String values = iter.next();
			
			if (values.contains("이")) {
				map.put(values, "O");
			}
		}
		System.out.println(map);
		
		
//		Iterator<String> iter = map.keySet().iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			if(key.startsWith("이")) {
//				map.put(key,"o");
//			}
//		}
//		System.out.println(map);
		
		
		
		
		
	} // main

}
