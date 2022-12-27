package condition_ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 걸은 수 , 몸무게
		System.out.print("걸은 수와 몸무게를 입력하세요:");
		int walk = scan.nextInt();
		int weight = scan.nextInt();
		
		//만약에 걸은 수가 10000보를 초과하면서 몸무게가 70키로 이하이면 "치킨"
		if (walk > 10000 && weight <= 70) { 
			System.out.println("둘 다 만족하니 치킨 먹자!!!");
		
		}
		
		// 만약에 걸은 수가 10000보를 초과하거나 몸무게가 70키로 이하이면 "치킨"
		if (walk > 10000 || weight <= 70) {
			System.out.println("하나라도 만족하니 치킨 먹자!!!");
		}
	}

}
