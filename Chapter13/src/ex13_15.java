import java.util.ArrayList;

class Customer2 implements Runnable {
	private Table2 table;
	private String food;
	
	Customer2(Table2 table, String food) {
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			try { Thread.sleep(10);} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a" + food);
			
		} // while
	}
	
		
		
} // Customer



class Cook2 implements Runnable {
	private Table2 table;
	Cook2(Table2 table) {this.table = table;	}
	
	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(10);} catch(InterruptedException e) {}
		} // while
	}
	
} // Cook




class Table2 {
	String[] dishNames = {"donut", "donut", "burger"};
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();
	
	
	public synchronized void add(String dish) {  // synchronized 추가
		if(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting.");
			try {
				wait(); // COOK쓰레드를 기다린다.
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		dishes.add(dish);
		notify();  // 기다리고 있는 CUST를 깨우기 위함.
		System.out.println("Dishes: " + dishes.toString());
	}
	
	
	
	public boolean remove(String dishName) {
		synchronized(this) {
			String name = Thread.currentThread().getName();
			while(dishes.size() == 0) {  // 0.5초마다 음식이 추가되었는지 확인한다.
				System.out.println(name + "is waiting.");
				try {
					wait();  // CUST쓰레드를 기다리게 한다.
					Thread.sleep(500);
					} catch(InterruptedException e) {}
			}
			
			while(true) {
				for(int i =0; i < dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);  // 음식 소비
						notify(); // 잠자고 있는 COOK깨우기 위함 -> 요리사에게 통보
						return true;				
					}
				}
			
				try {
					System.out.println(name + " is waiting.");
					wait(); // 원하는 음식이 없는 CUST쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch(InterruptedException e) {}
			}
			
		} // synchronized
			
	}
	
	

	public int dishNum() {
		return dishNames.length;
	}
	
	
}







public class ex13_15 {
	public static void main(String[] args) throws Exception {
		// wait()과 notify()
		Table2 table = new Table2();  // 여러 쓰레드가 공유하는 객체
		new Thread(new Cook2(table), "COOK"). start();
		new Thread(new Customer2(table, "donut"), "CUST1").start();
		new Thread(new Customer2(table, "burger"), "CUST2").start();
		
		Thread.sleep(2000);
		System.exit(0);
	}

}
