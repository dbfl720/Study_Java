package polymorphism_ex01;

// 자식 클래스
public class Cat extends Animal{
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
	public void grooming() {   // 공통적이지 않는 것만 자식에다가 만듬.
		System.out.println("그루밍");
	}
	
	
}
