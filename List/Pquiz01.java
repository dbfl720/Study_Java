package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pquiz01 {

	public static void main(String[] args) {
		// 리스트 초기화, 추가/수정/삭제
		
		// 1. List 만들기
//		리스트에 주어진 값들을 넣고 출력하세요.
//		3, 8, 9, 4, 2, 1, 7, 5
		
//		List<Integer> list1 = new ArrayList<Integer>();
//		list1.add(3);
//		list1.add(8);
//		list1.add(9);
//		list1.add(4);
//		list1.add(2);
//		list1.add(1);
//		list1.add(7);
//		list1.add(5);
//		
//		System.out.println(list1);
//		
		List<Integer> list1 = new ArrayList<> (Arrays.asList(3,8,9,4,2,1,7,5));
		System.out.println(list1);
		
		// 값 수정하기
		// List의 네번째 값을 6으로 바꾸고 전체를 출력하세요.
		System.out.println(list1.set(3, 6));
		System.out.println(list1);
		
		
		
		
//		3. 값 삭제하기
//		List에서 8과 7을 삭제하고 전체를 출력하세요.
		System.out.println(list1.remove(1));
		System.out.println(list1.remove(5));
		System.out.println(list1);
	}

}
