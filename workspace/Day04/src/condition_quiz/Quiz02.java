package condition_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("월을 입력하세요:");
		int month = scan.nextInt();
		
		switch (month) {
		case 3, 4, 5 :   // 3 또는, 4 또는, 5   
			System.out.println("봄");
			break;
		case 6, 7, 8 :  // 6 또는, 7 또는, 8
			System.out.println("여름");
			break;
		case 9, 10, 11 :
			System.out.println("가을");
			break;
		case 12, 1, 2 : 
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못된 월입니다.");
							
		}
		
			
	}
}
