package Map;

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
//
//여유가 되면 문제가 중복되지 않도록 추가한다.

public class capital {

	
	public static final Map<String, String> capitalMap = new HashMap<String, String>() {
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
		// 나라의 수도 이름 맞추기
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		Set<String> keys = capitalMap.keySet();  // keySet()을 이용해서 map을 set으로 변경.
		List<String> keyList = new ArrayList<>(keys);  //  나라이름을 List의 index로 문제 낼 것이라서, 다시  ArrayList로 변경
		
		
		// 중복 검사 
		List<Integer> quizIndex = new ArrayList<>();  // 중복 검사를 위해 빈 ArrayList 객체를 만듬.
		
		int score = 0;
		for (int i = 0; i < 5; i++) {
			int randIndex = rand.nextInt(20);   // 0 ~ 19
			// 중복 검사
			if (quizIndex.contains(randIndex)) {
				i-- ; // 중복이면 다시 돈다.
				continue;
			}
			quizIndex.add(randIndex);   // 냈던 문제의 index 저장( 중복 검사 위해)
			// 중복 검사 끝.
			
			
			
			String country = keyList.get(randIndex); // 나라이름의 index들 중에서 중복 안된 5개 나라를 country에 대입.
			
			System.out.print(country + "의 수도 이름은?");
			String answer = scan.nextLine();
			
			if (answer.equals(capitalMap.get(country))) {  // map에서 get(key)은 key로 value를 반환.
				System.out.println("정답");
				score += 100 / 5;
				
				
			} else {
				System.out.println("틀렸습니다.");
			}
		}  // for문
		System.out.println("총 점수는 " + score);
		
		
		
	}

}
