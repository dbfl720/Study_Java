package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz01 {

	public static void main(String[] args) {
//		1. 자료 입력
//		아래 과목 이름과 성적 정보를 Map 저장하고 출력 하세요.
//		국어 : 90, 수학 : 85, 영어 : 90, 사회 : 80, 과학 : 100
//		출력 예시
//
//		{국어=90, 사회=80, 과학=100, 수학=85, 영어=90}

		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("국어", 90);
		map1.put("수학", 85);
		map1.put("영어", 90);
		map1.put("사회", 80);
		map1.put("과학", 100);
//		System.out.println(map1);
		
		
		
//		2. 값 수정
//		사회 시험의 채점에 문제가 있어서 5점을 더 올려야 한다.
//		값을 바꾸고 출력 하세요.
//		출력 예시
//
//		{국어=90, 사회=85, 과학=100, 수학=85, 영어=90}
		
		
		map1.put("사회", map1.get("사회") + 5);
		System.out.println(map1);
		
		
		
		
//		3. 값 찾기
//		과목명을 입력 받고, 점수를 출력 하세요.
//		단, 입력한 과목이 없을 경우 "자료 없음"을 출력 하세요.
//		입력 예시
//
//		조회할 과목명을 입력하세요 : 영어
//		출력 예시
//
//		영어 : 90
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("조회할 과목명을 입력하세요 : ");
//		String subject = scan.next();
//			
//		if (map1.containsKey(subject)) {  // key는 subject
//			System.out.println(subject + " : " + map1.get(subject));
//		} else {
//			System.out.println("자료 없음");
//		}
		
		
		
		
		
		
		
		
		
		
		
//		if (subject.equals("국어")) {
//			System.out.println("국어 : " + map1.get("국어"));
//		} else if (subject.equals("사회")) {
//			System.out.println("사회 : " + map1.get("사회"));
//		} else if (subject.equals("과학")) {
//			System.out.println("과학 : " + map1.get("과학"));
//		} else if (subject.equals("수학")) {
//			System.out.println("수학 : " + map1.get("수학"));
//		} else if (subject.equals("영어")) {
//			System.out.println("영어 : " + map1.get("영어"));
//		} else {
//			System.out.println("자료 없음");
//		}
		
		
		
		
		
		
		
//		4. 
//	  Set<String> keys = map1.keySet();  // 과목명들 // set은 순서가 없기 때문에 일반 for문을  못 돌아서,, iterator 혹은  향상된 for문으로 해야됨.
//	  Iterator<String> iter = keys.iterator();
	  
	  Iterator<String> iter = map1.keySet().iterator();
	  while (iter.hasNext()) {
		 String subject = iter.next();  // key
		 if (map1.get(subject) >= 90) {
			 System.out.print(subject + " ");
		 }
	  }
		
		
		
		
		
		
		
		
//		5. 값 확인
//		100점 성적이 있는 학생에게 성적 우수상을 주기로 하였다.
//		성적 우수상을 받을 수 있는지 출력하세요.
//		출력 예시
//
//		수상 가능
		
//		if (map1.containsValue(100)) {
//			System.out.println("수상 가능");
//		} else {
//			System.out.println("해당 없음");
//		}
		
		
		


		
		
		
	}

}
