
public class ex13_7 implements Runnable{
	static boolean autoSave = false;

	public static void main(String[] args) {
		// 데몬 쓰레드(daemon thread)
	
		Thread t = new Thread(new ex13_7());
		t.setDaemon(true);  // 이부분이 없으면 종료되지 않는다.
		t.start();
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {}
			System.out.println(i);
			
			if(i == 5) autoSave = true;
		}
		System.out.println("프로그램을 종료합니다.");
		
	}
		public void run() {
			while(true) {
				try {
					Thread.sleep(3 * 1000);  // 3초마
				} catch (InterruptedException e) {}
				
				// autoSave의 값이 true이면 autoSave()를 호출한다.
				if (autoSave) autoSave();
			}
		}
		
		public void autoSave() {
			System.out.println("작업파일이 자동저장 되었습니다.");
		}

	}


