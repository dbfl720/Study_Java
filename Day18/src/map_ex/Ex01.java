package map_ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// Map
		// 1. key-value 쌍으로 이루어져 있다.
		// 2. key는 중복되지 않는다. value는 중복 가능하다. (ex: 주민번호 - 이름)
		// 3. key를 통해서 아주 빠르게 value를 찾을 수 있다.
		// 4. value로는 key를 찾을 수 없다.
		
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);  // key : a  / value : 1
		map1.put("b", 1);
		map1.put("c", 2);
		map1.put("d", 3);
		System.out.println(map1);
		// {a=1, b=1, c=2, d=3}  자바에서는 = 으로 표기함!

		
		// !!!!!!!****중요!!!!**** key로 값 얻어오기
		System.out.println(map1.get("a")); // key에 해당하는 값이 나옴.
		System.out.println(map1.get("b"));
		System.out.println(map1.get("c"));
		System.out.println(map1.get("d"));
		
		
		// 수정 : 같은 키에 put
		map1.put("b", 20);
		System.out.println(map1);
		
		// "c"라는 키가 존재하는가?
		System.out.println(map1.containsKey("c"));
		// value에 5가 있는가?
		System.out.println(map1.containsValue(5));
		
		// map의 크기(요소의 개수)
		System.out.println(map1.size());
		
		//******key만 가져오기 **** 중요 *****
		Set<String> keys = map1.keySet(); // 순서가 없는 set
		System.out.println(keys);
		
		// value만 가져오기
		Collection<Integer> values = map1.values();
		System.out.println(values);
		
		
		// key로 요소값 삭제
		Integer deletedValue = map1.remove("c");
		System.out.println("deletedValue: "+ deletedValue);
		System.out.println(map1);
		
		
		// key, value로 요소값 삭제   - key와 value가 일치해야 삭제됨.
		System.out.println(map1.remove("d", 3));
		System.out.println(map1);
		
		// map에 map 전체 추가 하기
		Map<String, Integer> map2 = new HashMap<>();
		map2.putAll(map1);
		System.out.println(map2);
	}

}
