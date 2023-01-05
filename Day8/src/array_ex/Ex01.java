package array_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 배열(Array): 같은 자료형의 묶음
		
		// 배열의 초기화 (1)
		int[] scores = {89, 100, 72, 92, 95};	
		System.out.println(scores[0]);   // 첫번째 값
		System.out.println(scores[1]);	 
		System.out.println(scores[2]);	 
		System.out.println(scores[3]);	 
		System.out.println(scores[4]);	 
		
		
		
		// 배열의 초기화 (2)
		int[] numbers = new int[3];			// 몇 칸이 될 것인지 알려주는 식. 비어있는 칸.(사실은 Int형이라서 0이 들어있음)
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		
		
		// 배열의 값 변경
		numbers[0] = 1000;
		System.out.println(numbers[0]);
		System.out.println(numbers);  	// hash값
		
		
		// 반복문을 이용한 배열값 출력 
		for (int i = 0; i < 3; i++) {   // 0  1 2 => 3칸  // int -> index 약자 ( index 칸 번호)
			System.out.println(numbers[i]);
			 
		}
		
		for (int i = 0; i < scores.length; i++) {  // 0 ~ 4  => 5칸   // 배열명. length (칸 개수)
			
			System.out.println(scores[i]);
		}
		
		
		
		// 합계 구하기
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {	 // 0 ~ 4    // 0부터 시작하면 보통,  = 안붙임.
			sum += scores[i];		// 배열안에 있는 값. 
					
		}
		System.out.println(sum);
	
	}

}
