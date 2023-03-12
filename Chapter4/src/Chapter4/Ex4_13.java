package Chapter4;

public class Ex4_13 {

	public static void main(String[] args) {
		
		// 1~ 몇까지 더해야 100을 넘지 않는지 알아내는 예제이다.
		int sum = 0;
		int i = 0;
		
		while (sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}

	}

}
