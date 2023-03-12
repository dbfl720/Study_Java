
public class ex13_6 {

	public static void main(String[] args) throws Exception {
		// 쓰레드 우선순위
		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();
		
		th2.setPriority(7);  // 지정 안 할 경우 기본적으로 5로 세팅
		
		System.out.println("Prority of th1(-) : " + th1.getPriority());
		System.out.println("Prority of th2(|) : " + th2.getPriority());
		th1.start();
		th2.start();
		
	}

}

	class ThreadEx6_1 extends Thread{
		public void run() {
			for(int i =0; i < 300; i++) {
				System.out.print("-");
				for (int x = 0; x < 10000000; x++); // 시간 지연용 for문
			}
		}
	}
	
	class ThreadEx6_2 extends Thread {
		public void run() {
			for(int i = 0; i < 300; i++) {
				System.out.print("|");
				for(int x = 0; x < 10000000; x++);
			}
		}
	}
