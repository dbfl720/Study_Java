package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		//한 줄 주석 
		//한 줄 주석 - 코드로 해석되지 않는다.
		/*
		 * 
		 * 여러줄 주석, 여러줄 넣을 수 있다.
		 */
	
		// 변수에 값을 넣는다. 할당한다. assign. 대입한다.
		
		// 정수형 변수 (Integer)
		int number = 10; // 변수에 처음 값을 넣는 것 : '초기화'
		System.out.println(number);
		
		number = 5;  //변수이므로 값을 변경할 수 있다. 재사용할 때는 자료형(Data type)을 쓰지 않는다. 
		System.out.println(number);
		
		int number2 = 100;
		int sum = number + number2;
		System.out.println(sum);
		
		//실수형 변수 (Float) : 권장 안함, 오차가 있을 수 있다.
		float f = 1.5555555f;
		System.out.println(f);
		
		//실수형 변수 (double)  : 권장함
		double d = 3.8;
		System.out.println(d);
		System.out.println(d * number2);
	
		//문자 변수 (character) : 문자 한개. 작은 따옴표로 감싼다.
		char c = 'z';
		System.out.println(c);
		
		// boolean 변수: 참(true) 또는 거짓(false)
		boolean isReal = true;
		boolean isFalse = false;
		System.out.println("참이다. " + isReal + "\n");
		System.out.println("거짓이다. " + isFalse);
		System.out.println();  //줄바 
		System.out.println("test");
		
	}

}
