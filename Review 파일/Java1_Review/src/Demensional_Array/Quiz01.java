package Demensional_Array;

import java.util.Arrays;

public class Quiz01 {

	public static void main(String[] args) {
		// 2차원 배열 다루기

//		1. 10 입력하기
//		[2][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 모든 곳에 10을 넣고 출력하세요.
//		출력
//
//		10 10 10 
//		10 10 10 
		
//		int[][] number = new int[2][3];
//		for(int i = 0; i < number.length; i++) {
//			
//			for(int j = 0; j < number[i].length; j++) {
//				number[i][j] = 10;
//			}
//		}
//		System.out.print(Arrays.deepToString(number));
		
		
		
		
//		2. 순서대로 입력하기
//		[3][4] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장 하고, 출력하세요.
//		출력
//
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4 
		
		
//		int[][] numbers = new int[3][4];
//		for(int i = 0; i < numbers.length; i++) {
//			for(int j = 0; j < numbers[i].length; j++) {
//				numbers[i][j] = j + 1;
//			
//			}
//			
//		}
//		System.out.println(Arrays.deepToString(numbers));
		
		
		
//		3. 배열 별로 입력하기
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 첫 번째 행은 1, 두 번째 행은 2, 세 번째 행은 3으로 채우고 출력하세요.
//		출력
//
//		1 1 1
//		2 2 2 
//		3 3 3 
		
//		int[][] numbers = new int[3][3];
//		for (int i = 0; i < numbers.length; i++) {
//			for(int j = 0; j < numbers[i].length; j++) {
//				numbers[i][j] = i + 1;
//			}
//		}
//		System.out.print(Arrays.deepToString(numbers));
		
		
		
		
//		4. 십자(+) 그리기  // ?????
//		[5][5] 크기의 배열을 만드세요.
//		모든 값을 0으로 초기화 하세요.
//		반복문을 이용해서, 아래와 같이 + 위치에 1을 입력 하고 출력하세요.
//		출력
//
//		0 0 1 0 0 
//		0 0 1 0 0 
//		1 1 1 1 1 
//		0 0 1 0 0 
//		0 0 1 0 0 
		
//		int[][] numbers = new int[5][5];
//		
//		for (int i = 0; i < numbers.length; i++) {
//			for(int j = 0; j < numbers[i].length; j++) {
//				numbers[i][j] = 0;
//				if(i == 2 || j == 2) {  // 2번째 인덱스칸에 1을 넣기.
//					numbers[i][j] = 1;
//				}
//			}
//		} System.out.println(Arrays.deepToString(numbers));
//		
		
		
		
		
		
//		5. 전체 수 입력 ??????
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//		출력
//
//		1 2 3    i:0 * 3 , j:j+1=1   = 1
//		4 5 6    i:1 * 3 , j:j+1=1   = 4
//		7 8 9    i:2 * 3 , j:j+1=1   = 7
		
//		int[][] numbers = new int[3][3];
//		for(int i = 0; i < numbers.length; i++) {
//			for(int j = 0; j < numbers[i].length; j++) {
//				numbers[i][j] = (i * 3) +(j + 1);
//				
//			}
//		} System.out.println(Arrays.deepToString(numbers));
//		
//		
////		// 5-2
//				int value = 1;
//				for (int i = 0; i < arr5.length; i++) {
//					for (int j = 0; j < arr5[i].length; j++) {
//						arr5[i][j] = value++;
//					}
//				}
//		
		
		
		
		
		
//		6. 전체 수 입력
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//		출력
//
//		1 4 7 
//		2 5 8 
//		3 6 9 
		
		
		int[][] numbers = new int[3][3];
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = (i + 1) + (j * 3);   // i : 0 + 1 , j: j +3  = 4
			}
		} System.out.println(Arrays.deepToString(numbers));

//		1 4 7  // i : 0 + 1 / j: 0 * 3, 1 * 3, 2 * 3 
//		2 5 8         1 + 1 /    0 * 3, 1 * 3, 2 * 3           
//		3 6 9 		  2 + 1 ,    
				
		
//		1 2 3    i:0 * 3 , j:j+1=1   = 1
//		4 5 6    i:1 * 3 , j:j+1=1   = 4
//		7 8 9    i:2 * 3 , j:j+1=1   = 7
		
		
		
		
//		// 출력 메소드
//		public static void printArray(int[][] arr) {			// 매개변수 (Parameter)
//			for (int i = 0; i < arr.length; i++ ) {	// 행 0 1
//				for (int j = 0; j < arr[i].length; j++) {  // 열 0 1 2
//				System.out.print(arr[i][j] + " ");
//				}
//				System.out.println();  // 행이 끝나는 지점에서 줄바꿈 		
//			}
//			System.out.println();
//		}
	
	
		
	} // main

}
