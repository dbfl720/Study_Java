package Chapter4;

public class Ex4_16 {

	public static void main(String[] args) {
		
		// i부터 계속 더해 나가서 몇까지 더하면 합이 100이 넘는지 알아내는 예제.
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;
			i++;
			sum += i;
		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
