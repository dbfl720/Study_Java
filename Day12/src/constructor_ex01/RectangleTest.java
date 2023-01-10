package constructor_ex01;

public class RectangleTest {

	public static void main(String[] args) {
		// 나의 의식
		Rectangle rect = new Rectangle(30, 50);
		System.out.println("넓이:" + rect.rectWidth() + "cm^2");
		System.out.println("둘레:" + rect.rectRound() + "cm");		

		
		Rectangle rect2 = new Rectangle(10, 10);
		System.out.println("넓이:" + rect2.rectWidth() + "cm^2");
		System.out.println("둘레:" + rect2.rectRound() + "cm");
		
	

	}

}
