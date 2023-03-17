package variable;

public class Ex6_14 {

	static {
		System.out.println("static { }");  // 클래스 초기화 블럭
	}

	
	{ 
		System.out.println(" { } "); // 인스턴스 초기화 블럭
	}
	
	public Ex6_14() {
		System.out.println("생성자");
	}
}
