package inheritance;

public class Ex7_2 {

	public static void main(String[] args) {
		// 참조변수 super
		
		Child c = new Child();
		c.method();

	}

}

	class Parent {int x = 10;} // super.x
	
	class Child extends Parent {
		int x = 20; //this.x
		
		void method() {
			System.out.println("x = " + x); // 가까운 x
			System.out.println("this.x = " + this.x); // 부모 x
			System.out.println("super.x = " + super.x); // 부모 x
		}
	}
