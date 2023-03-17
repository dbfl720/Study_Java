package Chapter4;

public class Ex4_7 {

	public static void main(String[] args) {
		
		
		// Math.random() 임의의 정수만들기
		int num = 0;
		
		for (int i = 1; i <= 5; i++) {
			num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
		}
	}

}
