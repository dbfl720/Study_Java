package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		// List Integerface의 실제 구현체인 ArrayList 사용
		List<Integer> list1 = new ArrayList<Integer>();  // 지네릭 타입은 일치하나, 클래스 타입 간에 다형성 적용.
		list1.add(5);
		list1.add(3);
		boolean isSuccess = list1.add(8);
		System.out.println(isSuccess);
		System.out.println("list1: " + list1);
		System.out.println("list1 toString();" + list1.toString());
		
		// List Interface의 실제 구현체인 LinkedList 사용
		List<Integer> list2 = new LinkedList<>(); //지네릭 타입은 일치하나, 클래스 타입 간에 다형성 적용.
		list2.addAll(list1);
		
		// 요소 수정하기
		// 요소의 첫번째 값을 수정 5->10으로 변경
		System.out.println(list2.set(0, 10));  // 변경할 위치(index), 변경할 값, 리턴된 값은 삭제된 값
		System.out.println("list2: " + list2);
		
		
		// 요소 삭제하기
		Integer deleted = list2.remove(1);  // index1 위치의 요소를 제거
		System.out.println("deleted: " + deleted);
		System.out.println("list2: "+ list2);
		
		
		List<String> strList1 = new ArrayList<>();
		strList1.add("abc");
		strList1.add("qwer");
		System.out.println(strList1.remove("abc")); // remove(값) - boolean 반환값 // remove(index) - 삭제된 값 반환.
		System.out.println(strList1);

		
		// 모든 요소 삭제하기
		list2.clear();
		System.out.println("list2:" + list2);
	}

}
