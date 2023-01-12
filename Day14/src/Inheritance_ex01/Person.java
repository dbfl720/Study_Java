package Inheritance_ex01;

// 부모 클래스 Super class
public class Person {
	// 필드
	protected String name; // protected : 자식한테만 물려준다. 같은 패키지 있는 애들도 물려준다.
	
	
	// 메소드
	public Person() {
		System.out.println("응애~~~~");
	}
	
	
	public Person(String name) {
		this.name = name;
	}
	
	
	public void introduce() {
		System.out.println("내 이름은 " + this.name + "입니다.");
	}
	
	
}
