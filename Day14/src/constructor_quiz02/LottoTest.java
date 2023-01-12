package constructor_quiz02;

public class LottoTest {

	public static void main(String[] args) {
		// 나의 의식
		  		
		// 로또 수동(비어있는 종이) 주세요!!
		// 직접 마킹
		
		Lotto lotto1 = new Lotto();
		lotto1.setNumber(1,2,3,4,5,6);
		lotto1.printLotto(); // Lotto 번호 출력하는 메소드 lotto에 만듬.
		
		
		// 로또 자동(6개의 수가 랜덤으로 적혀있음) 주세요!!
		Lotto lotto2 = new Lotto();
		lotto2.setNumber2();
		lotto2.printLotto();
		
		// 당첨 여부 (로또 체커)
		// 체커가 만들어지는 시점에 당첨 번호가 내부적으로 세팅된다. (체커는 한개만)
		LottoChecker checker = new LottoChecker();
		checker.getChecker();
		
		
		// 체커한테 수동 종이를 넘긴다. => 당첨 여부 알려줌
		// 체커한테 자동 종이를 넘긴다. => 당첨 여부 알려줌
		
		
		


	}

}
