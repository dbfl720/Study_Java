package two_d_array_quiz;

public class Quiz4 {

	public static void main(String[] args) {
		// 문자열 유용한 함수들의 활용
		
		 // 1.
//		문자열 변환
//		아래 문자열에서 A 를 B로 바꿔서 출력 하세요.
//		String gradeStr = "My grade is A";
//		gradeStr = gradeStr.replace("A", "B");
//		System.out.println(gradeStr);
//		
		
		// 2.
//		문자열 정수 변환
//		아래와 같이 생년월일이 저장된 String 이 있을때 올해 나이를 출력하세요. (한국나이)
//		String birth = "19950721";
//		
//		String i = birth.substring(0,4);
//
//		int year = Integer.valueOf(i);		
//		int age = 2023 - year + 1;
//		System.out.println(age + "세");
//		
	
		
		
		
		
		//3.
//		아래 문자열의 단어 개수를 출력 하세요.(중복 포함)
		String sentence = "To be, or Not to Be. That Is The Question";   
		String[] words = sentence.split("\\s+");
		System.out.println("단어 개수 : " + words.length);
		
//		String.split(regex)는 regex 패턴으로 문자열을 분리하여 배열로 리턴합니다.
//		\\s+는 1개 이상의 Whitespace를 의미합니다.

	}

}
