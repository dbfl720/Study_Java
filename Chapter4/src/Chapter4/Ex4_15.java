package Chapter4;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		
		// do - while문
		int input = 0;
		int answer = 0;
		answer = (int)(Math.random() * 100) + 1;
		
		do {
			System.out.print("1과 100 사이의 정수를 입력하세요 : ");
			input = scan.nextInt();
		
			 if (input > answer) {
				 System.out.println("더 적은 수로 다시 시도해보세요.");
			 } else if (input < answer) {
				 System.out.println("더 큰 수로 다시 시도해보세요.");
			 }			
					
		} while(input != answer);
		 System.out.println("정답입니다.");
	}

}
