package Thread_Ex;

public class ThreadImplements implements Runnable{

	private String resource;
	
	public ThreadImplements(String resource) {
		this.resource = resource;
	}
	
	
	@Override
	public void run() {
		// 여기서 구현하는 내용이 쓰레드에서 수행됨
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);	// 0.5초씩 쉬면서 찍는다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(resource);
		}
		
	}

}
