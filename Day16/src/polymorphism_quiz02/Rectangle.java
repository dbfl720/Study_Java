package polymorphism_quiz02;

public class Rectangle extends Shape { 
	// 부모의 필드가 있으니깐, 자식이 필드를 안 만들어도 됨. (상속을 받아서...)
	
	
//	// 필드
//	private int width;
//	private int height;
//	
	
	
	// 생성자   // input : width, height   
	public Rectangle (int width, int height) {	 // 생성자는 리턴 값 없고, 클래스명 일치해야함!!!!!
		super.name = "사각형";
		this.area = width * height;
		
		
	}
	
	

}
