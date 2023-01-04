package Chapter5;

public class Ex5_2 {

	public static void main(String[] args) {
		// 배열의 활용(1) - 총합과 평균
		int[] score = {100, 88, 100, 100, 90};
		
		int sum = 0;	     // for문 밖에 쓰기. 
		double average = 0f;  // for문 밖에 쓰기. 

		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (double)score.length; // 계산결과를 double타입으로 얻으려 형변환
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
	}

}
