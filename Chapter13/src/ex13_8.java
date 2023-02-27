
public class ex13_8 {

	public static void main(String[] args) {
		// sleep() 예제
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start(); th2.start();
		
		try {
			th1.sleep(2000);  // 일시정지 // th1을 sleep안시키고 main쓰레드에 영향이 감.(sleep())은 항상 현재 실행 중인 쓰레드에 작동하기 때문.
		} catch (InterruptedException e) {}
		
		System.out.print("<<main 종료>>");

	} // main

}

class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) System.out.print("-");
		System.out.print("<<th1 종료>>");
	}
}



class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) System.out.print("|");
		System.out.print("<<th2 종료>>");
	}
}
