package loop_ex;

public class Ex02 {

	public static void main(String[] args) {
		// do-while문 : 조건이 거짓이어도 한번은 수행한다. 참일 때는 동일. 실무에서 잘 사용 안함.
		int i = 0;
		do {
			System.out.println("두와일문 " + i);
			i++;
		} while (i  < -3);   // 0 1 2 => 3

		
			// while문
			// 0 ~ 4 => 5번
			i = 0;
			while (i < 5) {
				System.out.println("와일문 " + i);
				i++;
			}
			
			
			//for (초기식; 조건; 증감식) {}
			for (int j = 0; j < 5; j++) {
				System.out.println("포문 " + j);
			}
			
			// 1~ 5 => 5번
			for (int j = 1; j <= 5; j++) {
				System.out.println("컴퓨터 " + j);
			}
			
			
			// 5 ~ 1 => 5번  5 4 3 2 1
			for (int j = 5; j >= 1; j--) {
				System.out.println("모니터 " + j);
			}
			
			
			// 1 + 2 + 3 +... +10
			int sum = 0;
			for (int j = 1; j <= 10; j += 2) {  // 1 3 5 7 9
				//sum = sum + j;
				sum += j;
			}
			System.out.println(sum);
	}

}
