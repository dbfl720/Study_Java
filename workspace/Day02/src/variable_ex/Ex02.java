package variable_ex;

public class Ex02 {
	public static void main(String[] args) {
		
		//자료형 (data type) 변환 => casting
		double pi = 3.14;
		int intpi = (int)pi;  //double -> int 변환 : 소수점 뒷자리 버
		System.out.println(intpi);
		
		//int -> double : .0이 붙는다.
	System.out.println((double)intpi);
		
	int number = 7;
	double result = number / 2;  //예상값 3.5,  결과:3.0
	System.out.println(result);  //int / int -> int
	
	// 나누기를 할 때 한쪽 항을 반드시 double로 바꾸어야 한다.
	
	// 1. 둘 중 하나의 값을 실수로 형변환(casting)을 한다.
	result = (double)number / 2;  //(double)number / 2;
	System.out.println(result);
	
	//2. 실수로 나누다.
	result = number / 2.0;
	System.out.println(result);
	
	//반올림 하는 법
	// Math.round(실수)  => 3.14 = 3 , 3.8 = 4 //무조건 첫째 자리 수에서 반올림을 함.
	pi = 3.149592643;
	System.out.println(Math.round(pi));
	
	//둘째자리까지 반올림 해서 나타내는 방법
	//1. pi에 100을 곱해서 314.1592653을 만든다.
	//2. 소수점 첫째자리에서 반올림해서 정수를 만든다. (round) => 314
	//3. 3.14로 만들기 위해 314 / 100.0 나누어준다.
	System.out.println(Math.round(pi * 100) / (double)100);
	
	}
}
