package chapter12;

public class Ex12_7 {

	class Parent {
		void parentMethod() {}
	}

	
	class Child extends Parent {
		@Override
		void parentmethod() {} // 조상 메서드의 이름으르 잘못 되었음을 알려줌.
	}
}
