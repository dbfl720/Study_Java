package try_catch;

public class Ex8_6 {

	public static void main(String[] args) {
		// 예외 발생시키기
		try {
			Exception e = new Exception("고의로 발생시켰음.");  // 예외 클래스 객체를 만든다.
			throw e; //예외를 발생시킴.
			// throw new Exception("고의로 발생시켰음")   // 한 줄로 줄여 쓸 수있다.
		} catch (Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}

}
 