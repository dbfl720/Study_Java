package variable_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
//		#1
//		System.out.println("숫자를 입력하세요 : ");
//		int number = scan.nextInt();
//		
//		if (number > 10) {
//			System.out.println("10보다 큽니다.");
//		}
//		if (number < 10) {
//			System.out.println("10보다 작습니다.");
//		}
//
//		if (number == 10) {
//			System.out.println("10과 같습니다.");
//		}
//		
		
		
		
//		#2
//		System.out.print("두 개의 수를 입력하세요:");  // 43 25
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		
//		if (b < a) {
//			System.out.println("a가 더 큽니다.");
//		}
//		if (a < b) {
//			System.out.println("b가 더 큽니다.");
//			
//			
//		}
//		if (a == b) {
//			System.out.println("a와 b는 같습니다.");
//			
//		}
	
	
		
		
		
//		#3
//		System.out.print("성적을 입력하세요 : ");
//		int score = scan.nextInt();
//		
//		if (score >= 70) {
//			System.out.println("합격입니다.");
//		}
		
	
		
//		#4
		System.out.print("수를 입력하세요 : ");
		int number5 = scan.nextInt();
		
		boolean isEven = number5 % 2 == 0;
		if (isEven) {   //if문 안에는 참이거나, 거짓의 명제가 들어가야
			System.out.println("짝수");
		}
		
		
		if (number5 % 2 != 0) {   //if문 안에 넣는게 더 가독성이 좋다.
			System.out.println("홀수");
		}
			
		
		scan.close();
	}

}
