package class_ex01;


// 저장소.
// 설계도, 내가 만드는 새로운 자료
public class ScoreData {
	// 속성 : 멤버 변수(member variable), 필드(field)
	int score;
	String subject;
	int rank;
	
	
	
	// 행위 : 메소드(method)
	void printInfor() {
		System.out.println("과목명:  " + this.subject );  // 내 class 안에 있는 애들은 this를 붙인다. 나랑 같은 class 안에 있는 필드.
		System.out.println("점수: " + this.score);
		System.out.println("등수:" + this.rank);
		
	}
	
}
