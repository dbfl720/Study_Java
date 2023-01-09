package Quiz01;

public class Circle {
	// 원의 넓이 (원의 반지름) X (원의 반지름) X (원주율)
	// 원의 둘레 (반지름) x2 x 3.14
	double pi;	// 멤버변수
	int radius;  // 반지름
	
	
	// 넓이 메소드
	double circleWidth () {
		double area = radius * radius * pi;
		return area;
	}
	
	// 둘레 메소드
	double circleAround () {
		double aroundArea = (radius * 2) * pi;
		return aroundArea;
	}	
	
	// 개수에 따른 넓이 메소드
	double calculateWidth (int count) {
		// double area = circleWidth() * count;
		//return area;
		return radius * radius * pi * count;
		
	}
			
} // class

	