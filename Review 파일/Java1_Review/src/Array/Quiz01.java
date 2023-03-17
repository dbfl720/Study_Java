package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 배열 고급문제
//		위치 변경 (swap)
//		두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.
//		int[] numbers = {3, 5, 2, 10, 39};

		

		// 1.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("두 개의 index를 입력하세요 : ");
//		int index1 = scan.nextInt();
//		int index2 = scan.nextInt();
//	
//		
//		int[] numbers = {3, 5, 2, 10, 39};
//		
//		int temp = numbers[index1];
//		numbers[index1] = numbers[index2];
//		numbers[index2] = temp;
//		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//	
		
		
		
		
		// 2.
//		배열 순서 변경
//		1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤섞어서 그 결과를 출력하세요.
//		힌트
//		Random을 이용해서, 0번째 index의 값과 rand() 번째 index의 값의 서로 교체하면 된다.
//		
		int[] numArr = {1,2,3,4,5,6,7,8,9,10};		
		Random rand = new Random();
	
		// 0번째 index와 random index와 교체를 100번 반복해서 뒤섞는다.     
//		for (int i = 0; i < 100; i++) {  // i는 인덱스 칸 번호 아님. 100번 섞는 i임 
//		    int randIndex = rand.nextInt(10); // 0 ~ 9까지의 숫자를 랜덤으로 뽑는다.
//		    
//		    // 무조건 0인덱스와 randIndex 값을 맞바꾼다.
//		    // swap 구현			  
//		     int tmp = numArr[0];
//		     numArr[0] = numArr[randIndex];  // numArr배열에 randIndex를 넣는다. 
//		     numArr[randIndex] = tmp;
//		
//			}
//		     System.out.print(Arrays.toString(numArr));
	    
		    
	
		
//		3. 빈도수 구하기
//		1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장되어있다.
//		1 ~ 5 까지의 숫자가 각각 몇 개씩 저장되어 있는지 출력하세요.
		
//		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
//		int[] freq = new int[6];  // 인덱스가 6인 이유는 인덱스가.0부터 시작하기 때문에 총 5개가 필요..// 빈도수 저장할 공간을 배열로 만든다.
//								// 0번째 인덱스 칸은 버린다. 1~5까지 각각의 빈도수 저장.
//		for (int i = 0; i < numbers3.length; i++) {   // 0 ~ 9
//			freq[numbers3[i]]++;  // 예시 - freq[5] += 1;     // 5 == numbers[3]
//		}
//		for (int i = 1; i < freq.length; i++) {  //1~5
//			System.out.println(i + ":" + freq[i] +"개");
//		} 
		
		
		
	} // main

}
