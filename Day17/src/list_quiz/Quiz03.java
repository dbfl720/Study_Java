package list_quiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
		// 리스트가 제공하는 함수 사용하기

//		1. 체조 경기 평균 점수
//		체조 경기에서 아래와 같은 심사위원 점수가 집계 되었습니다.
//		최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
//		for문으로 구현할 것
//
//		[8, 7, 6, 10, 9, 4]
//		출력 예시
//
//		최고점과 최저점을 제외한 평균 점수는 7.5
		
		
		
		List<Integer> average = new ArrayList<>();
		average.add(8);
		average.add(7);
		average.add(6);
		average.add(10);
		average.add(9);
		average.add(4);
		
//		System.out.println(average);
		
//		average.remove(3);
//		average.remove(4);
//		System.out.println(average);
//		

		
//		Integer min = average.get(0);  // int는 index칸 번호로 생각함.!!!!
//		Integer max = average.get(0);  // Integer로 해야지 값으로 여겨서 삭제 됨.
//		for (int i = 1; i < average.size(); i++) {
//			if(max < average.get(i)){
//				max = average.get(i);
//			}
//			if(min > average.get(i)) {
//				min = average.get(i);			
//			}
//		} 
//		
//		average.remove(max);
//		average.remove(min);
//		System.out.println(average);
		
		
		
		// 최고점, 최저점 제거 후 평균
		average.sort(Comparator.naturalOrder());
		System.out.println(average);
		average.remove(0);  // 최저점
		average.remove(average.size() - 1); // 맨 마지막 index 최고점
		System.out.println(average);
		
		// 최고점,최저점 제외한 평균
		
		int sum = 0;
		for (int i = 0; i < average.size(); i++) {
			sum += average.get(i);
			
		}
		double calculate = (double)sum / average.size();
		
		System.out.println("최고점, 최저점 제거한 평균 점수 : " + calculate );
		
		
		
		
		
		
		
		
		
//		2. 회원 추가하기  // 이중루프 돌면서 해야함!!
//		회원관리 리스트를 만든다.
//
//		[우솝, 루피, 상디, 나미, 로빈]
//		새로 입력할 이름을 기존 리스트에 추가한다.
//		만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
//		(새로 입력할 이름들을 다른 리스트에 넣어두고 시작하기)
//
//		보람
//		루피
//		쵸파
//		로빈
//		루피
//		
		
//		List <String> list = new ArrayList<>();
//		list.add("보람");
//		list.add("루피");
//		list.add("상디");
//		list.add("나미");
//		list.add("로빈");
//		
//		System.out.println(list);
//		
//		
//		List <String> newName = new ArrayList<>();
//		newName.add("보람");
//		newName.add("루피");
//		newName.add("쵸파");
//		newName.add("로빈");
//		newName.add("루피");
//		
//		System.out.println(newName);
//		
//		
//		
//		
//		for (int i = 0; i < list.size(); i++ ) {
//			list.add(newName.get(i));
//			for (int j = i + 1; j < list.size(); j++) {
//				if (list.get(i).equals(newName.get(i))) {
//					newName
//				}
//			}
//	
//	
//		}
//		System.out.println(list);
		
		
		
		
	}// main

}
