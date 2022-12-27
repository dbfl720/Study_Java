package Chapter2;

public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');  //문자열 -> 문자 변환
		System.out.println('3' - '0' + 1);  // 문자 -> 숫자로 변환
		System.out.println(Integer.parseInt("3") + 1);  //문자열 -> 숫자
		System.out.println("3" + 1);  // 문자열과 합이기 때문에 1도 문자열로 바뀜
		System.out.println((char)(3 + '0'));   // 숫자를 문자로 변
	}

}
