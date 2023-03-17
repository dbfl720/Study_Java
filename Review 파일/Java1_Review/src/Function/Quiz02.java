package Function;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 사용자 정의함수 만들고 사용하기(2)

//		3. 소수(prime) 판별
//		소수: 1과 자기자신 이외에 나누어 떨어지지 않는 수이다.
//
//		수를 입력 받고 그 수가 소수(prime)인지 아닌지 리턴하는 함수를 만들고 호출하세요.
//		소수이면 true, 소수가 아니면 false를 리턴
//		단, 입력하는 수는 2 이상
		
		
		Scanner scan = new Scanner (System.in);
//		System.out.print("수를 입력하세요 : ");
//		int num = scan.nextInt();
//		
//		
//		System.out.println(prime(num));
		
		
		
		
//		2. 최소값
//		 5개의 수를 입력 받아서 최소값을 출력하는 함수를 만드세요.(리턴값 없음)
//		 입력 가능한 최대값은 1000 입니다.
		
		 System.out.print("5개의 수를 입력하세요 : ");
		 int num1 = scan.nextInt();
		 int num2 = scan.nextInt();
		 int num3 = scan.nextInt();
		 int num4 = scan.nextInt();
		 int num5 = scan.nextInt();
		 
		 
		 minNumber(num1,num2,num3,num4,num5);
		 
		
		
		
		 
//		 1. 합 구하기
//		 수를 입력 받아서 1에서 부터 그 수 까지의 합을 구하는 함수를 만드세요.
//		 단, 합이 100이 넘으면 합을 중단하고 그 때 까지의 합을 리턴하세요.
//		
//		System.out.print("수를 입력하세요 : ");
//		int number = scan.nextInt();
//		
//		System.out.println(sum(number));
		
		
		
		
		
	} // main

	
	
	
	
	// 기능
	
	// 3.
//	public static boolean prime (int num) { // 2 3 5 7 11 13 17,...
//		for ( int i = 2; i < num; i++ ) {  //  2 3 4 5 6 7 .. 
//			if (num % i == 0) {
//				return false;
//			}
//			
//		}
//		return true;
//		
//		
//	}
//	
	
	
	
	
	// 2.
	public static void minNumber (int a, int b, int c, int d, int e) {
		
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		if (min > d) {
			min = d;
		}
		if (min > e ) {
			min = e;
		}
		
		System.out.println("최소값은 " + min);
	}
	
	
	
	
	
	//1.
	
//	public static int sum (int number) {
//		int sum = 0;
//		for(int i = 1; i <= number; i++) {
//			sum += i;
//			if (sum > 100) {
//				break;
//			}
//			
//		}
//		return sum;
//	}
}
