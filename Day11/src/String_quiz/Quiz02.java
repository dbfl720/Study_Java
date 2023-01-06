package String_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 문자열 입력
//		id를 입력 받고, 아래와 같이 환영 메시지를 출력하세요.
//		Welcome! {id}
		
		Scanner scan = new Scanner(System.in);
			
//		System.out.print("ID를 입력 하세요 : ");
//		String id = scan.next();    //  String id = scan.next(); 
//		System.out.println("Welcome! " + id);
//
//		
		
	

		
		// 2. ?????
//		문자열 검색
//		영어 단어를 입력 받고 'e' 가 몇 개 들어 있는지 출력 하세요.
//		
//		System.out.print("단어를 입력하세요 : ");
//		String word = scan.next();
//				
//		int count = 0;
//		for(int i = 0; i < word.length(); i++) {
//			if(i == 'e') {				
//				count++;				
//			}			
//		}
//		System.out.println("e의 개수는 " + count + "개 입니다.");
		
		
		
		
		// 2. 선생님
		System.out.print("단어를 입력하세요:" );
		String word = scan.next();    // elephant
		int count = 0;
		for (int i = 0; i < word.length(); i++ ) {// 스펠링 개수 만큼 돈다.
			if (word.charAt(i) == 'e') {
				count++;
			}
			
		}
		System.out.println("e의 개수:" + count);
		
//		
//		// charAt: n번째 index에 무슨 문자가 있는지 확인
//		char a = s1.charAt(4);
//		System.out.println("charAt: " + a);
		
	}

}
