package set_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {
		// Set
		// 1. 중복되지 않는다.
		// 2. 순서가 없다. 인덱스가 없다.
		// [ 3 ,3 ,3 , 5, 5, 5, 1 ,1 ] => Set 중복제거
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(3);
		set1.add(2);
		set1.add(1);
		System.out.println(set1.add(1)); // 중복된 값은 넣어지지 않는다.
		System.out.println("set1: " + set1); // 순서가 없다.
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(11);
		set2.addAll(set1);
		System.out.println("set2: "+ set2); // 오름차순처럼 보이지만 순서가 없이 뒤죽박죽 나온다.
		
		//set2에 10 있는가?
		System.out.println(set2.contains(10));
		
		
		// set2에서 set1을 차집합   set2 - set1
		set2.removeAll(set1);  // set1에 겹치는게 있으면 다 지워버린다. // list에도 있다.
		System.out.println("set - set1 : "+ set2);
		
		
		// Tree set
		Set<String> set3 = new TreeSet<>();
		set3.add("c");
		set3.add("b");
		set3.add("a");
		System.out.println("set3 : " + set3);  // 알아서 정렬해줌.
		
		
		
		// 반복문: 순서가 없기 때문에 일반 for문 순회는 못함
		
		// 1. Iterator    
		Iterator<String> iter = set3.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		
		// 2. 향상된 for문
		for (Integer element : set1) {
			System.out.println(element);  // 넣은 순서가 아니고, 자기 멋대로 순서 나옴.
		}
	}

}
