package chapter11_p;

import java.util.Arrays;

public class Ex11_6 {

	public static void main(String[] args) {
		// Arrays의 메서드 예제
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13}, {21,22,23}};
		
		System.out.println("arr =" + Arrays.toString(arr));
		System.out.println("arr2D = " + Arrays.deepToString(arr2D));  // Arrays.deepToString() 2차원 배열 복사.
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);  // copyOf: 배열 전체 복사
		int[] arr3 = Arrays.copyOf(arr2, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);   // 0 ~6
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // 2~3  // 4는 포함 안됨.
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);  // 끝은 포함 안되고 복사. 즉 0~6 
		
		
		System.out.println("arr2 = " + Arrays.toString(arr2));
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr4 = " + Arrays.toString(arr4));
		System.out.println("arr5 = " + Arrays.toString(arr5));
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7,  9);  // Arrays.fill 사용.
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*6) + 1); // Arrays.set 사용.
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		
		for(int i : arr7) { // 향상된 for문 : arr7 요소를 빼서 i에 집어 넣기.
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph) + i);  // 생성자 사용..
		}
		
		
		String[][] str2D = new String[][] {{"aaa", "bbb"},{"AAA", "BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"},{"AAA", "BBB"}};
		
		
		
		System.out.println(Arrays.equals(str2D, str2D2));   // false  // 2차원 배열이라서 equals 사용 불가.
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};
		
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B')); // binarySearch는 정렬이 우선 되어야 되기 때문에, 오류남.
		System.out.println("= After sorting = ");
		Arrays.sort(chArr);  // 정렬.
		System.out.println("chArr = " + Arrays.toString(chArr)); //  정렬됨.
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B')); // 올바른 결과 나옴.
		
		
	} // main

}
