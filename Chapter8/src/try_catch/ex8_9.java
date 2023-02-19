package try_catch;

public class ex8_9 {

	public static void main(String[] args) throws Exception { // main도 예외를 JVM에게 떠너김. 즉 비정상 종료.
		// 메서드에 예외 선언하기1
		method1();  // 같은 클래스내의 static멤버이므로 객체 생성없이 직접 호출 가능.
		
	} // main
	
	static void method1() throws Exception {
		method2();
	} // method1
	
	static void method2() throws Exception {
		throw new Exception();  // 예외를 강제적으로 발생.
	} // method2 

}
