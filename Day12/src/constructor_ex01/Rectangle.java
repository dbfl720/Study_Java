package constructor_ex01;

public class Rectangle {
	
	// 필드
	private int width;
	private int height;
	
	
	// 메소드
	// 생성자
	public Rectangle(int width, int height) {
		System.out.println("가로 " + width + "cm, 세로 " + height + "cm 사각형이 만들어졌습니다." );
		this.width = width;
		this.height = height;
	}
	
	
	
	// setter
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	// getter
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	
	
	
	
	// 넓이, 둘레 메소드
	public int rectWidth() {
		int rectWidth = this.width * this.height;
		return rectWidth;
	}
	
	
	public int rectRound() {
		int rectRound = (this.width + this.height) * 2;
	// 직사각형의　둘레 = （가로의　길이　＋　세로의　길이）X 2
		return rectRound;
	}
	
}
