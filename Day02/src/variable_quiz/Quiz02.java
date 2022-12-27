package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		// #1.
//		시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
//		시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
		
		char grade = 'A';
		double average = 4.0;
		
		char grade2 = 'B';
		double average2 = 3.0;
		
		// grade = 'B';    재활용해서 쓸 수도 있다. 이때, char, grade 안써도 됨.
		// point = 3.0;
		
		
		System.out.println("시험 성적이 90점 이상이면 '" 
		+ grade + "'학점이고 평점은 " + average + " 입니다.");
		System.out.println("시험 성적이 80점 이상이면 '" 
		+ grade2 + "'학점이고 평점은 " + average2 + " 입니다.");
		
		
		
		// #2.
//		int number1 = 33;
//		double number2 = 35.325;
//		두 수의 곱 : 1165.7250000000001
		
		
		int number1 = 33;
		double number2 = 35.325;
		
		System.out.println((number1 * number2));
		double result = number1 * number2;
		System.out.println(result);
		
		
		// #3.
//		943시간은 39일 7시간 입니다.
		
		int hour = 943;
		int d = hour / 24;  //몫 
		int h = hour % 24;  //나머지 
		
		System.out.println(hour + "시간은 " + d + "일 " + h + "시간 입니다.");
		
		
		// #4.
//		가로 길이 8, 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세요.
//		사각형의 넓이: 72
//		삼각형의 넓이: 36
		
		int width = 8;
		int height = 9;
		
		int rectangleArea = width * height;
		int triangleArea = width * height / 2;
		int triangleArea2 = rectangleArea / 2;
		
		System.out.println("사각형의 넓이: " + rectangleArea);
		System.out.println("삼각형의 넓이: " + triangleArea);
		System.out.println("사각형의 넓이: " + (width * height));
		System.out.println("삼각형의 넓이: " + (width * height / 2));
		System.out.println("삼각형의 넓이: " + (triangleArea2));

		
		
		
	}

}
