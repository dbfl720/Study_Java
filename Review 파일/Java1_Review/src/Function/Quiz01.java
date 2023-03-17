package Function;

import java.util.Scanner;

public class Quiz01 {

	// 호출~
	public static void main(String[] args) {
		// 사용자 정의함수 만들고 사용하기(1)

//		4. 홀짝 함수
//		정수를 입력 받아서 짝수면 true 홀수면 false를 돌려 주는 함수를 만드세요.
		
	    Scanner scan = new Scanner(System.in);
//	    System.out.print("숫자를 입력하세요 : ");
//	    int number = scan.nextInt();
//	    		
//		System.out.println(isEven(number));
//		
//	}
	
		
		
		
		
//	    3. 몫과 나머지 출력 함수
//	    두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
//	    hint ) 함수 원형 - public static void printQuotientRemainder(int number1, int number2)
//	    입력 예시
		
//	    System.out.println("숫자와 나눌 수를 입력하세요 : ");
//	    int number1 = scan.nextInt();
//	    int number2 = scan.nextInt();
//	    
//	    printQuotientRemainder(number1, number2);
	
	   
	    
	    
	    
	    
	
//	    2. 평균 구하기 함수
//	    4개의 값을 받아서 평균을 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//	    hint ) 함수 원형 - public static double getAverage(int score1, int score2, int score3, int score4)
	
//	    System.out.print("점수를 입력하세요 : ");
//	    int score1 = scan.nextInt();
//	    int score2 = scan.nextInt();
//	    int score3 = scan.nextInt();
//	    int score4 = scan.nextInt();
//	    
//	    
//	    System.out.print("평균은 " + getAverage(score1, score2, score3, score4));
	    
	    
	    
	    
//	    1. 2의 제곱 함수
//	    정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//	    hint ) 함수 원형 - public static int getSquared(int x)

	    System.out.print("제곱값을 구할 숫자를 입력하세요 : ");
	    int number = scan.nextInt();
	    
	    System.out.println(number + "의 제곱은 " + getSquare(number) + "이다.");
	    
	
	
	
	} // main	
	
	
	
	
	
	
	
	
	
		
	    // 기능
//	    4.
//		public static boolean isEven (int number) 	{
//	    	if (number % 2 == 0 ) {
//	    		return true;
//	    	} 
//	    	return false;
			
			
//			
//			return number % 2 == 0 ? true : false;
//		
//		} 
	
		
		
	
	
	
//		3. 
//		public static void printQuotientRemainder(int number1, int number2) {
//			int quotient = number1 / number2;
//			int remainder = number1 % number2;
//			
//			 System.out.println("몫 : " + quotient);
//			 System.out.println("나머지 : " + remainder);
//		}
	
	
	
			
			
	
	//	 2.
//		public static double getAverage(int score1, int score2, int score3, int score4) {
//			double average = 0;			
//			return average = (double)(score1 + score2 + score3 + score4) / 4;
//		}
			
		
	
	
	
	
	   // 1.
		public static int getSquare(int x) {
		
			return x * x;
		}
		

}  // class

