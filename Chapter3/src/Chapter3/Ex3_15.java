package Chapter3;

import java.util.Scanner;

public class Ex3_15 {

	public static void main(String[] args) {
		// 논리 연산자 && || 
		Scanner scan = new Scanner (System.in);
		System.out.print("문자를 하나 입력하세요 : ");
		
		char ch = ' ';
		
		String input = scan.nextLine();
		ch = input.charAt(0);
		
		if ('0' <= ch && ch <= '9') {
			System.out.println("입력하신 문자는 숫자입니다.");
			
		}
		
		if(('a') <= ch && ch <= ('z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력하신 문자는 영문자입니다.");
		}
	}

}
