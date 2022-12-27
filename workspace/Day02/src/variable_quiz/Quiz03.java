package variable_quiz;

public class Quiz03 {

	public static void main(String[] args) {
	//국어 93점, 수학 88점, 영어 94점
	//평균: 9167
		
		int korean = 93;
		int math = 88;
		int english = 94;
		double average = (double)(korean +math + english) / 3;
		average = (double)Math.round(average * 100) / (double)100;
		System.out.println("국어 " + korean + "점, 수학 " + math
				+ "점, 영어 " + english + "점");
		System.out.println("평균: " + average); 
		
		
		// 2. 화씨 온도 = 9 / 5 * 섭씨온도 + 32
		int c = 30;
		double f = (double)9 / 5 * c + 32;
		
		// 섭씨 30도는 화씨 86.0도 입니다.
		System.out.println("섭씨 " + c + "도는 화씨" +f + "도 입니다.");
	}

}
