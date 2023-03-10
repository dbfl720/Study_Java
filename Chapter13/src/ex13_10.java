
public class ex13_10 {

	public static void main(String[] args) {
		// suspend(), resume(), stop()
		
		RunImplEx10 r = new RunImplEx10();
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r, "***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();  // 쓰레드 th1을 잠시 중단시킨다.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();  // th1을 다시 동작하도록 한다.
			Thread.sleep(3000);
			th1.stop();  // th1을 강제종료시킨다.
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {}

	}

}

class RunImplEx10 implements Runnable {
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
