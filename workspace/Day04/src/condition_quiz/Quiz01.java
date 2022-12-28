package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
//		#1
//		정수를 입력 받고 음수인지 양수인지 출력하세요.
//		System.out.print("정수를 입력 하세요:");
//		int integer = scan.nextInt();
//		//음수 양수 0
		
//		if (integer < 0) {
//			System.out.println("음수입니다.");
//		}else if (integer > 0){
//				System.out.println("양수입니다.");
//		} else {
//			System.out.println("0");
//		}
//		
//	}



//		#2
//		점수를 입력 받고 90 점이상이면 A , 80점 이상 B, 70점 이상 C, 60점 이상 D, 그외 F 를 출력하세요
//		System.out.print("점수를 입력 하세요:");
//		int score = scan.nextInt();
//		
//		if (score >= 90) {   // 90 ~ 100
//			System.out.println('A');
//		} else if (score >= 80) {    // 80 ~ 89
//			System.out.println('B');
//		} else if (score >= 70) {    // 70 ~ 79
//			System.out.println('C');
//		} else if (score >= 60) {    // 60 ~ 69
//			System.out.println('D');
//		} else {					 // 59 이하
//			System.out.println('F');
//		}
//	}
//}


//		#3
//		BMI 수치를 입력 받아서 비만 판정을 출력하세요.
		
		System.out.print("bmi 수치를 입력하세요:");
		int bmi = scan.nextInt();
		
		if (bmi <= 10) {   // ~ 10
			System.out.println("정상");
		} else if (bmi <= 20) {			// 11 ~ 20
			System.out.println("과체중");
		} else {						// 21 ~ 
			System.out.println("비만");
		}
	}
}



