package method_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {  // *****함수를 많이 쓰는게 중요하다!!!!!! ***** 연습!!! **
		
		
		Scanner scan = new Scanner(System.in);
		
		//1.   main메소드 간단하게 볼 수있음. 
//		System.out.print("수를 입력하세요:");
//		int number = scan.nextInt();		
//		System.out.println(getSumUntil100(number));
//		
		
		
		// 2. 
//		System.out.print("5개의 숫자를 입력하세요:");
//		int n1 = scan.nextInt();
//		int n2 = scan.nextInt();
//		int n3 = scan.nextInt();
//		int n4 = scan.nextInt();
//		int n5 = scan.nextInt();
//		
//		printMinValue(n1, n2, n3, n4, n5);
		
		
		
		
		//3. *** 매우 중요 !!! ****
		System.out.print("수를 입력하세요:");
		int number = scan.nextInt();		
		System.out.println(isPrimeNumber(number));
	}
	
	
	// 메소드 만드는 곳
	// 1.		input: 끝 숫자   output : 합계
	public static int getSumUntil100(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {			
			sum += i;	
			if (sum > 100) {
				    break;
			}
		}
		return sum;
		
	}
	
	
	// 2. input: 정수 5개    output : x   , 대신 출력
	public static void printMinValue(int n1, int n2, int n3, int n4, int n5) {
		//int min = Integer.MAX_VALUE;   // 대문자로 시작하는 애들은 class  // 가장 큰 숫자 .
		int min = n1;
		if (min > n2) {
			min = n2;
		} 
		if (min > n3) {
			min = n3;
		}
		if (min > n4) {
			min = n4;
		}
		if (min > n5) {
			min = n5;
		}
		System.out.println("최소값은 " + min);
	}
	
	
	
	// 3.  input : number     output: boolean
	public static boolean isPrimeNumber(int n) {  // 7    // 9  
		// 2 3 4 5 6 
		// 2보다 큰 수를 2부터 n보다 1 작은 숫자까지 나눠본다.
		
		
		for (int i = 2; i < n; i++ ) {  // (i < n / 2; )  // (i <= Math.sqrt(n);)  빨리 실행되는 코드 예시.
			if (n % i == 0) {// 하나라도 나누어 떨어지면 소수가 아니다.
				return false;
			}
		}
		// 여기까지 도달하면 나누어 떨어진 수가 없었거나, 2는 반복문에 들어가지 않았기 때문에 소수이다.
		return true;
	}
}
