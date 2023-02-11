package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz03_2 {

	public static void main(String[] args) {
		// 회원 추가하기
		
//		1. 풀이
		List<String> list = new ArrayList<>();
		
		list.add("우솝");
		list.add("루피");
		list.add("상디");
		list.add("나미");
		list.add("로빈");
		System.out.println(list);
		
		List<String> newList = new ArrayList<>();
		
		newList.add("보람");
		newList.add("루피");
		newList.add("쵸파");
		newList.add("로빈");
		newList.add("루피");
		System.out.println(newList);


		for(int i = 0; i < newList.size(); i++) { // size()
			String resultList = newList.get(i);
			Integer count = 1;
			while(list.contains(resultList)) {  // contains(값)만 들어갈 수 있고, List<String> 못 들어감.
				resultList = newList.get(i) + count;
				count++;
			}
			list.add(resultList);
		}
		System.out.println(list);
		
		
		
		
		
		
		
		
//		2.풀이 ****
		// ****** Arrays.asList 메서드 이용. : 배열 생성없이 저장할 요소들마 나열 가능.
		List<String> names = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈")); // 기존 이름
		List<String> newNames= new ArrayList<>(Arrays.asList("보람", "루피", "쵸파", "로빈", "루피")); // 새로 입력할 이름.
	
		
		// newNames 리스트에 set 메소드로 숫자를 다 붙여놓은 후 addAll
		// 이중 for문 이용.
		for(int i = 0; i < names.size(); i++) { // size() - 리스트 크기.
			int count = 0;
			for(int j = 0; j < newNames.size(); j++) {  // size() - 리스트 크기.
				if(names.get(i).equals(newNames.get(j))) {
					count++;
					newNames.set(j, newNames.get(j) + count); // set(index, 값) 메소드.
				}
			}
		}
		
		names.addAll(newNames);  // addAll(값) 메소드.
		System.out.println(names);
		
		
	}

}
