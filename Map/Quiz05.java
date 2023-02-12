package Map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Quiz05 {

	public static void main(String[] args) {
		// 자료구조 활용 추가문제1 - 파티원

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

	        // 같은 서버 그리고 힐러 직업.
	        int max = 0; // 제일 높은 레벨.
	        Map<String, String> maxCharacter = null; // 레벨이 제일 높은 사람.
	        
	        Iterator<Map<String, String>> iter =  charaters.iterator();
	        while(iter.hasNext()) {
	        	Map<String, String> character = iter.next();
	        	//System.out.println(character);
	        	String server = character.get("서버");
	        	String job = character.get("직업"); //전사 마법사 힐러 힐러 힐러
	        	
	        	
	        	// 1.1번째 방법. 레벨이 높은 사람.
	        	if(server.equals(myCharacter.get("서버")) && job.equals("힐러")) {
	        		//System.out.println(character);  // charaters 아니고.. character 프린트해야됨. 
	        	     Integer level = Integer.parseInt(character.get("레벨")); // 문자열 -> 기본형 Integer.parseInt

	        	     if(max < level) {
	        	    	 max = level;
	        	    	 maxCharacter = character;
	        	    	 
	        	     }
	        	
	        	}
	        	
	        	
//	        	//2. 2번재 방법. 레벨이 높은 사람
//	        	
//	        		maxCharacter = character;        	
//	        		if(maxCharacter.get("레벨").compareTo(character.get("레벨")) < 0) { // A.compareTo(B) 기준값(A)이 더 크면 : 1, B가 더 크면 -1, 같으면 0
//	        			maxCharacter = character;
//	        		}
	        	
	        	
	   	       	        	
	        	
	        } // while 끝
	       System.out.println(maxCharacter);
	        
	        
	      
	        
	        
	    

	}

}
