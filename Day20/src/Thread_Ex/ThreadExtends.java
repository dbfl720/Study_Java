
package Thread_Ex;

public class ThreadExtends extends Thread {
	private String resource;
	
	public ThreadExtends(String resource) {
		this.resource = resource;
		
	}
		
	
	@Override
	public void run() {
		 // 여기서 구현하는 내용이 쓰레드에서 수행됨
		for (int i = 0; i < 10; i++) {
			System.out.println(this.resource);
		}
	}
	}

