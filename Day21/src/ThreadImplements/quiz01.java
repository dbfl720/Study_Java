package ThreadImplements;

public class quiz01 {

	public static void main(String[] args) throws InterruptedException  {
		
		
		
		Animals a = new Animals ("어흥");
		Animals b = new Animals("음메~");
		Animals c = new Animals("히잉");
		
		
		// 쓰레드 객체 만들기
		Thread e = new Thread(a);
		Thread f = new Thread(b);
		Thread g = new Thread(c);
		
	
		// Multi Thread
		e.start(); 
		f.start();
		e.join();
		f.join();
		
		g.start();
	

	}

}
