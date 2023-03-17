package Chapter5;

public class Ex5_3 {

	public static void main(String[] args) {
		// 배열의 활용(2) - 최대값과 최소값
		
		int[] score = { 79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {   // 배열의 두 번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화 했다.
			if(score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);

	}

}
