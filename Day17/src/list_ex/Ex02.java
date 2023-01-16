package list_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grape");

//		// 1. 일반 for문 (index 기반)
//		for (int i = 0; i < fruits.size(); i++) {	 // 0 1 2
//			System.out.println(fruits.get(i));  // 무조건 get 써야함.
//			
//			// 만약에 b로 시작하면 제거
//			if (fruits.get(i).startsWith("b")) {
//				fruits.remove(i);
//				i--;  // i를 머무르게 한다. // 삭제가 될 때 한 번 더 돌리기 위해. // 사이즈가 변경 되기 때문에...// 중간에 삭제할 때는 조심해야 함.
//				
//			}
//			
//		}
//		System.out.println(fruits);
		
		
		
		
//		// 2.  Iterator 사용하기  - 순회해달라고 하기 위해..
		Iterator<String> iter = fruits.iterator();
		while (iter.hasNext()) {
			String fruit = iter.next();  // next()를 호출할 때마다 다음칸을 계속 가리키기 때문에 반복문에서 반드시 한개만 수행해 함!!!!!!!! // 항상 변수에 담아랏. 
			System.out.println(fruit);
			
			
			// b로 시작하는 과일 제거
			if (fruit.startsWith("b")) {
				iter.remove();  // 리스트에서 직접 삭제가 아니고, 반드시 liter의 remove로 삭제해야 한다.!!!! 왜냐하면 liter가 순회 관리를 하고 있기 때문. // 안전하게 삭제 방법.
			}
		}
		System.out.println(fruits);
		
		
		
		
		
		// 3.  향상된 for문 (가장 쉬운 문법)
		// money in pocket 
		// 중간에 삭제할 때는 쓰지 않는다. 자바 버전마다 수행 방식이 다르다.
		for (String fruit : fruits) {   //오른쪽 과일들이 왼쪾 과일 하나씩 나온다.
			System.out.println(fruit);
			
			if(fruit.startsWith("b")) {  
				fruits.remove(fruit);
			}
		}
		
		
	} // main
	

}
