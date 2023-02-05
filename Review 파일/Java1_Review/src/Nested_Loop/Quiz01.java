package Nested_Loop;

public class Quiz01 {

	public static void main(String[] args) {
		// 중첩 반복문(Nested Loop)
		
		//5. 피라미드
		//아래 형태처럼 *을 출력하세요.

//		    *
//		   ***
//		  *****
//		 *******
//		*********
		
		
		for(int i = 1; i <= 5; i++) {  //   1 2 3 4 5
			System.out.println(" ");
			for(int j = 5; j >= i; j--)  //  5 4 3 2 1 
			System.out.print(" ");
			
			for(int k = 1; k <= (i*2)-1; k++ ) {  // 1 2 3 4 5 6 7 8 9
				 System.out.print("*");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		3. 별찍기
//		아래 형태처럼 *을 출력하세요
//		출력 예시
//
//		*
//		**
//		***
//		****
//		*****
//		
//		for (int i = 1; i <= 5; i++) {    // 1 2 3 4 5 
//			System.out.println(" ");
//			for(int j = 0; j < i; j++) {  // 0 1 2 3 4 
//				System.out.print("*");
//			}
//		}
		
		
		
//		4. 거꾸로 된 삼각형
//		아래 형태처럼 *을 출력하세요.
//		출력 예시
//
//		*****
//		****
//		***
//		**
//		*
		
		
//		for ( int i = 1; i <= 5; i++ ) {     // 1 2 3 4 5 
//			System.out.println(" ");
//			for (int j = 5; j >= i; j--) {   // 5 4 3 2 1
//				System.out.print("*");
//			}
//		}
		
		
		
		
		
		
			
		
		
	} // main

}
