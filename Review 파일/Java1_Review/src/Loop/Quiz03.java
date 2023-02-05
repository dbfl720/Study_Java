package Loop;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// for문
		
//		5. 구구단
//		수를 입력 받아서 해당하는 단수의 구구단을 출력 하세요.

		
		Scanner scan = new Scanner (System.in);
//		System.out.print("단수를 입력하세요 : ");
//		int number = scan.nextInt();
//		int totalNumber = 0;
//		for (int i = 1; i <= 9; i++) {
//			totalNumber = number * i;
//			System.out.println(number + " x " + i + " = " + totalNumber);
//		}
		
		
		
		
//		4. 갯수 세기 ???  // 틀림
//		1 ~ 100 사이에 7의 배수 갯수를 구하세요.
//		
		int count = 0;  // count는 for문 밖에 써야 한다. 
		for ( int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count = count + 1;   // count++; 과 같은 값. // 7의 배수일 경우에만 count가 1씩 증가.
			}
			
			
		} System.out.println("7의 배수의 갯수는 : " + count);
	
		
		
		
//		4-2
//		int count = 0;
//		for (int i = 7; i <= 100; i += 7) {
//			count++;
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		System.out.println("7의 배수의 개수는:" + count);
		
		
		
		
		
		
		
//		3. 특정 조건 구하기
//		1 ~ 50 사이에 3의 배수만 출력하세요.
		
//		for (int  i = 1; i <= 50; i++) {
//			if(i % 3 == 0) {
//				System.out.print(i + " ");
//			}
//		}
			
		
		
		
//		2. 카운트 다운 출력
//		5 ~ -5 까지 출력하세요
		
//		for (int i = 5; i >= -5; i--) {
//			System.out.print(i + " ");
//		}
		
		
		
		
		
//		1. 반복 출력
//		35 ~ 40 까지 출력 하세요
//		for(int i = 35; i <= 40; i++) {
//			System.out.print(i + " ");
//		}
		
		
		
		
		
	} // main

}
