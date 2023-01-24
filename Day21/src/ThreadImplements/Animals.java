package ThreadImplements;

public class Animals implements Runnable{

	private String tiger;
	
	public Animals (String tiger) { // 생성자.
		this.tiger = tiger;
	}
	
	
	
	
	
	// 쓰레드가 하는 일.
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(this.tiger);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
