package Chapter2;

public class Ex2_8 {

	public static void main(String[] args) {
		int x = 10, y = 5;   	//int x = 10; int y = 5;로 한 줄로
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		int tmp = x;  
		x = y;
		y = tmp;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
