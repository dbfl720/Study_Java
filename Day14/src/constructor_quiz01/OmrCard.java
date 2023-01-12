 package constructor_quiz01;

public class OmrCard {

	// 필드
	private String name;
	private int studentId;
	private int[] answer = new int[5]; // 학생이 입력한 정답
	
	
	// 메소드
	
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public void setAnswer(int a1, int a2, int a3, int a4, int a5) {
		this.answer[0] = a1;
		this.answer[1] = a2;
		this.answer[2] = a2;
		this.answer[3] = a3;
		this.answer[4] = a4;
	}
	
	
	// getter  - 리더기가 읽을 수 있도록  // 받기만 할꺼라서 리턴타입 없음.
	public String getName() {
		return name;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public int[] getAnswer() {
		return answer;
	}
}
