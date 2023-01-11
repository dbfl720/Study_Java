package constructor_ex01;

public class Circle {
	
	// 필드
	// setter 혹은 생성자로 필드 접근 가능해서 둘 중 하나 선택!!
	private double radius;
	
	
	// 메소드
	// 생성자
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	
	// 원의 넓이 : (원의 반지름) X (원의 반지름) X (원주율)
	// input : 필요없음, 반지름 필드 있어서,  output : double
	public double circleWidth() {
//		double circleWidth = this.radius * this.radius * 3.14;
//		return circleWidth;
		return this.radius * this.radius * 3.14;
//		return this.radius * this.radius * Math.PI;   
	}
	
	
	
	// 원의 둘레 : 반지름 x 2 x 3.14
	// input: x,  output: double	
	public double circleAround() {
//		double circleAround = this.radius * 2 * 3.14;
//		return circleAround;
		return this.radius * 2 * 3.14;
		
	}
	
	
	// 개수에 따른 원의 넓이
	// 오버로딩 ( 파라미터 개수 다르거나 타입이 다르거나,  매소드 명은 같은데..)
	// 오버로딩 : 메소드 이름이 같은데 파라미터의 개수가 다르거나 타입이 다른 경우
	// 다른 메소드로 인지하고 일치하는 메소드로 자동 호출 되는 것
	public double circleWidth(int count) {  // 확장성을 위해 파라미터로 개수를 받아온다.
	//	return this.radius * this.radius * 3.14 * count;
		return circleWidth() * count;
	}
	
	
	

}
