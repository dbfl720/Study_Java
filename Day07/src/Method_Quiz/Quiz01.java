package Method_Quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 각 메소드 role 역할을 잘 나눠야지 좋은 코드이다!
		
		Scanner scan = new Scanner(System.in);
		
		// #1.
//		System.out.print("제곱값을 구할 숫자를 입력하세요 : ");
//		
//		int num = scan.nextInt();
//		int squared = getSquared(num);   // ?
//				
//		System.out.println(num + "의 제곱은 " + squared + "입니다.");
		
		
		
		
		// #2.
//		System.out.print("4개의 점수를 입력하세요 : ");
//		
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		int score3 = scan.nextInt();
//		int score4 = scan.nextInt();
//		
//		
//		System.out.println("평균은 " + getAverage(score1, score2, score3, score4));
//		// 요술램프
		
		
		
		// 3.
		System.out.print("숫자와 나눌 수를 입력하세요 : ");
		
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		printQuotientRemainder(num1, num2);   // return 값이 없는 것은 출력을 하면 안된다!!
	}
	
	// 메소드 만드는 곳
	
	// 1. 제곱 함수
//	public static int getSquared(int x) {
//		return x * x;
//		
		
	// 2.
	public static double getAverage(int s1, int s2, int s3, int s4) {
		double average = (double)(s1 + s2 + s3 + s4) / 4;
		return average;
	}
		
	
	public static void printQuotientRemainder(int number1, int number2) {   //return 값은 하나만 가능하기 때문에, 여기서는 두개가 필요하므로 여기서 프린트를 하는 것이다!!!!! 
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("몫:" + quotient);
		System.out.println("나머지:" + remainder);
		
		// input : int number1, int number2
		//  값 구함. 63~ 66번째 줄
		// output : return 없음/ void
	
	}
}


