package Thread_Ex;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		// 프로그램 : 명령어의 집합
		// 프로세스 : 실행되고 있는 프로그램
		// 쓰레드 : 프로세스의 실행 단위    -  클래스 상속, 인터페이스 구현
		
		// 쓰레드 만들기(1) : Thread 클래스를 상속 받아서 사용.
	    // 단점 : 자바는 단일 상속이므로 Thread를 상속 받으면 다른 클래스를 함께 상속  받을 수 없음
		
		ThreadExtends te1 = new ThreadExtends("**");
		ThreadExtends te2 = new ThreadExtends("&&");
		
		
		
		// Single Thread : 순차적으로 수행
//		te1.run();
//		te2.run();
		
		
		// Multi Thread: 각각의 쓰레드가 동시에 수행(반드시 start 메소드 써야함)
		// 속도가 빨라서 싱글스레드처럼 보임. sleep을 추가해야 한다.
//		te1.start();  //thread 안에 있는 메소드임.
//		te2.start();
		
		
		// 쓰레드 만들기(2): Runnable 인터페이스 구현
		// 다중 상속 가능
		// 멀티쓰레드를 위해서 Thread 객체에 담아서 사용한다.  // 더 많이 사용!!
		ThreadImplements ti1 = new ThreadImplements("***");
		ThreadImplements ti2 = new ThreadImplements("!!!");
		
		
//		ti1.run();
//		ti2.run();
		
		Thread t1 = new Thread(ti1);
		Thread t2 = new Thread(ti2);
		
		// Multi Thread
		t1.start();
		t1.join();  // 메인 쓰레드가 t1 쓰레드가 일을 다 할 때까지 기다린다.  // 즉 메인이 기다린거다.
		t2.start();
		t2.join();
		
		
		System.out.println("메인 메소드 끝");
	}

}