package Chapter9;

public class ex9_12 {

	public static void main(String[] args) {
		// StringBuffer의 생성자와 메서드 예제
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);
		sb.append('4').append(56); //  append 메서드는 입력된 값을 문자열로 반환해서 덧붙임. - 메서드 체이닝.
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(10)); // 10 인덱스 삭제.
		System.out.println("sb = " + sb.delete(3, 6)); // 3~5까지 삭제.
		System.out.println("sb = " + sb.insert(3, "abc")); // 3인덱스에 abc 넣기.
		System.out.println("sb = " + sb.replace(6, sb.length(), "END")); // sb.length() = 11. / 6,7,8,9,10을 end로 교체.
		
		System.out.println("capacity = " + sb.capacity()); // 버퍼크기 알려줌 - 배열의 총 길이.
		System.out.println("length = " + sb.length()); // 0~ 8 : 총 9개.
		
	}

}
