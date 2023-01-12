package constructor_quiz01;

public class OmrTest {

	public static void main(String[] args) {
		// 나의 의식
		
		// 비어있는 OmrCard 종이를 받는다
		OmrCard omrCard = new OmrCard();
		// OmrCard에 이름, 학번, 문제 마킹을 한다.
		omrCard.setName("신보람");
		omrCard.setStudentId(20001015);
		omrCard.setAnswer(1, 2, 3, 4, 5);
	//	System.out.println(omrCard.getName());  // getter 제공하기 때문에 출력 가능.
	//	System.out.println(omrCard.getStudentId());
		
		
		
		// OmrCardReader 리더기를 가져와서 OmrCard를 넣고 정답(점수를)을 확인한다.
		OmrCardReader reader = new OmrCardReader();
		reader.setCorrectAnswer(5, 4, 3, 2, 1);
		reader.printScore(omrCard);
	}

}
