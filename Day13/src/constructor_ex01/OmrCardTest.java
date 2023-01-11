package constructor_ex01;

public class OmrCardTest {

	public static void main(String[] args) {
		// 나의 의식
		// OMR 카드를 받는다.
		// OMR 카드에 이름 쓴다. 한번 슨다.
		// 문제를 푼다.
		
		
		
		// OmrCard 
		OmrCard omr = new OmrCard();
		
		omr.setName("신보람");
		omr.setClassNumber(20200302);
		omr.setAnswer(1, 2, 3, 4, 5);   // 학생 정답
		
		
		
		
		// OmrCardReader
		OmrCardReader ocr = new OmrCardReader(5,4,3,2,1);
		
		orc.get
		ocr.getAnswer();
	
	
	}

}
