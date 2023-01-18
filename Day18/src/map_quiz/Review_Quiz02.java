package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Review_Quiz02 {

	public static void main(String[] args) {
		Map<String, Character> names = new HashMap<>();
		names.put("이지은",'X');
		names.put("서장훈",'X');
		names.put("유재석",'X');
		names.put("이광수",'X');
		names.put("박나래",'X');
				
		
		// Iterator 반복문 사용.
		Iterator<String> iter = names.keySet().iterator(); 
		while (iter.hasNext()) {
			String yee = iter.next();  // key
			if (yee.startsWith("이")) { // key값으로 이씨로 시작하는지 검사
				names.put(yee, 'O'); // value에 'o'으로 바꾸기.
			}
		}
		System.out.println(names);
	}

}
