
public class ex13_12 {

	public static void main(String[] args) {
		// synchronized를 이용한 동기화 
		Runnable r = new RunnableEx12();
		new Thread(r).start();  // ThreadGroup에 의해 참조되므로 gc대상이 아니다? 
		new Thread(r).start();  // ThreadGroup에 의해 참조되므로 gc대상이 아니다? 

	}

}

class Account {
	private int balance = 1000;
	
	public int getBalance() { // 읽을때도 synchronized를 붙여야 음수 결과 안나온다.
		return balance;
	}
	
	public void withdraw(int money) { // synchronized를 붙이면 한 쓰레드가 자물쇠를 갖고 있는 것이기 때문에 '음수'의 결과가 안 나온다.
		if(balance >= money) {
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {}
			balance -= money;
			}
		}
	}

class RunnableEx12 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300 중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance: " + acc.getBalance());		
		}
	}
}
