package map_ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Review_Ex01 {

	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);  // keys :a / value : 1
		map1.put("b", 1);
		map1.put("c", 2);
		map1.put("d", 3);
		System.out.println(map1);

		
		
		
		// key로 값 얻어오기
		System.out.println(map1.get("a"));
		System.out.println(map1.get("b"));
		System.out.println(map1.get("c"));
		System.out.println(map1.get("d"));
		
		// 수정 : 같은 키에 put
		map1.put("b", 20);
		System.out.println(map1);
		
		// "c"라는 키가 존재하는가?
		System.out.println(map1.containsKey("c"));
		System.out.println(map1.containsValue(5));
		
		// map의 크기
		System.out.println(map1.size());
		
		// *** key만 가져오기
		Set<String> variable = map1.keySet();  // 순서가 없는 set
		System.out.println(variable);
		
		
		// value만 가져오기
		Collection<Integer> values = map1.values();
		System.out.println(values);
		
		// key로 요소값 삭제
		Integer deletedValue = map1.remove("c");
		System.out.println("deletedValue: " + deletedValue);
		System.out.println(map1);
		
		// key, value로 요소값 삭제 - key와 value가 일치해야 삭제됨.
		System.out.println(map1.remove("d", 3));
		System.out.println(map1);
		
		// map에 map 전체 추가 하기
		Map<String, Integer> map2= new HashMap<>();
		map2.putAll(map1);
		System.out.println(map2);
	}

}
