package Condition;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 종합문제 - 조건문
//		1. 평균 합격 구하기
//		두 점수를 입력 받고, 평균이 70점 이상이면 합격 그렇지 않으면 불합격을 출력하세요.

		
		Scanner scan = new Scanner(System.in);
//		System.out.print("두 점수를 입력하세요: ");
//		
//		int number1  = scan.nextInt();
//		int number2 = scan.nextInt();
//		double average = (double)(number1 + number2) / 2;
//		if (average >= 70) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
//		
		
		
		
		
//		2. 큰 값 구하기
//		세 개의 정수를 입력 받아서 가장 큰 값을 출력하세요.
//		입력 예시
//
//		세 개의 수를 입력하세요 : 3 8 5
//		
		
		System.out.print("세 개의 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max = num1;
		if(num2 > max) {
			max = num2;			
		}if (num3 > max) {
			max = num3;
		}
		
		System.out.println(max);
		
		
		
		
		
		
		
		
//		3. 과락 포함 합격 여부
//		점수 두 개를 입력 받고 합격 여부를 출력하세요.
//		평균이 60점 이상이면 합격
//		한과목이라도 50점 이하면 무조건 과락
//		평균 60점 미만이면 불합격


//		System.out.print("점수1 : ");
//		int num1 = scan.nextInt();
//		System.out.print("점수2 : ");
//		int num2 = scan.nextInt();
//		
//		
//	
//		int average = (num1 + num2) / 2;
//		
//
//		if (num1 <= 50 || num2 <= 50) {
//			System.out.println("과락");
//		} else if (average >= 60) {
//			System.out.println("합격");
//		} else if (average < 60) {
//			System.out.println("불합격");
//		}
//		
		
		
		
		
		
		
//		4. 윤년 구하기
//		연도를 입력 받아서 윤년인지 평년인지 출력하세요.
//		윤년 조건
//		4로 나누어 떨어지는 연도는 윤년이다.
//		100으로 나누어 떨어지는 연도는 윤년이 아니다.
//		400으로 나누어 떨어지는 연도는 무조건 윤년이다.
//		
//		
		
		System.out.print("연도 : ");
		int year = scan.nextInt();
		

		
//		
//		if (year % 400 == 0) {  // 무조건은 맨 앞에 쓴다.. ? 
//			System.out.println("윤년");
//		} else if(year % 100 == 0) {
//			System.out.println("평년");					
//		} else if(year % 4 == 0) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("평년");
//		}
		
		
		
		// < 4 - 2 >
		
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("평년");
//		}
		
		
		
		
		
		
		
//		5. 윷놀이
//		4개의 윷 상태가 입력되면 도, 개, 걸, 윷, 모를 출력하는 프로그램을 작성하시오.
//		윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태를 의미한다.
//		윷놀이는 4개의 윷을 이용하는 게임이다.
//
//		도 : 1개가 뒤집어진 상태
//		개 : 2개가 뒤집어진 상태
//		걸 : 3개가 뒤집어진 상태
//		윷 : 4개가 뒤집어진 상태
//		모 : 하나도 뒤집어지지 않은 상태
		
		
//		5-1.
//		System.out.print("윳 상태를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		int num4 = scan.nextInt();
//		
//		int sum = num1 + num2 + num3 + num4;
//		if(sum == 4) {
//			System.out.println("윷");
//		} else if (sum == 3) {
//			System.out.println("걸");
//		} else if (sum == 2) {
//			System.out.println("개");
//		} else if (sum == 1) {
//			System.out.println("도");
//		} else {
//			System.out.println("모");
//		}
//		
//		
//		
////		5-2
//		switch(sum) {
//			case 1 : 
//				System.out.println("도");
//				break;
//			case 2 :
//				System.out.println("개");
//				break;
//			case 3 :
//				System.out.println("걸");
//				break;
//			case 4 :
//				System.out.println("윷");
//				break;
//			default :
//				System.out.println("모");
//		}
//			
		
		
		
	}  // main
	

} // class

