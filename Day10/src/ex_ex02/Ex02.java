package ex_ex02;

public class Ex02 {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		
		rect1.width = 8;
		rect1.height = 9;
		
		//넓이 구하기
//		int area = rect1.width * rect1.height;
//		System.out.println("넓이 : " + area);
		int area = rect1.calculateArea();		//	 코드가 훨씬 간결해짐.
		System.out.println("넓이 : " + area);
		
	 
		
		System.out.println(rect1.calculateArea(5));
		System.out.println(rect1.calculateArea(7));
		
		rect1.printInfor();
	}
	
	

}
