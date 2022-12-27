package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		//시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
		//시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
	char grade = 'A';
	double point = 4.0;
	System.out.println("시험 성적이 90점 이상이면 '" + grade + "'학점이고 평점은 " + point + " 입니다." );
	
	grade = 'B';
	point = 3.0;
	System.out.println("시험 성적이 80점 이상이면 '" +  grade + "'학점이고 평점은 " + point + " 입니다." );
	
	
	int number1 = 33;
	double number2 = 35.325;
	System.out.println("두 수의 곱:" + (number1 * number2));
	double result = number1 * number2;
	System.out.println("두 수의 곱:" + result);
	
	//943 시간은 몇일 몇시간 인지 구하여 출하세요.
	//943 시간은 39일 7시간 입니다.
	
	int hour = 943;
	int d = hour / 24;  //몫, 일
	int h = hour % 24; //나머지, 시간 
	System.out.println(hour + "시간은 " + d +"일 " + h + "시간 입니다.");
	
	
	
	// 가로 길이 8, 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세
	
	int width = 8; // 가로
	int height = 9; // 세로
	
	//삼격형 : 밑변 * 세로 / 2 => double
	int rectangleArea = width * height;
	double triangleArea = rectangleArea / 2;
	System.out.println("사각형의 넓이:" + rectangleArea);
	System.out.println("삼각형의 넓이: " + triangleArea);
	
	
	
	
	
	}

}
