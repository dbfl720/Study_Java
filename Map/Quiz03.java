package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Quiz03 {

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
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

//        **** map은 객체 꺼낼 때 keySet() 메소드로 모든 키를 set 컬렉션으로 얻고 반복문 후 get() 메소드로 얻을 수 있다.
//       ****** 여기서는 list로 바꿔서 반복문을 돌림. set 컬렉션은 index가 없기 때문에...
        Set<String> keys = capitalMap.keySet();  // keys: 나라이름
        List<String> keyList = new ArrayList<>(keys); // keyList : 나라이름

        // 중복검사
        List<Integer> quizIndex = new ArrayList<>();
        
        
        int score = 0;
        for(int i = 0; i < 5; i ++) {
        	int randIndex = rand.nextInt(20); // 0 ~ 19        	
        	// 중복 검사
        	if (quizIndex.contains(randIndex)) {
        		i--;  // 중복이면 다시 돈다.
        		continue; 
        	}
        	quizIndex.add(randIndex);  // 냈던 문제의 index 저장( 중복 검사 위해..)
        	//중복 검사 끝.
        
        	
        	
//        	arrayList - get(index) : 저장된 위치(index)에 저장된 객체를 반환.
        	String country = keyList.get(randIndex);
        	
        	System.out.print(country + "의 수도 이름은?");
        	String answer = scan.nextLine();
        	
        	if(answer.equals(capitalMap.get(country))){
        		System.out.println("정답");
        		score += 100 / 5;
        		
        	} else {
        		System.out.println("틀렸습니다.");
        	}
        	
        } // for
        System.out.println("총 점수는 : " + score);
        
    }

}
