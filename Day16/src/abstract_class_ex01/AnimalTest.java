package abstract_class_ex01;

public class AnimalTest {

	public static void main(String[] args) {
		// Animal animal = new Animal();   추상클래스는 추상 객체(부모)를 만들 수 없다. (인스턴스 할 수 없다.)
		
		// 다형성. 강제한다.. ? 
		Animal animal = new Tiger(); // up casting   // 추상 객체(부모)가 아니면 자식 객체로는 new 할 수 있음...!
		animal.cry();
		animal.eat();
		
	}

}
