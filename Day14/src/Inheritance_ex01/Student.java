package Inheritance_ex01;

// 자식 클래스 ChildClass
public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println("학생입니다.");
	}
	
	
	public Student(String name, String major) {
		super(name);  // 부모 생성자는 위쪽에 위치해야한다. // 부모 생성자는 항상 첫번째 줄에 위치 해야 한다.  () 있으면 부모가 private 해도 상관 없음
		this.major = major;
		//super.name = name; 
		//this.name 혹은 super.name 둘 중 하나 써도 됨.
		
	}
}
