package String_Ex01;

public class Ex02 {

	public static void main(String[] args) {
		// 자료형 변환
		
		
		// 1. 숫자 -> 문자열     3 -> "3"
		int number = 3;
		String str1 = number + "";		// 숫자 + 문자열 = 문자열
		System.out.println(str1);
		

		// 정석 방법
		String str2 = String.valueOf(number);   	// int to string java (인터넷 검색 방법) 스택오버플로워에 정확한 자료가 많음
		System.out.println(str2);
		
		
		// 2. 문자열 -> 숫자, "5" => 5
		String str3 = "5";
		int number2 = Integer.valueOf(str3);  // 숫자가 나온다.
		number2 = Integer.parseInt(str3);		// 숫자가 나온다.
		System.out.println(number2);
		
		
			
	}

}
