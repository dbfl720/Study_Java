package Chapter9;

public class ex9_4 {

	public static void main(String[] args) {
		// Object클래스의 메서드 - hashCode()
		String str1 = new String("abc");
		String str2 = new String("abc");

		//String 클래스에는 Object 클래스로부터 equals() 메서드, hashCode메서드를 상속받아
		//문자열 내용을 비교하도록 이미 오버라이딩 되어 있다! 
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1)); // identityHashCde : 객체의 주소값으로 해시코드를 생성.
		System.out.println(System.identityHashCode(str2));
		

	}

}
