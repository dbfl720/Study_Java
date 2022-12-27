package variable_quiz;

public class Quiz03 {

	public static void main(String[] args) {
		
		//#1
//		아래와 같이 점수가 주어졌을 때 평균을 구해서 출력하세요.
//		평균은 소수 둘째자리 까지만 출력하세요.
//		국어 : 93 수학 : 88 영어 : 94
		
		
//		국어 93점, 수학 88, 영어 94점
//		평균: 91.67
		
		
		int korean = 93;
		int math = 88;
		int english = 94;
		
		int sum = korean + math + english;
		
		
		double average = (double)(korean + math + english) / (double)3;
		average = Math.round(average * 100) / 100.0;
		
		System.out.println("국어 " + korean + "점, 수학 " + math + "점," +
		"영어 "+ english + "점");
		System.out.println("평균:" + average);
		
		
		
		
//		#2
//		아래 공식을 이용해서 섭씨 30도의 화씨 온도를 출력하세요.
//		화씨 온도 = 9 / 5 * 섭씨온도 + 32
		
//		섭씨 30도는 화씨 86.0도 입니다.
		
		
		int c = 30;
		double HwaDegree = (double)9 / 5 * c + 32;   //나누기를 할때는 반드시 한쪽을 double 형으로 해야한다.
		
		System.out.println("섭씨 " + c + "도는 화씨 " + HwaDegree + "도 입니다.");
		
		

	}

}
