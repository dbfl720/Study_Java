package class_ex01;

public class Ex01 {

	public static void main(String[] args) {
		// 나의 의식
		// 객체(object)로 만든다. 인스턴스(instance)
		ScoreData sd1 = new ScoreData();  // new를 써야 heap에 쌓임.
		
		// 필드에 값 세팅하기
		sd1.subject = "국어";
		sd1.score = 85;
		sd1.rank = 6;
		
		// 필드 값 출력하기
		System.out.println(sd1.subject);
		System.out.println(sd1.score);
		System.out.println(sd1.rank);
		
		sd1.printInfor();
		
		

	}

}
