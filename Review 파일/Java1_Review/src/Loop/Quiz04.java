package Loop;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// while문과 복합 대입 연산자

//		4. 구구단
//		구구단 3단을 출력하세요
		
//		int i = 1;
//	
//		
//		while(i <= 9) {
//			
//				System.out.println("3 X " + i + " = " + i * 3);
//				i++;
//		
//		}
		
		
		
		
//		3. 반복 입력
//		while을 이용하여 5번 동안 수를 입력 받고 출력하세요.
		Scanner scan = new Scanner(System.in);
		
		
//		int i = 0;
//		while(i < 5) {
//			System.out.print("수를 입력하세요: ");
//			int number = scan.nextInt();
//			
//			i++;
//		}
		
		
		
		
		
//		2. 카운트 다운 "발사"
//		수를 입력 받고 그 수에서 부터 0까지 한 줄씩 카운트 다운을 출력 하고 마지막에 "발사"를 출력하세요.
//		System.out.println("카운트 다운 수를 입력하세요 : ");
//		int number = scan.nextInt();
//		int i = number;
//		while (i > 0) {
//					i--;
//					System.out.println(i);
//		}	System.out.println("발사");
//		
		
		
		
		
//		1. 반복 출력
//		수를 입력 받아서 그 수만큼 "화이팅!!!" 를 출력하세요
		
		System.out.print("횟수를 입력하세요 : ");
		int number = scan.nextInt();
		
		int i = 0;
		while (i < number) {
			i++;
			System.out.println("화이팅!!!");
	
		}
		
		
	} // main

}
