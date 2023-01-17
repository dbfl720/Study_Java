package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
//		1. List 만들기
//		리스트에 주어진 값들을 넣고 출력하세요.
//		3, 8, 9, 4, 2, 1, 7, 5
//		출력 예시
//
//		[3, 8, 9, 4, 2, 1, 7, 5]

		
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(8);
		list1.add(9);
		list1.add(4);
		list1.add(2);
		list1.add(1);
		list1.add(7);
		list1.add(5);
		
		System.out.println(list1);
		
		
		//Arrays.asList로 만들면 값을 수정/추가/삭제 불가 (고정 리스트)
		List<Integer> list2 = Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5); 
		System.out.println(list2);
//		list2.add(100);
//		System.out.println(list2);
		
		
		
		
		
		
		// 수정 가능한 리스트로 변경!!!!!!!
		List<Integer> list3 = new ArrayList<>(Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5));
		System.out.println(list3);
//		list3.add(100);
//		System.out.println(list3);
		
		
		
		
		
//		2. 값 수정하기
//		List의 네번째 값을 6으로 바꾸고 전체를 출력하세요.
//		출력 예시
//
//		[3, 8, 9, 6, 2, 1, 7, 5]
		
		list1.set(3, 6);
		System.out.println(list1);
		
		
//		3. index 값 삭제하기
//		List에서 8과 7을 삭제하고 전체를 출력하세요.
//		출력 예시
//
//		[3, 9, 6, 2, 1, 5]
		
		// index로 삭제
		list1.remove(1);
		list1.remove(5);
		System.out.println(list1);
		
		
		
		// 값으로 삭제
		Integer delValue = 8;
		list2.remove(delValue);  // boolean으로 리턴이면.object.. 
		delValue = 7;
		list2.remove(delValue);
		System.out.println(list2);
	}

}
