package constructor_quiz01;

public class OmrCardReader {
	// 필드
	private int[] correctAnswer = new int[5];   // 답안지
	
	
		
	// 메소드
	
	// 생성자 -> 다른 과목 채점을 위해(확장성/재활용성을 위해)
	public void setCorrectAnswer(int ca1, int ca2, int ca3, int ca4, int ca5) {
		this.correctAnswer[0] = ca1;
		this.correctAnswer[1] = ca2;
		this.correctAnswer[2] = ca3;
		this.correctAnswer[3] = ca4;
		this.correctAnswer[4] = ca5;
		
	}
	
	
	// 채점 하는 메소드     // 자료형 - OmrCard 객체 자체를 넘겨 받을 수 있다.
	public void printScore(OmrCard omrCard) {
		// 이름, 학번, 문제 답
		System.out.println(omrCard.getName());
		System.out.println(omrCard.getStudentId());
		
		int score = 0;
		for (int i = 0; i < correctAnswer.length; i++)  // 0 ~ 4
			if (correctAnswer[i] == omrCard.getAnswer()[i]) {  // correctAnswer과 getAnswer이 둘다 int 타입이기 때문에 ==로 표시 가능. // 메모리에 쌓이는게 값 비교 이기 때문에.
				score += 100 / correctAnswer.length;
			}
		System.out.println("점수:" + score);
	}
}
