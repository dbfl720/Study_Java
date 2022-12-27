package variable_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
//		#1
//		몫 : 105 나머지 : 3
		int number = 843;
		int number2 = 8;
		
		System.out.println("몫 : "+ number / number2 + "  나머지 : " + number % number2);

		
		
//		#2
//		x는 4이고, y는 6 입니다.
		int x = 6;
		int y = 4;
		int tmp;
		tmp = x;
		x= y ;
		y = tmp;
	
		
		System.out.println("x는 " + x + "이고, " + "y는 " + y + " 입니다.");
		
		
		
//		#3
//		7분 44초
		int seconds = 464;
		int minutes = 60;
		
		System.out.println(seconds / minutes + "분 " + seconds % minutes + "초");
		
		
//		#4
//		1
//		2
//		3
//		4
	
		int number5 = 1234;
		
		String number6 = String.valueOf(number5);  //기본형 -> 문자열 변환 String.valueof
		char[] charArr = number6.toCharArray();  // 문자열 -> char타입의 넣는 메소드.
		
		for(int i = 0; i < charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		
		
		
//		#4
//		Scanner scan = new Scanner(System.in);
//		System.out.println("입력: ");
//		int numBer = scan.nextInt();  //1234
//		
//		int q = numBer / 1000;  // 1 
//		int r = numBer % 1000;  //234 
//		System.out.println(q);  //1
//		
//		q = r / 100;  //2
//		r = r % 100;  //34
//		System.out.println(q);  //2
//		
//		q = r / 10; // 3
//		r = r % 10;  // 4
//		
//		System.out.println(q);  //3
//		System.out.println(r);  //4
//		
//		
		
		
		
		
//		#5
//		합계는 10 입니다.
		Scanner scan = new Scanner(System.in);
		System.out.print("한 자리수를 입력하세요: ");
		int a = scan.nextInt();
		System.out.print("한 자리수를 입력하세요: ");
		int b = scan.nextInt();
		System.out.print("한 자리수를 입력하세요: ");
		int c = scan.nextInt();
		System.out.print("한 자리수를 입력하세요: ");
		int d = scan.nextInt();
		
		int sum = a + b + c + d;
		System.out.println("합계는 " + sum + " 입니다.");
			
		
		
		//
		
		
		
		scan.close();
	}

}
