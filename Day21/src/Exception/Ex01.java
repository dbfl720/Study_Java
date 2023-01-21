package Exception;

public class Ex01 {

	public static void main(String[] args) {
		// 예외처리 (Exception) : 예상치 못한 상황에 대한 처리를 하는 것
		// try- catch - finally   - NullPointerException 에러 발생했을 때, 수행하는 코드.
		
		try {
			// NPE
//		String str = null;
//		str.isEmpty(); // 아무것도 없기 때문에
		
		
		// 배열 범위 참조 예외
//		int[] arr = new int[3]; // 0 1 2 
//		for (int i = 0; i <= arr.length; i++) { // 0 1 2 3 
//			arr[i] = i;
//		}
			
			// 캐스팅 예외
			Object x = new Integer(10);
			System.out.println((Integer)x);
	} catch (NullPointerException npe) {
			System.out.println("NPE가 발생했다.");
//			npe.printStackTrace();  // 에러 메시지 보고 싶을 때 추가하는 것.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 참조 오류가 발생했다.");
		} catch (Exception e) { // 정말로 못잡는 것들은 이것을 사용.
			System.out.println("모든 예외를 다 잡는다.");
		} finally { // 연결을 끊어야 때 사용. db사용 등등.
			System.out.println("예외이든 아니든 무조건 마지막에 불려진다.");
		}
		
		
		a();
		System.out.println("메인 메소드 끝");

	}

	public static void a() {
		b();
	}
	
	public static void b() throws Exception {  // throws 는 윌 ㅗ던진다.
		// 예외 발생 처리 방법 2가지
		// 1. try-catch로 처리 (내가 처리하겠다)
		// 2. 회피한다. (난 모르겠고 니가 처리해) - 위로 던진다.
		
		
		
		// 예외 발생시키는 법
		// CheckedException(Exception)    UncheckedException(RuntimeException)
		//throw new RuntimeException(); // 프로그램이 바로 종료된다.
		
		// system -> main -> a -> b 
		throw new Exception();
		
		
		
	}
}
