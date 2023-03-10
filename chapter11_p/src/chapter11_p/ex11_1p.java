package chapter11_p;

import java.util.ArrayList;
import java.util.Collections;

public class ex11_1p {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		print(list1, list2);
		
		Collections.sort(list1);  // list1과 list2를 정렬한다.
		Collections.sort(list2);  
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2)); // list1이 list2의 모든 요소를 포함하고 있을 때만 ture.
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");  // 인덱스가 3인 곳에 "A"를 추가 // B, C가 밀려나면서 인덱스3인 곳에 A가 생김.
		print(list1, list2);
		
		
		list2.set(3, "AA"); // 인덱스가 3인 곳을 "AA"로 변경
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2)); // ArrayList에 저장된 객체 중에서 주어진 컬렉션과 공통된 것만 남기고 나머지 삭제.
		//list1에서  list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		print(list1,list2);
		
		
		// list2에서 list1에 포함된 객체 삭제.
		for(int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))  // contains : 객체가 포함되어 있는지 확인.
				list2.remove(i);   // 인덱스가 i인 곳에 저장된 요소를 삭제.
		}
		print(list1, list2);
		
		
	} // main
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();  // ?? 

	}

}
