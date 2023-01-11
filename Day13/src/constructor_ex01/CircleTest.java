package constructor_ex01;

public class CircleTest {

	public static void main(String[] args) {
		// 나의 의식
		Circle circle = new Circle(8);
		System.out.println("원의 넓이 :" + circle.circleWidth());
		System.out.println("원의 둘레 :" + circle.circleAround());
		System.out.println("원 25개 넓이:" + circle.circleWidth(25));
	}

}
