package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		
//		System.out.print("횟수를 입력하세요:");
//		int number = scan.nextInt();		
//		int i = 0;  // 		
//		while (i < number) {   // 반복문 돌리고 싶은 횟수는 오른쪽에 쓰자.
//			i++;			// 증감 연산자는 절대 빼먹으면 안된
//			System.out.println("화이팅!!!");
//		}
		
		
		
		
		
//		#2
//		수를 입력 받고 그 수에서 부터 0까지 한 줄씩 카운트 다운을 출력 하고 마지막에 "발사"를 출력하세요.
//		시작값 - 끝값
		
//		System.out.print("카운트 다운 수를 입력하세요 :");
//		int i = 3;
//		while (i >= 0) {
//			System.out.println(i);
//			i--;
//		}
//		System.out.println("발사");		// 반복이 안되면, 반복문 밖에 쓰면 된다.
						
		
		
		
		
		
		//#3.
//		int i = 0;
//		while (i < 5) {		// 0 1 2 3 4 
//			System.out.print("수를 입력하세요: ");
//			int number = scan.nextInt();
//			System.out.println("출력 : " + number );
//			i++;
//		}
//		
		
		
		
		
		
//		#4
//		int i = 1;
//		
//		while (i <= 9) {
//			int number = i * 3;
//			System.out.println("3 X " + i + " = " + number);
//			i++;
//		}
//		
		
		
		
		
		
		// 선생님 풀이
		int number = 3;
		int i = 1; // 끝값 1 ~ 9
		while ( i <= 9 ) {
			System.out.println(number + " X " + i + " = " + (number * i));
			i++;
		}
		
	}

}
