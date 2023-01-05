package method_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 1.
//		Scanner scan = new Scanner(System.in);
//		
//		int[] numbers = {3, 5, 2, 10, 39};	
//		System.out.print("변경할 index와 값을 입력하세요 : " );
//		int index = scan.nextInt();
//		int value = scan.nextInt();					
//		numbers[index] = value;
//		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//		
		

		
		
		
		// 2. 점수 채점
//		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//		
//		int sum = 0;
//		for (char i = 0; i < scores.length; i++) {			
//			if (scores[i] == 'O') {
//				sum += 10;
//				
//			} 
//		}
//		System.out.println(sum + "점");	
		
		
		
		// 2. *** 선생님 풀이.
//		int score = 0;
//		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//		for (int i = 0; i < scores.length; i++) {   // 0 ~9 => 10
//			if(scores[i] == 'O' ) {
//				score += 100 / scores.length;
//			}
//		}
//		System.out.println(score + "점");
			
			
			
			
			
			
		
		// 3. 임금 계산
//	    int[] works = {3, 5, 5, 3, 5, 3, 5};
//		int sum1 = 0;
//		int sum2 = 0;
//		int week = 0;
//		int weekend = 0;
//		for (int i = 0; i < works.length; i++) {
//			if (i < 5) {
//				week = works[i] * 8500;
//				sum1 += week;
//			} 
//			if (i >= 5){
//				weekend = works[i] * 9500;
//				
//				sum2 += weekend;
//			}
//			
//		} 
//		System.out.println("일주일간 총 임금은 " + (sum1 + sum2) + "원");
		
		
		
		
		// 3. ** 선생님 풀이
//		int[] works = {3, 5, 5, 3, 5, 3, 5};
//		int wage = 0;
//		for (int i = 0; i < works.length; i++) {  // 0 1 2 3 4 5 
//			if (i < 5) {   // 평일  0 ~ 4
//				wage += works[i] * 8500;
//			} else {  // 주말   5 ~ 6
//				wage += works[i] * 9500;
//			}
//		}
//		System.out.println("일주일간 총 임금은 " + wage + "원");
		
		
		
		
		
		
		
		
		// 4.   모르겠어요 ㅠ   틀림. 
//		Scanner scan = new Scanner(System.in);
//			
//		int[] number = new int[5];			
//		for (int i = 0; i < number.length; i++) {	
//			System.out.print("수를 입력하세요 : ");	
//			int a = scan.nextInt(); 		
//		if(number[i] % 2 == 0) {				    					
//			number[i] = a;
//			
//		} 
//			
//		}
//		  System.out.println(number);
//	}

		
		
		
		
		//  4. 선생님  // 배 값 변경.
		Scanner scan = new Scanner(System.in);
		int[] evens = new int[5];
		
		int index = 0;
		while (index < evens.length) {  // 0 1 2 3 4   // 가독성이 좋음.
			System.out.println("수를 입력하세요:");
			int number = scan.nextInt();
			if(number % 2 == 0) {
				evens[index] = number;  // 5까지 index를 넣어라  // 배열이 가득차면 입력을 중단.
				index++;
			}
		}
		
		
		
		
		
//		for (int i = 0; i < evens.length; ) {   // **** for문은 필요없으면 빈 공간으로 둬도 됨!!!!!!  // 보통 
//		    System.out.print("수를 입력하세요: ");   
//		    int number = scan.nextInt();
//		    if(number % 2 == 0) {
//		    	//배열에 넣는다.
//		    	evens[i] = number;
//		    	i++;     // 칸에 하나씩 넣는다.
//		    	
//		    }
//			
//		}
		for (int i = 0; i < evens.length; i++) {
			System.out.print(evens[i] + " ");
		}
		
	}
}
