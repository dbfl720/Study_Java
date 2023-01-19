package map_quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Quiz03 {

	  public static void main(String[] args) {
	        Map<String, String> myCharacter = new HashMap<>();
	        myCharacter.put("닉네임", "마로비아나");
	        myCharacter.put("직업", "마법사");
	        myCharacter.put("서버", "B");
	        myCharacter.put("레벨", "38");

	        // [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
	        List<Map<String, String>> charaters = new ArrayList<>();
	        Map<String, String> character1 = new HashMap<>();
	        character1.put("닉네임", "사자고양이");
	        character1.put("직업", "전사");
	        character1.put("서버", "A");
	        character1.put("레벨", "11");
	        charaters.add(character1);

	        Map<String, String> character2 = new HashMap<>();
	        character2.put("닉네임", "하구루");
	        character2.put("직업", "마법사");
	        character2.put("서버", "B");
	        character2.put("레벨", "46");
	        charaters.add(character2);

	        Map<String, String> character3 = new HashMap<>();
	        character3.put("닉네임", "바다");
	        character3.put("직업", "힐러");
	        character3.put("서버", "B");
	        character3.put("레벨", "23");
	        charaters.add(character3);

	        Map<String, String> character4 = new HashMap<>();
	        character4.put("닉네임", "초보");
	        character4.put("직업", "힐러");
	        character4.put("서버", "A");
	        character4.put("레벨", "4");
	        charaters.add(character4);

	        Map<String, String> character5 = new HashMap<>();
	        character5.put("닉네임", "린다G");
	        character5.put("직업", "힐러");
	        character5.put("서버", "B");
	        character5.put("레벨", "84");
	        charaters.add(character5);

	        
	        
	      
	        
//	        파티원 구하기
//	        필요한 파티원의 정보를 출력하세요.
//	        탐색 시 Iterator를 사용하세요.
//
//	        ＊n명의 게임 캐릭터 정보가 주어진다.
//	        ＊필요한 파티원 조건:
//	        - myCharacter와 같은 서버의 "힐러" 직업을 가진 멤버 후보를 모두 출력한다.
	        
	        
	        // 1. 서버 B 찾기, 힐러 직업을 가진 멤버 찾아서 모두 출력
	        // 2. 레벨이 가장 높은 사람 출력  - 최대값 구하는 식
	        
	        
	        
	        String job = "힐러";
	        String level = "B";	        
	        // List	    
	        Iterator<Map<String, String>> liter = charaters.iterator();	        
	        while (liter.hasNext()) {
	        	
	        	Map<String, String>  partyOne = liter.next(); 
	        		        	        	
	        	if (partyOne.containsValue(job) && partyOne.containsValue(level)) {
	        		System.out.println(partyOne);
	        	} 
	        	
  
	        } 	
	        
	        
	  }// main

	       

}
