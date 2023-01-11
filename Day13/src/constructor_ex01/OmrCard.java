package constructor_ex01;

public class OmrCard {
//	 OmrCard 클래스
//	 ＊문제는 객관식으로 문제 개수는 총 5개이다.(답은 1~5중에 하나만 선택 가능)
//	 ＊학번과 이름을 입력 받는다.
//	 ＊순서대로 학생의 답 5개를 입력받는 메소드를 만든다.
	
	
	
	 // 필드
	 private String name;
	 private int classNumber;
	 private int[] answer = new int[5];
	 
	 
	 
	 // 생성자
	 public OmrCard() {
		 
	 }
	 
	 
	 
	 // setter
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public void setClassNumber(int classNumber) {
		 this.classNumber = classNumber;
	 }
	 
	 // 학생의 답 
	 public void setAnswer(int a1, int a2, int a3, int a4, int a5) {
		 this.answer[0] = a1;
		 this.answer[1] = a2;
		 this.answer[2] = a3;
		 this.answer[3] = a4;
		 this.answer[4] = a5;
		 
	 }
	 
	 
	 
	 
	 
	 // getter
	 public String getName() {
		 return this.name;
	 }
	 
	 public int getClassNumber() {
		 return this.classNumber;
	 }
	 
	 public int[] getAnswer() {
		 return this.answer;
	 }
	 
	 
	
}
