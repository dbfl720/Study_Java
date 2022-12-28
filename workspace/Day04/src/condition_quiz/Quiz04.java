package condition_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
//		#1
//		System.out.print("두 점수를 입력하세요:");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		double average = (double)(score1 + score2) / 2.0;
//		
//		if (average >= 70) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
//	}
//
//}

		
//		#2		** max 알고리즘 중요!! (최소값 구하기, 최대값 구하기)
		
//		System.out.print("세 개의 정를 입력하세요 :");
//		int number1 = scan.nextInt(); // 89
//		int number2 = scan.nextInt(); // 90
//		int number3 = scan.nextInt(); // 95
//		int max = number1;          // max 최대값 구하는 공식(선생님이 알려주심)
//		
//		if (max < number2) {
//			max = number2;
//		}
//		if (max < number3) {
//			max = number3;
//		}
//		System.out.println(max);
//	}
//}

		
		// 내가 푼 2번 문제.
//		
//		if (number1 > number2 && number1 > number3) {
//			System.out.println(number1);
//		} else if (number2 > number1 && number2 > number3) {
//			System.out.println(number2);
//		} else {
//			System.out.println(number3);
//		}
		
		
		
		
		
//		#3   중첩 if문 사용 (if문 안에 if문이 또 들어간 것)
//		System.out.print("점수1:");
//		int score1 = scan.nextInt();
//		System.out.print("점수2:");
//		int score2 = scan.nextInt();
//		
//		double average = (score1 + score2) / (double)2;
//		
//		if (score1 <= 50 || score2 <= 50) {
//			System.out.println("과락");
//		} else if (average >= 60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
//		if (average >= 60) {
//			if (score1 <= 50 || score2 <= 50) {
//				System.out.println("과락");
//			} else {
//				System.out.println("합격");
//			}		
//		} else { //평균이 60점 미만
//			System.out.println("불합격");
//		}
//	}
//}

		
		
//		#5
		System.out.print("윳 상태를 입력하세요 : ");
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int sum = n1 + n2 + n3 +n4; // 3  //sum이 무엇이냐에 따라서 도,개,걸,윳이 달라
		
	
		
		
		switch (sum) {
		case 1:
			System.out.println("도");
			break;
		case 2 :
			System.out.println("개");
			break;
		case 3 :
			System.out.println("걸");
			break;
		case 4 :
			System.out.println("윷");
			break;
		case 0 :
	 		System.out.println("모");
	 		break;
	
		} 
	}
}




//			#4
//		System.out.print("연도 :");
//		int year = scan.nextInt();
//		
//		if (year / 400 == 0) {
//			System.out.println("윤년");
//		} else if (year / 100 == 0) {
//			System.out.println("윤년이 아니다.");
//		} else if (year / 10 == 0) {
//			System.out.println("윤년");
//		} 
//	}
//}

		
