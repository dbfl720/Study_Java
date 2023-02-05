package Array;

public class Quiz03 {

	public static void main(String[] args) {
		// 배열 기본 사용법

		int[] numbers = {3, 8, 9, 6, 2, 1, 7, 5};
		
//		1. 배열 값 접근
//		배열의 4번째 값을 6으로 바꾸세요.
		
//		numbers[3] = 6;
		
//		2. 배열 출력
//		배열의 값을 순서대로 출력하세요.
		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
		
		
//		3. 배열 역순 출력  ?? 
//		배열의 값의 반대 순서(역순)로 출력하세요.
//		for ( int i = numbers.length - 1; i >= 0; i--) {
//			System.out.print(numbers[i] + " ");
//		}
		
//		
//		4. 배열 출력  ?? 
//		배열의 짝수번째 위치에 있는 값들을 출력하세요.
		
//		for (int i = 0; i < numbers.length; i++) {   
//			if (i % 2 != 0) {		 // 배열의 위치(눈에 보이는 위치)는 i이다. numbers[i] - 인덱스의 위치 
//				System.out.println(numbers[i] + " ");
//			}
//		}
		
		
//		5. index
//		배열의 값 중 2가 들어 있는 index를 출력하세요.
//		반복문을 돌면서 2가 있는 값을 찾으세요.
		
//		for(int i = 0; i < numbers.length; i++) {
//			if ( numbers[i] == 2 ) {  // index는 numbers[i]
//				System.out.println("2가 들어 있는 index는 " + i ); // i는 numbers.length // 눈에 보이는 것.
//			}
//		}
		
		
		
//		6. 최대값
//		배열의 값 중 가장 큰 값을 출력하세요.
		
//		int max = numbers[0];
//		for(int i = 0; i < numbers.length; i++) {
//			if(numbers[i] > max) {
//				max = numbers[i];
//			}
//		}
//		System.out.println("가장 큰 값은 " + max);
		
		
		
//		7. 최소값 index
//		배열의 값 중 가장 작은 수가 저장된 index를 출력하세요.
		
		int min = numbers[0];
		int minIndex = 0;   // minIndex 변수를 만드세요.
		for (int i = 0; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
				minIndex = i;  // 인덱스 i를 minIndex에 넣으세요.
			}
		}
		System.out.println("최소값의 인덱스는 " + minIndex);
		
		
		
//		8. 평균
//		배열의 모든 수의 평균을 출력하세요
		
//		int sum = 0;
//		for(int i = 0; i < numbers.length; i++) {
//			
//			sum += numbers[i];
//			
//		} double average = (double)sum / numbers.length;
//		System.out.println(average);
		

		
		
		//* 정리
		// numbers[i]  : 눈(배열)에 보이는 값.
		// i : index 값. 0부터 시작~ 
	
		
		
	}  // main 

}
