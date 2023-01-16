package wrapper_class_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 기본자료형 (Primitive type)
		int n1 = 5; 
		System.out.println(n1);
	
		// 래퍼클래스(Wrapper class)
		Integer n2 = 5;
		System.out.println(n2);
		
		// 래퍼클래스 객체를 만들어 값 저장하기
		Integer n3 = new Integer(5); // deprecated 없어질 거다. 없어도 쓸 수 있다. // 메모리가 낭비되서 new 하지 말라는 것임.
		System.out.println(n3);
		
		Integer n4 = 5;
		
		// 한쪽이 기본자료형이면 값 비교를 한다.
		System.out.println(n1 == n2);  // == 는 stack의 값 비교임. // true
		System.out.println(n1 == n3);  // 한쪽이 기본자료형이면 무조건 값 비교로 됨. // ture
		System.out.println(n2 == n3);  // 참조형 자료형은 주소를 비교하는 것이라서 같지 않음. new는 새로운 메모. // false
		System.out.println(n2 == n4);  // true // new가 없어서  constant pool에 쌓임. // 주소 비교임. 값 비교 아님. 
		System.out.println(n2.equals(n3)); // true // 값 비교
	}

}
