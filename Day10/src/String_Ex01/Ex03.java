package String_Ex01;

public class Ex03 {

	public static void main(String[] args) {
		String s1 = "eclipse";
		
		// charAt: n번째 index에 무슨 문자가 있는지 확인
		char a = s1.charAt(4);
		System.out.println("charAt: " + a);

		
		// contains: 특정 문자열이 문자열 안에 포함되어 있는지 확인
		System.out.println("contains:" + s1.contains("lip"));
		
		
		// startsWith: 특정 문자열로 시작하는지 확인
		System.out.println("startsWith:" + s1.startsWith("ecl"));
		
		
		// endsWith: 특정 문자열로 끝나는지 확인
		System.out.println("endsWith:" + s1.endsWith("e"));
		
		// length: 알파벳의 개수, 문장열의 길이
		System.out.println("length:" + s1.length());
		
		// replace: 포함된 문자열 부분을 교체(치환)
		String s2 = "내가 먹고 싶은 것은 치킨이다. ";
		s2 = s2.replace("치킨", "족발"); // 꼭 다시 저장해야 된다.
		System.out.println(s2);
		
		// split: 특정 문자열을 기준으로 잘라서 배열에 넣는다.		// 유용한 메소드.
		String s3 = "apple,melon,grape";
		String[] fruits = s3.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
			
//			
		// substring: 문자열을 자른다.(일부 추출)
			String s4 = "javastudy";
			System.out.println("substring:" + s4.substring(4));    // study - 4 index 시작~ 
			
			// 시작인덱스 : 시작하고 싶은 index
			// 끝 인덱스: 우너하는 인덱스 + 1 
			System.out.println( "substring param2:" + s4.substring(0,4));
		}
	}

}
