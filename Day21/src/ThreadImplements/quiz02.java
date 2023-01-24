package ThreadImplements;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		// 시작, 그만
		
		Stopwatch stopwatch = new Stopwatch();
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시작을 쓰면 스톱워치가 수행되고, 그만을 쓰면 중단됩니다.");
		String writing = scan.next();
		
		if(writing.equals("시작")) {
			stopwatch.start();
			
		} else if (writing.equals("그만")){
			stopwatch.setStop(true);
	    System.out.println("걸린 시간 : " + stopwatch.getSeconds() + "초");
	     
		} else {
			System.out.println("잘못 입력하셨습니다.");
			
		}
		
		
	} // main
		
		
		
}
