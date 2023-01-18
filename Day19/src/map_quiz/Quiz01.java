package map_quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

//나라의 수도 이름 맞추기
//랜덤으로 뽑힌 나라의 이름을 맞추는 게임
//
//나라-수도가 들어있는 20개의 쌍이 주어진다.
//이 중 랜덤으로 5개의 문제가 주어지고, 사용자로부터 나라에 해당하는 수도를 입력 받는다.
//정답인지 아닌지 수도를 입력한 즉시 출력한다.
//모두 풀고 나면 점수(100점 만점)가 출력된다.

public class Quiz01 {
	
	// static + final: 처음부터 값을 넣고 시작하는 상수
	// final keyword : 한번만 초기화 하도록 하는 것
	// 1. 변수: 변수에 붙이면 한번 초기화 된 변수에 값 재할당 불가
	// 2. 메소드: 오버라이드 불가  // 잘 안쓰임.
	// 3. 클래스: 상속 불가  // 잘 안쓰임.
	public static final Map<String, String> capitalMap = new HashMap<>() {  // 필드  // final: 한번 채워지면 못 바꿈.같은 비워놓고 시작 가능. 상수 : static final 
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("튀르키예", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };
    
    
    
    
	public static void main(String[] args) {
		
		Random rand = new Random();		
		Scanner scan = new Scanner(System.in);
		
		
		
			// 5문제 랜덤 0~19
		    // set -> list
		
		 Set<String> keys = capitalMap.keySet();  // 인덱스 번호 없음
		 List<String> keyList = new ArrayList<>(keys);  // 인덱스 번호 있음  0 ~ 19
		 
		 
		 
		 // 중복검사
		 List<Integer> quizIndex = new ArrayList<>();
		 
		int score = 0;
		for (int i = 0; i < 5; i++) {		 
			 // ***선생님
			 int randIndex = rand.nextInt(keyList.size());	// 0 ~ 29 => 20
			
			 // 중복검사
			 if (quizIndex.contains(randIndex)) { // 중복
				 i--;  // 중복이면 다시 돈다.
				 continue;  // skip하게 하는것.
			 }
			 
			 // 문제
			 quizIndex.add(randIndex); // 냈던 문제의 index 저장(중복 문제 내지 않기 위해)
			 
			 		 
			 String country = keyList.get(randIndex);  // ** 
			 System.out.print(country + "의 수도 이름은?");
			 String answer = scan.next();  // 사용자가 입력한 정답
			 
			
			 if (capitalMap.get(country).equals(answer)) {  // ** 
				 System.out.println("정답");
				 score += 100 / 5;
			 } else {
				 System.out.println("오답");
			 }
			 
		}	 
			 System.out.println("총 점수는 " + score);
			 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//			// "c"라는 키가 존재하는가?
//			System.out.println(map1.containsKey("c"));
		 
		// !!!!!!!****중요!!!!**** key로 값 얻어오기
		//	System.out.println(map1.get("a")); // key에 해당하는 값이 나옴.
		 
//		 int score = 0;
//		 for (int i = 0; i < 5; i++) {
//			 System.out.println("수도 이름은?" + rand.nextInt(20));
//		 if (capitalMap.containsKey(capitalName)) {
//			 System.out.println(capitalMap.get(capitalName));
//			 System.out.println("정답");
//			 score += 10;
//		 } else {
//			 System.out.println("틀렸습니다.");
//		 }
//		 		 
//		 }
//		 System.out.println("총 점수는 " + score);
		 
		 
		 
		 
		 
		
		 
	}

}
