package Chapter9;

public class ex9_18 {

	public static void main(String[] args) {
		// StringBuffer의 비교
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
//		StringBuffer클래스는 equals메서드를 오버라이딩 하지 않아서 등가비교연산자(==)로 비교한 것과 같이 false가 나온다.
		System.out.println("sb == sb2 ?" + (sb == sb2));
		System.out.println("sb.equals(sb2) ?" + sb.equals(sb2));

		// StringBuffer의 내용을 String으로 변환한다.
		String s = sb.toString();  // String s = new String(sb);와 같다.
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2) );
	}

}
