package constructor_ex01;

public class OmrCardReader {
	

	 // 필드
	 private String name;
	 private int classNumber;
	 private int[] testAnswer = new int[5];
	 
	 
	 

	 
	 
	 // 생성자
	 public OmrCardReader() {
		 
	 }
	 
	 
	 
	 
	 
	 // setter
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public void setClassNumber(int classNumber) {
		 this.classNumber = classNumber;
	 }
	 		
	 
	 // test 정답지
	 public void setTestAnswer(int t1, int t2, int t3, int t4, int t5) {
		 this.testAnswer[0] = 5;
		 this.testAnswer[1] = 4;
		 this.testAnswer[2] = 3;
		 this.testAnswer[3] = 2;
		 this.testAnswer[4] = 1;
		 
	 }
	 
	 
	 
	 
	 
	 // getter
	 public String getName() {
		 return this.name;
	 }
	 
	 public int getClassNumber() {
		 return this.classNumber;
	 }
	 
	 public int[] getAnswer() {
		 return this.testAnswer;
	 }
	 
	 
	
	 
	 
	 // 점수 출력 메소드
	 
	 
	 
	 
	 System.out.println("이름: " + ());
	 
	 
}


