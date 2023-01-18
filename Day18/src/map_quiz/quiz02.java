package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class quiz02 {

	public static void main(String[] args) {
//		Map 활용하기
//		Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화 하세요.
//
//		성씨가 '이'씨인 경우에는 값을 'O'로 바꾼다.
//		Iterator를 사용한다.
//		출력 예시
//
//		{이지은=O, 서장훈=X, 유재석=X, 이광수=O, 박나래=X}

		
		Map<String, Character> name = new HashMap<>();
		name.put("유재석", 'X'); // character -> ' ' 로 함.
		name.put("박나래", 'X');
		name.put("이지은", 'X');
		name.put("서장훈", 'X');
		name.put("이광수", 'X');
		System.out.println(name);
		
		
//		Set<String> keys = name.keySet();
//		Iterator<String> iter = keys.iterator();
		
		Iterator<String> iter = name.keySet().iterator();
		while (iter.hasNext()) {
			String yessName = iter.next();   // key  // 이름들이 하나씩 나옴.
			if (yessName.startsWith("이")){
				name.put(yessName, 'O');
			}
		}
		System.out.println(name);
		
		
		
	} // main
	

}
