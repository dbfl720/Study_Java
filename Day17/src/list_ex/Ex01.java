package list_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		// 배열(Array)
		// 1. 크기를 미리 알고 있어야 한다. 크기가 고정되어 있다.
		// 2. 중간에 있는 값을 빼내면, 비어있는 채로 유지된다.
		// 3. index 기반으로 접근 가능하다.
		// 4. 기본 자료형(Primitive type), 참조 자료형(Reference type)모두 저장 가능하다.
		
		
		// List   // 실무에서 list를 거의 씀, 즉 Arraylist 많이 씀.. 배열 잘 안씀.
		// 1. 크기가 고정되어 있지 않고 동적으로 할당된다.
		// 2. 중간에 있는 값을 빼내면 앞으로 당겨진다. (메모리 낭비가 없다)
		// 3. 여러 방법으로 데이터를 다룰 수 있다. (메소드가 많다)
		// 4. 클래스 자료형(참조 자료형) 타입만 담을 수 있다.(기본 자료형 저장 안됨)
		// 5. 타입 안정성을 보장하는 Generic 문법을 쓸 수 있다.  // 이 데이터에 한 가지 데이터만 쓸 거야.. 라는 뜻..? List<Integer> list1 = new ArrayList<>();
		
		// List Interface의 실제 구현체인 ArrayList 사용
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);  // heap 영역에 5가 쌓임
		list1.add(3);
		boolean inSuccess = list1.add(8);
		System.out.println(inSuccess);
		System.out.println("list1: " + list1); // toString()이 암묵적으로 활용되는 것임.
		System.out.println("list1 toString: " + list1.toString());
		
		
		
		// List Interface의 실제 구현체인 LinkedList 사용
		List<Integer> list2 = new LinkedList<>();  // 기차처럼 한칸 한칸 이어 붙여서 생김.
		list2.add(10);  // list는 무조건 순차적으로 들어감.
		list2.addAll(list1);
		System.out.println("list2: " + list2);

		
		// 요소 수정하기
		// 요소 첫번째 값을 수정 1- -> 100
		System.out.println(list2.set(0, 100)); // <왼쪽>변경할 위치(index), <오른쪽>변경할 값, 리턴된 값은 삭제된 값.
		System.out.println("list2: " + list2);
		
		// 요소 삭제하기
		Integer deleted = list2.remove(1); // index 1위치의 값을 제거
		Integer value = 100;
		list2.remove(value);  // object로 인식해서 제거 된 것임.
		System.out.println("deleted: " + deleted);
		System.out.println("list2 : " + list2);
		
		
		List<String> strList1 = new ArrayList<>();
		strList1.add("abc");
		strList1.add("qwer");
		System.out.println(strList1.remove("abc"));
		System.out.println(strList1);
		
		// 모든 요소 삭제하기
		list2.clear();
		System.out.println("list2: " + list2);
	}

}
