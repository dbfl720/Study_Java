package Thread_Ex;

public class Ex01 {

	public static void main(String[] args) {
		// 프로그램 : 명령어의 집합
		// 프로세스 : 실행되고 있는 프로그램
		// 쓰레드 : 프로세스의 실행 단위    -  클래스 상속, 인터페이스 구현
		
		// 쓰레드 만들기(1) : Thread 클래스를 상속 받아서 사용.
	    // 단점 : 자바는 단일 상속이므로 Thread를 상속 받으면 다른 클래스를 함께 상속  받을
		
		ThreadExtends te1 = new ThreadExtends("**");
		ThreadExtends te2 = new ThreadExtends("&&");
		
		
		ㄴ
		// Single Thread : 순차적으로 수행
//		te1.run();
//		te2.run();
		
		
		System.out.println("메인 메소드 끝");
	}

}