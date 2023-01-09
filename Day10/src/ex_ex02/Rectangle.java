package ex_ex02;

public class Rectangle {

	
	// 가로,세로
	int width;
	int height;
	
	// 기능 부여
	// 메소드 (함수)
	// 넓이 계산 메소드
	int calculateArea() {
		int area = width * height;
		return area;
	}
	
	   // 매개변수 파라미터가 있는 메소드				// 매개변수 : int count
		// 개수에 따른 넓이 구하기
		// 오버로딩 (Overloading)   vs 오버라이딩(Overriding)  ** 면접 질문 많음.!! 
  		int calculateArea(int count) {   // int count를 여기에 쓴 이유 : 속성이라고 생각해서 쓰기에 어렵기 때문.
			return width * height * count;
		}
  		
  		// 오버로딩 : 같은 이름 메소드 가능. 단, 파라미터 타입 혹은 개수를 다르게 해서 표현한 메소드.
  		
  		
  		// 멤버 변수를 확인하는 메소드
  		void printInfor() {
  			System.out.println("가로 : " + width + " 세로 : " + height);
  		}
}
