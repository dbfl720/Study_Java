package Array;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 배열 응용하기

//		1. 배열 값 변경
//		index와 값을 차례로 입력 받아서, 아래 배열에 해당하는 index에 값을 바꾸고 출력 하세요.
		
//		int[] numbers = {3, 5, 2, 10, 39};
//		
//		numbers[2] = 16;
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] +" ");
//		}
		
		
//		2. 점수 채점
//		아래와 같이 O 와 X로 채점 결과가 저장된 배열이 있다.
//		100점 만점 기준으로 몇점을 맞았는지 출력하세요.
//		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//		
//		int count = 0;
//		for(int i = 0; i < scores.length; i++) {
//			if (scores[i] == 'O') {
//				count += 10;
//			} 
//			
//		}	System.out.println( count + "점");
	
		
		
//		
//		3. 임금 계산
//		아래 배열은 각각 월, 화, 수, 목, 금, 토, 일 7일간의 아르바이트를 한 시간을 나타낸다.
//		시급 기준이 아래와 같을때 7일 동안 일한 총 임금의 값을 출력하세요.
//		평일 시급 : 8500원
//		주말(토,일) 시급 : 9500원

		int[] works = {3, 5, 5, 3, 5, 3, 5};
		int sum = 0;
		for(int i = 0; i < works.length; i++) {
			if(i > 4) {  // 배열의 index 번호로 이용.
				sum += works[i] * 9500;
		
			} else {
				sum += works[i] * 8500;
			}
			
		}	
		System.out.println("일주일간 총 임금은 " + sum + "원");
	
		
		
		
//		4. 배열 값 변경
//		길이가 5인 int 배열을 만든다.
//		수를 계속 입력 받으면서, 입력 받은 수가 짝수 일때만, 배열에 저장한다.
//		배열이 가득차면 입력을 중단하고, 저장된 수들을 출력한다.
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] evens = new int[5];
		
		int index = 0;
		while (index < 5) {  // 조건식    0 1 2 3 4 
			System.out.print("수를 입력하세요: ");
			int number = scan.nextInt();
			if (number % 2 == 0) {
				evens[index] = number;  // evens 배열에 index를 집어 넣는다. 그리고 number을 대입.
				index++;
			}
			
		}
		
		for (int i = 0; i < evens.length; i++) {
			System.out.print(evens[i] + " ");
		}
		
	} // main
	

}
