package constructor_quiz02;

import java.util.Random;

public class LottoChecker {
//	1부터 45까지의 6개 수를 랜덤으로 당첨번호를 만든다.
//	로또를 입력 받아서 해당 클래스를 통해 당첨여부를 확인한다.
//
//	6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지: 꽝
	
	
	// 필드
	private int[] winningNumber = new int[6];
	
	
	
	
	
	// 생성자 
	// 로또 번호 6개 출력
	public LottoChecker() {
		Random rand = new Random();
		
		// Todo 중복확인! 코드 작성  / 2중 루프
		for (int i = 0; i < this.winningNumber.length; i++) {	
			int randNum = rand.nextInt(45) + 1;
			for (int j = 0; j < this.winningNumber.length; j++) {
				if (winningNumber[i] == winningNumber[j]) {
				
					break;
				}			
			}
			}
	}
	
	
	
		
		
		
	// 당첨 확인하는 메소드
	public String check(Lotto lotto) {  // 등수를 말해줘야 해서 String으로 함.  // 당첨번호와 나의 로또를 비교 해야되서 . Lotto 카드를 통째로 받아온다.
		// 몇 개가 맞았는지 2중 루프 - 순서가 뒤죽박죽이기 때문  
		   int[] numbers = lotto.getNumber();
		   int count = 0;
		   for (int i = 0; i < this.winningNumber.length; i++) {   // 당첨 번호
			   int pointNumber = this.winningNumber[i];
			   
			   for (int j = 0; j < numbers.length; j++) {          // 뽑은 번호 
				   if(pointNumber == numbers[j]) {
					   count++;
					   break;
				   }
			   }
		   }
			   
			if (count == 6) {
				return "1등";			
			} else if (count == 5) {
				return "2등";
			} else if (count == 4) {
				return "3등";
			} else if (count == 3) {
				return "4등";
			} else {
				return "꽝";
			}
			
		}
	
	
	
	// getter
	public int[] getChecker() {
		return this.winningNumber;
	}
	
	
}
