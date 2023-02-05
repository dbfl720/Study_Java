package String;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// 문자열 입력 받기

//		문자열 검색
//		영어 단어를 입력 받고 'e' 가 몇 개 들어 있는지 출력 하세요.
//		입력 예시
//
//		단어를 입력하세요 : elephant
//		출력 예시
//
//		e의 개수는 2개 입니다.
//		

		// 2.
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("단어를 입력하세요 : ");
//		String alphbet = scan.nextLine();
//		
//		int count = 0;
//		for(int i = 0; i < alphbet.length(); i++) {
//			if(alphbet.charAt(i) == 'e') {
//				count++;
//			}
//		}	System.out.println("e의 개수는 " + count + "개 입니다.");
		
		
		
		
		// 1.
//		문자열 입력
//		id를 입력 받고, 아래와 같이 환영 메시지를 출력하세요.
//		Welcome! {id}
//		입력 예시
//
//		ID를 입력 하세요 : hagulu
//		출력 예시
//
//		Welcome! hagulu
		
		System.out.print("ID를 입력 하세요 : ");
		String id = scan.nextLine();
		
		System.out.print("Welcome! " +  id);
		
		
	}

}
