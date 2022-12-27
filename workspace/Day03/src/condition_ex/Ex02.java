package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 개의 수를 입력하세요:"); // 3 5
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.println(number1 + "," + number2);
		
		
		// number1이 number2보다 크다
		if (number1 > number2) {
			System.out.println("number1이 number2보다 크다");
		}
		
		
		// number1이 number2보다 작다
		if (number1 < number2) { 
			System.out.println("number1이 number2보다 작다");
		}
		
		// number1과 number2는 같다
		if (number1 == number2) {
			System.out.println("number1과 number2는 같다");
			
		}
		
		// number1과 number2는 다르다
		if (number1 != number2) { 
			System.out.println("number1과 number2는 다르다");
		}
	}

}
