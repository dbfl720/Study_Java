package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Pquiz03 {

	public static void main(String[] args) {
		// 리스트가 제공하는 함수 사용하기
//		1. 체조 경기 평균 점수
//		체조 경기에서 아래와 같은 심사위원 점수가 집계 되었습니다.
//		최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
//		for문으로 구현할 것
		
//		List<Integer> list = new ArrayList<> (Arrays.asList(8,7,6,10,9,4));
//		//System.out.println(list);
//		
//		list.sort(Comparator.naturalOrder());
//		//System.out.println(list);
//		list.remove(0);
//		//System.out.println(list);
//		list.remove(4);
//		System.out.println(list);
//		
//		
//		int sum = 0;
//		double result = 0;
//		for(int i = 0; i < list.size(); i++) {
//			sum += list.get(i);
//			result = sum / (double)list.size();
//		}
//		System.out.println(result);
		
		
		
		
		
//		2. 회원 추가하기
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
//		출력 예시
//
//		[우솝, 루피, 상디, 나미, 로빈, 보람, 루피1, 쵸파, 로빈1, 루피2]
		
		
		List<String> list = new ArrayList<> (Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));
		//System.out.println(list);
		
		List<String> list2 = new ArrayList<> (Arrays.asList("보람", "루피", "쵸파", "로빈", "루피"));
		//System.out.println(list2);
	
		
		
		for (int i = 0; i < list2.size(); i++) {
			String result = list2.get(i);  // list2 객체들을 String에 저장.값을 얻어 while문에서 사용하기 위해!
			Integer count = 1;  // count는 1부터 시작~
			while (list.contains(result)) {
				result = list2.get(i) +count;
				count++;
				
			}
			list.add(result);
			
		} // for
		System.out.println(list);
			
	}

}
