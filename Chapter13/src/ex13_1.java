
public class ex13_1 {

	public static void main(String[] args) {
		// 쓰레드의 구현과 실행
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);  // 생성자 Thread(Runnable target)
		
		t1.start();
		t2.start();

	}

}

class ThreadEx1_1 extends Thread { 
	public void run() { // 쓰레드가 수행할 작업
		for(int i = 0; i < 5; i++) {
			System.out.println(this.getName()); // 조상인 Thread의 getName()을 호출
		}
	}
}


class ThreadEx1_2 implements Runnable {
	public void run() {  //쓰레드가 수행할 작업
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
