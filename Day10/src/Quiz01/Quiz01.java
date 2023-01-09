package Quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		Circle cir = new Circle();
		
		cir.pi = 3.14;
		cir.radius = 8;
		
		// 원의 넓이 
//		double area = cir.circleWidth();
//		System.out.println("원의 넓이 : " + area);
		System.out.println("원의 넓이 : " + cir.circleWidth());  // 선생님 방식.

		
		// 원의 둘레
//		double circleAround = cir.circleAround();
//		System.out.println("원의 둘레 : " + circleAround);
		System.out.println("원의 둘레 : " + cir.circleAround());  // 선생님 방식.
		
		// 원의 25개 넓이
		System.out.println("원 25개 넓이 : " + cir.calculateWidth(25));
		
		
	}

}
