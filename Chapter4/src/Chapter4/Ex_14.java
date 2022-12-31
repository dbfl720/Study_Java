package Chapter4;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.print("숫자를 입력하세요: ");
		
		int num = scan.nextInt();
		int sum = 0;
		
		while(num != 0) {
			sum += num % 10;
			System.out.println("sum = " + sum + " num = " + num);
			
			num /= 10;
		}
		System.out.println("각 자리수의 합: " + sum);
	}

}
