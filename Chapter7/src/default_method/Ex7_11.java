package default_method;

public class Ex7_11 {

	public static void main(String[] args) {
		// 디폴트 메서드와 static메서드
		Child3 c = new Child3();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface.staticMethod();
		

	}

}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
	public void method1() {
		System.out.println("method1() in Child3"); // 오버라이딩
	}
}


class Parent3 {
	public void method2() {
		System.out.println("method2() in Parent3");
	}
}



interface MyInterface {
	default void method1() { 	// method1()
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static  void staticMethod() {
		System.out.println("staticMehthod() in MyInterface");
	}
	
}


interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}


