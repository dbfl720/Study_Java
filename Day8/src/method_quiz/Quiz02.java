package method_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		// 1.
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};  //  배열의 4번째 = 사람 눈에 보이는 4번째 = 요소의 개수
		numbers[3] = 6;
		

		
//		// 2.
		for (int i = 0; i < numbers.length; i++) {  // int i  = index 번호   // 0 ~ 7
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
//		
//		// 3.   틀림!!! 
		for (int i = numbers.length - 1; i >= 0; i--) {  // 7 6 5 4 3 2 1 0  
			System.out.print(numbers[i] + " ");				// 끝값이 0이다 !! 
		}
		System.out.println();
//		
//		
//		// 4.    틀림!!! 
		// 8 6  1 5  // int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5}; 
//		for (int i = 0; i < numbers.length; i++) {   // 0부터 시작이면 항상 = 없다.  // 0 ~ 7
//			if (i % 2 != 0) {						 // 인덱스 홀수 번호일 때 출력 !!!
//				System.out.print(numbers[i] + " ");	 // 가독성은 좋음.
//			}
//		}
//		System.out.println();
//		
//		
//		for (int i = 1; i < numbers.length; i += 2)	{ // 1 3 5...  효율성이 좋음 (코딩 테스트)
//			System.out.print(numbers[i] + " ");
//		}
//		System.out.println();
		
		
		
		// 5.  2가 있는 위치.   int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
//		
		for(int i = 0; i < numbers.length; i++) {  // 0 번째부터 시작이니깐 끝나는 위치에 (=) 안들어감.		
			if (numbers[i] == 2) {
				System.out.println("2가 들어 있는 index 번호는 " + i);  // index 번호 =  번호.
			}
		} 
		
		
		// 6. 배열의 값 중 가장 큰 값을 출력.  
		int max = numbers[0];  // 변수가 바깥에 있어야 한다!! 반복문 안에 안들어가서.   // 3
		for(int i = 1; i < numbers.length; i++) {  // 0 ~ 7   // int 1이 된 이유는 0부터 max시작 해서..
			if(max < numbers[i]) {				   // 1 2 3 4 5 6 7 
				max = numbers[i];
				
			}
		}
		System.out.println("가장 큰 값은 " + max);
		
		
		
		// 7.  틀림.  int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5}; 
//		int min = Integer.MAX_VALUE;	
//		int minIndex = 0; 
//		for(int i = 0; i < numbers.length; i++) {
//			if(min > numbers[i]) {
//				min = numbers[i];
//				minIndex = i;   // 항상 최소값만 갖게 된다. 마지막에 있어서.. if문에.. 최종에..
//			}
//		}
//		System.out.println("최소의 인덱스는 " + minIndex);
//		
//	}
	
	
	
	
	   // 8.   int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5}; 
	   int sum = 0;	   
	   for(int i = 0; i < numbers.length; i++) {  // 0 ~ 7
		   sum += numbers[i];
		   
	   }
	   double average = (double)sum / numbers.length;  // 나누기는 int인지 double 인지 체크 ! 
	   System.out.println("평균은 " + average);
	}
}
	




