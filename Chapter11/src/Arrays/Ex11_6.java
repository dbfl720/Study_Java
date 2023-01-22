package Arrays;

import java.util.Arrays;

public class Ex11_6 {

	public static void main(String[] args) {
		// Arrays의 메서드 
		int[] arr = {0,1,2,3,4};
		int[][]  arr2D = {{11,12,13},{21,22,23}};
		
	//	System.out.println("arr = " + Arrays.toString(arr));	
	//	System.out.println("arr2D = " + Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length); // index 길이.
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2 = " + Arrays.toString(arr2));
		System.out.println("arr2 = " + Arrays.toString(arr3));
		System.out.println("arr2 = " + Arrays.toString(arr4));
		System.out.println("arr2 = " + Arrays.toString(arr5));
		System.out.println("arr2 = " + Arrays.toString(arr6));

		
		int[] arr7 = new int[5];
		Arrays.fill(arr7,  9);  // arr = [9,9,9,9,9]
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*6) + 1);
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		
		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph,  '*');
			System.out.println(new String(graph) + i); // 생성자 사용
		}
		
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2)); // false;
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true;  2차원, 3차원 이상의 배열은 deepToString 사용한다.
		
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E' };
		
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B')); //- 2 정렬하지 않아서 잘못된 결과 나옴.
		System.out.println(" = After sorting = ");
		Arrays.sort(chArr); // binarySearch 이진탐색은 정렬을 먼저 해야한다.
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
		
		
	}
	

}
