package polymorphism_quiz02;


// 부모
public class Shape {

	// 필드 ( 교집합이 되는 것만 쓰는게 좋다.)
	protected String name;  // 도형의 이름
	protected double area;
	
	
	
	// 메소드
	public void printArea() {
		System.out.println("도형은 " + this.name  + "이며 넓이는 " + this.area + "cm^2 입니다.");
		
	}
	
	
}
 