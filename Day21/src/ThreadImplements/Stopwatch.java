package ThreadImplements;

class Stopwatch extends Thread {
	//초
	
    private boolean stop; // stop flag
    private int seconds;
  



     // 쓰레드가 하는 일
    @Override
    public void run() {
    
        while (!stop) {            	
       	this.seconds++;
       	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      
        }
    }

    
    
    
    public void setStop(boolean stop) {
        this.stop = stop;       
        System.out.println("그만");
    }
    
    public int getSeconds() {
    	return  this.seconds;
    	
    }
}