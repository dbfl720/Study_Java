package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		
//		#1

		for (int i = 35; i <= 40; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
//		# 선생님 답안
		for (int i = 35; i <= 40; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
//		#2
	
		for (int j = 5; j >= -5; j--) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		
		
//		#3
//		3의 배수 - 1 ~ 50 사이
		for (int i = 3; i <= 16; i *= 3) {
			System.out.print(i  + " ");
		}
		
		
		
		
//		# 선생님 답안
//		(1)
		for (int i = 3; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
//		(2)  더 좋은 코드임. 코드 수가 적은 반복문 좋은 코드 - BigO 표기(알고리즘 측정 지표 / 시간 복잡도)
		for (int i = 3; i <= 50; i += 3) {   // 3~  
			System.out.print(i + " ");

			
			// o(1) - 한줄
//			   o(log n) - 반복문 횟수 줄임
//			   o(n) - 반복문 횟수문제)
//			   o(n log n) - 2중 반복문 횟수 줄임
//			   o(n^2) - 2중 반복문 횟수(문제)
		}

	}
}

