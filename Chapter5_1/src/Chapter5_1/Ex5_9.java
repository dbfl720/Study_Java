package Chapter5_1;

public class Ex5_9 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
				
		};
		
		// 과목별 총점
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("======================");

		// 과목별 총점
		int korTotal = 0; 
		int engTotal = 0; 
		int mathTotal = 0;
		for (int i = 0; i < score.length; i++) {
			int sum = 0;    //  개인별 총점
			float avg = 0.0f;  // 개인별 평균
			
//			korTotal += score[i][0];
//			engTotal += score[i][1];
//			mathTotal += score[i][2];
//			System.out.println((i + 1) + " ");
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + " ");
				System.out.println();
			}
			
		
		}
	}

}
