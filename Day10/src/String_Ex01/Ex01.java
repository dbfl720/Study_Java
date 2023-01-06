package String_Ex01;

public class Ex01 {

	public static void main(String[] args) {
		// String 변수에 값 저장하기
		String a = "안녕하세요";
		String b = new String("안녕하세요"); // 객체
		String c = new String("안녕하세요");  // 메모리에 계속 새로 할당
		String d = "안녕하세요";   // "" - > constant pool에 저장된다.
		
		
		
		System.out.println(a);
		System.out.println(b);
		
		// String끼리 값 비교하기
		System.out.println(a == d);  // true
		System.out.println(d == c);  // false  주소가 같은지 비
		System.out.println(a == b);  // false
		
		
		
	//	기본 자료형(primitive type): int, double,long.class char (primitive type)
    //  참조 자료형(Reference type): 배열, new... 
	
		
		
		// String 비교이면 equals 메소드를 써야 한다!!!! 
		System.out.println(b.equals(c));  //  값 비교 0 , 주소 비교 x
				
	}

}




