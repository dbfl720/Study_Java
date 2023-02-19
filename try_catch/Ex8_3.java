package try_catch;

public class Ex8_3 {

	public static void main(String[] args) {
		// 예외의 발생과 catch 블럭
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);  // 실행되지 않는다.
		} catch (Exception e) {	//ArithmeticException 대신 Exception을 사
			System.out.println(5);
		} // try-catch 
		System.out.println(6);
	}

}
