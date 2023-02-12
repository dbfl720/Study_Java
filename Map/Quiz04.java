package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Quiz04 {

	 public static void main(String[] args) {
	        // {장르1={책제목1=작가1, 책제목2=작가2}, 장르2={책제목1=작가1, 책제목2=작가2}}

	        // {
	        //    자기계발={더 해빙=이서윤,홍주연, 말 그릇=김윤나, 메모의 마법=마에다 유지},
	        //    소설={어린왕자=생텍쥐페리, 아몬드=손원평, 나미야 잡화점의 기적=히가시노 게이고, 해변의 카프카=무라카미 하루키},
	        //    과학={시간은 흐르지 않는다=카를로 로벨리, 코스모스=칼 세이건, 평행우주=미치오 카쿠}
	        // }

	        Map<String, Map<String, String>> bookMap = new HashMap<>();

	        Map<String, String> map1 = new HashMap<>();
	        map1.put("더 해빙", "이서윤,홍주연");
	        map1.put("말 그릇", "김윤나");
	        map1.put("메모의 마법", "마에다 유지");

	        Map<String, String> map2 = new HashMap<>();
	        map2.put("어린왕자", "생텍쥐페리");
	        map2.put("아몬드", "손원평");
	        map2.put("나미야 잡화점의 기적", "히가시노 게이고");
	        map2.put("해변의 카프카", "무라카미 하루키");

	        Map<String, String> map3 = new HashMap<>();
	        map3.put("시간은 흐르지 않는다", "카를로 로벨리");
	        map3.put("코스모스", "칼 세이건");
	        map3.put("평행우주", "미치오 카쿠");

	        bookMap.put("자기계발", map1);
	        bookMap.put("소설", map2);
	        bookMap.put("과학", map3);
	        //System.out.println(bookMap);

	        // 책 이름 입력
	        Scanner scan = new Scanner(System.in);
	        System.out.print("책이름을 입력해주세요: ");
	        String searchBook = scan.nextLine();

	        //책이름에 해당하는 작가명을 출력한다.
	        // 예) 어린왕자의 작가명은 생텍쥐페리
	        
	        // 1번째 방법.
//	        Iterator<String> iter = bookMap.keySet().iterator();
//	        while(iter.hasNext()) {
//	        	String genre = iter.next();
//	        	if(bookMap.get(genre).containsKey(searchBook)) {
//	        		// get(키) : 키로 값을 얻어온
//	        		String author = bookMap.get(genre).get(searchBook);  // bookMap의 장르에서 책이름을 author에 저장.
//	        		System.out.println(searchBook +"의 작가명은 " + author);
//	        		break;  // 작가명을 찾았으면 불필요한 loop를 돌지 않고 종료.
//	        	}
//	        	
//	        }
	        
	        
	        // 2번째 방법.
	        Iterator<String> iter = bookMap.keySet().iterator();
	        while(iter.hasNext()) {
	        	String genre = iter.next();
	        	Map<String, String> book = bookMap.get(genre);
	        	if(book.get(searchBook) != null) {  // 책이 있으면
	        		System.out.println(searchBook + "의 작가명은 "+ book.get(searchBook));
	        		break;
	        	}
	        }
	     
	    }

}
