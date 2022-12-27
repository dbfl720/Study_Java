package variable_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 몫, 나머지
//		System.out.print("입력1:");
//		int number1 = scan.nextInt();
//		System.out.print("입력2:");
//		int number2 = scan.nextInt();
//		
//		
//		int quotient = number1 / number2;
//		int remainder = number1 % number2;
//		System.out.println("몫: " + quotient + ", 나머지: "  + remainder);
//		
		
		// 2. 
		System.out.print("x:");
		int x = scan.nextInt();  //6
		System.out.print("y:");
		int y = scan.nextInt();  //4
		
		
		
		// swap 알고리즘
		int temp = x;
		x = y;
		y = temp;
		
		
		System.out.println("x는 " + x + " y는" +y);
		
		scan.close();

	}

}
