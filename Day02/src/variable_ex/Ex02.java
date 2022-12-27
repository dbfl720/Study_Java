package variable_ex;

public class Ex02 {

	public static void main(String[] args) {
		// 자료형(Data type) 변환 => Casting
		double pi = 3.14;
		int intpi = (int)pi;   //강제 변환
		System.out.println(intpi);  // double -> int : 소수점 뒷자리 버림처리
		System.out.println((double)intpi);  // int -> double : .0이 붙는다.
		
		
		int number = 7;
		double result = number / 2;  // 정수 나누기 정수 = 정수   // 오른쪽 부터 계산이여서 3이였고 
		// double 이여서 .0이 붙
		//예상값 3.5 /    int / int => int  3.0
		System.out.println(result);
		
		
		//해결법
		// 1. 캐스팅 문법
		result = (double)number / 2;  //   7.0 / 2 = double   /  한쪽은 반드시 더블이 있어야 함
		System.out.println(result);
		
		// 2. 실수로 나눈다.
		result = number / 2.0;  
		System.out.println(result);
		
		
		// 반올림 하는 법
		//Math.round(실수값)    3.5 => 4       3.2 => 3
		System.out.println( Math.round(3.488234556778));
		
		// 둘째자리까지 반올림하기
		pi = 3.141592653;
		
		// 1. pi에 100을 곱해서 314.1592653으로 만든다.
		// 2. Math.round에 1번에서 구한 값을 넣고 정수로 만든다.   => 314
		// 3. 3.14로 만들기 위해 100.0을 나누어준다.   (나누기가 있을 때는 한쪽을 double 만들어 줘야됨)
		
		System.out.println(Math.round(pi* 100) / 100.0);
		
		
		double pi2 = 3.147655;
		System.out.println(Math.round(pi2 * 100) / 100.0);
		
		
	}

}
