package polymorphism_quiz02;

public class Circle extends Shape{
	
	
	public Circle(int radius) {
		super.name = "원";
		super.area = radius * radius * 3.14;
	}
	
	
	
	
//
//	// 필드
//	private int radius;
//	
	
	
//	// 생성자
//	public double circleArea (int radius) {
//		//(원의 반지름) X (원의 반지름) X (원주율)
//		return radius * radius * 3.14;
//		
//	}
//	
//	
//		
//	
//	// 출력
//		public void printRectangle() {
//			System.out.println("도형은 사각형이며 넓이는 " + this.circleArea(radius) + "cm^2 입니다.");
//		}
//	

}
