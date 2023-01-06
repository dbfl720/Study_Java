package two_d_array_quiz;

public class Quiz2 {

	public static void main(String[] args) {
		// 1. [2][3]  모두 10
//		int[][] arr1 = new int[2][3];
//		
//		// 입력
//		for (int i = 0; i < arr1.length; i++) {  //  행  0 1
//			for (int j = 0; j < arr1[i].length; j++) {  	 // 열 0 1 2
//				arr1[i][j] = 10;
//				
//			}
//		}
//			
//		
//		
//		// 출력
//		printArray(arr1);
//		
//  
//	}
	
	
	
		
		// 2.
//		int [][] arr2 = new int [3][4];
//		
//		// 입력
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				arr2[i][j] = j+1;
//				
//			}
//		}   
//		
//		printArray(arr2);
//	
//	} // 메인
	
	
	
		// 2.  선생님
//		int [][] arr2 = new int[3][4];
//		for (int i = 0; i < arr2.length; i++) {  // 0 ~ 2   => 3행
//			for (int j = 0; j < arr2[i].length; j++) {  // 0 1 2 3 => 4열
//				arr2[i][j] = j + 1;
//			}
//			
//		}
//		
//		
//		// 출력
//		printArray(arr2);
//		
//		
		
		
		
		
	
	
	    // 3.
//	    int [][] arr3 = new int [3][3];
//	    	    
//	    // 입력
//	    for (int i = 0; i < arr3.length; i++) {
//	    	for (int j = 0; j < arr3[i].length; i++) {
//	    		arr3[i][j] = i+1;
//	    		
//	    	}
//	    }
//	    
//	    printArray(arr3);
//	}
	
	
	
	
	
		
		
		//3. 선생님
//		int[][] arr3 = new int[3][3];
//		
//		for (int i = 0; i < arr3.length; i++) {
//			for (int j = 0; j < arr3[i].length; j++) {
//				arr3[i][j] = i + 1;
//			}
//		}
//	
//	   printArray(arr3);
//	}
//	
	
		
		
	//	4. 선생님
//		int[][] arr4 = new int[5][5];   // int로 만들면 기본적으로 0이 채워져있음.
//		for (int i = 0; i < arr4.length; i++) {
//			for (int j = 0; j < arr4[i].length; j++) {
//				// j가 2 index, i가 2 index
//				if(j == 2 || i == 2) {
//					arr4[i][j] = 1;
//				}
//				
//				
//			}
//				
//				
//		} 
//		printArray(arr4);
//	}
		
		
		
		
		
		
		
		
		// 5.
//		int [][] arr5 = new int[3][3];
//
//		int num = 1;
//		for (int i  = 0; i < arr5.length; i ++) {			
//			for(int j = 0; j < arr5[i].length; j++) {
//				arr5[i][j] = num; 
//				num++;
//				
//			}
//		}
//		printArray(arr5);
//		
//	}

	
	
		
	     // 6. 
//		int [][] arr6 = new int[3][3];
//		
//		int num = 1;
//		for (int i = 0; i < arr6.length; i++) {
//			for(int j = 0; j < arr6[i].length; j++) {
//				arr6[i][j] = num;
//				num += 3;
//			}
//		}
//		printArray(arr6);
//	}
//	
		
		
		
		
	
	
		
	
	// 출력 메소드
	public static void printArray(int[][] arr) {			// 매개변수 (Parameter)
		for (int i = 0; i < arr.length; i++ ) {	// 행 0 1
			for (int j = 0; j < arr[i].length; j++) {  // 열 0 1 2
			System.out.print(arr[i][j] + " ");
			}
			System.out.println();  // 행이 끝나는 지점에서 줄바꿈 		
		}
		System.out.println();
	}

}
// 클래스


