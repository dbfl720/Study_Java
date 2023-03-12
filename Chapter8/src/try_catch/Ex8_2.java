package try_catch;

public class Ex8_2 {

	public static void main(String[] args) {
		// try-catch
		System.out.println(1);// 실행.
		try {
			System.out.println(0/0); // 고의로 ArithmeticException 발생.
			System.out.println(2);  // 실행되지 않는다.
		} catch (ArithmeticException ae) {
			System.out.println(3); // 실행
		} // try-catch 
		System.out.println(4); // 실행
		
	}

}
