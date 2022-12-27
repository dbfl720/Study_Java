package variable_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 입력하기
		// import 하는 법 : command +1, command + shift + o (권장)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("육개장 가격을 입력하세요:");
		int noodleCup = scan.nextInt();  //숫자를 입력받는다.
		System.out.println("육개장 가격은 " + noodleCup + "원");
		
		
		System.out.print("육개장의 개수를 입력하세요: ");
		int count = scan.nextInt();
		int sum = noodleCup * count;
		// 육개장 n개의 가격은 00원
		System.out.println("육개장 " + count + "개의 가격은 " + sum + "원");
		
		
		
		scan.close();
		
		
		
	}

}
