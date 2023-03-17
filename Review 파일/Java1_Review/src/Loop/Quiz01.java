package Loop;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 종합문제
		 
//		3. 약수 구하기
//		수를 입력 받아서 그 수의 약수를 모두 출력하세요.
//		약수: 어떤 수를 나누어 떨어지게 하는 수
//
//		예) 8의 약수 => 1 2 4 8

		
		Scanner scan = new Scanner (System.in);
		System.out.print("수를 입력하세요 : ");
		
		int number = scan.nextInt();
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				System.out.print(i + " ");
				
			}
		
			
		}
		
		
		
		
//		2. 팩토리얼
//		팩토리얼은 1부터 그 수까지의 모든 수의 곱이고 아래와 같이 표현된다.
//		5! = 1 * 2 * 3 * 4 * 5
//		7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
//
//		수를 입력 받고 그 수의 팩토리얼을 출력하세요.
//		입력 받는 수의 최대값은 10이다.
		
//		System.out.print("수를 입력하세요 : ");
//		int number = scan.nextInt();
//		int sum = 1;
//		for(int i = 1; i <= number; i++) {  // 1~ 5
//			sum = sum * i;
//		} System.out.println(sum);
		
		
		
		
		
		
		
//		1. 합 구하기
//		수를 입력 받아서 1부터 입력 받은 수까지의 합을 출력하세요.
//		System.out.print("수를 입력하세요 : ");
//		int number = scan.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= number; i++) {
//			sum += i;
//		} System.out.println(sum);
//		
//		
		
		
		
	} // main

}
