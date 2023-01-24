package inheritance;

public class Ex7_3 {

	public static void main(String[] args) {
		// 참조변수 super(2)
		
		Child2 c = new Child2();
		c.method();

	}

}

	class Parent2 {int x = 10;} // super.x
	
	class Child2 extends Parent2 {

		
		void method() {
			System.out.println("x = " + x); // 부모 x
			System.out.println("this.x = " + this.x); // 부모 x
			System.out.println("super.x = " + super.x); // 부모 x
		}
	}
