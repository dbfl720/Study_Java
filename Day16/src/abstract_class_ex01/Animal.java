package abstract_class_ex01;

// 추상 클래스: 추상 메소드가 하나라도 존재하는 클래스 ( new로 추상 객체를 생성할 수 없다) -> 상속구조로 재구현 할 수 있기 때문에..
//- 추상 메소드 1개 이상
//- New를 할 수 없다
//- 자식 클래스가 반드시 구현해야 하는게 있을 때 추상 메소드  // 즉, 자식들이 반드시 override 해야 하는 메소드.
// - 중괄호 안쓰고 닫아버리는 메소드를 추상메소드이다. ! 


// 부모 - abstract 가 붙어있으면 부모가 되는 것임
public abstract class Animal {
	
	
	// 추상 메소드 : 자식 클래스가 반드시 재구현 해야하는 메소드이다.
	public abstract void cry();  // 중괄호 안쓰고 닫아버리는 메소드를 추상메소드이다. ! // 출력만 하고 리턴은 안하니깐 void 
	
	
	// 일반 메소드
	public void eat() {
		System.out.println("냠냠");
	}
	
	
}
