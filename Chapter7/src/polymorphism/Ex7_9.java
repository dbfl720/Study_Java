package polymorphism;

public class Ex7_9 {

	public static void main(String[] args) {
		// 여러 종류의 객체를 배열로 다루기 예제
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();

	}

}
