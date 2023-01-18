package map_quiz;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Review_Quiz01 {

	public static void main(String[] args) {
		// 1.
		
		Map<String, Integer> subject = new HashMap<>();
		subject.put("국어", 90);
		subject.put("수학", 85);
		subject.put("영어", 90);
		subject.put("사회", 100);
		subject.put("과학", 100);
//		System.out.println(subject);

		
		//2.
		subject.put("사회", 85);
//		System.out.println(subject);
		
		
		// 3.
//		Scanner scan = new Scanner(System.in);
//		System.out.print("조회할 과목명을 입력하세요 : ");
//		String findSub = scan.next();
//		
//		if (subject.containsKey(findSub)) {  //  key : findSub
//			System.out.print(findSub + " : " + subject.get(findSub));
//		} else {
//			System.out.println("자료 없음");
//	
//		}
		
		
		// 4. 
//		Set<String> keys = subject.keySet();
//		System.out.println(keys);
//		Iterator<String> iter = subject.keySet().iterator();
//		while (iter.hasNext()) {
//			String findSub = iter.next();  // key
//			if (subject.get(findSub) >= 90) {
//				System.out.print(findSub + " ");
//			}
//		}
		
		
//			//******key만 가져오기 **** 중요 *****
//			Set<String> keys = map1.keySet(); // 순서가 없는 set
//			System.out.println(keys);
		
		
		
		
		
		// 5.
		Collection<Integer> values = subject.values();
		System.out.println(values);
		
		if (subject.containsValue(100))	{
			System.out.println("수상 가능");
		} else {
			System.out.println("해당 없음");
		}
		
		
	} // main

}
