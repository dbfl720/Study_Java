package Method_ex;

public class Ex01 {

	public static void main(String[] args) {
		// method 사용하기
		
		// 반올림
		double d = 3.68;
		long roundNumber = Math.round(d);
		System.out.println(roundNumber);
		System.out.println(Math.round(d));

		
		// 큰 값
		int max = Math.max(10, 90);  // input : 10 , 90   // *주의 : 2개만 사용 가능
		System.out.println(max);	 // output : max
		System.out.println(Math.max(40,15));
		
		// 절대값 구하기   // 잘 안쓰임
		double abs = Math.abs(-4.56);
		System.out.println(abs);
		System.out.println(Math.abs(-9));
		
		// input 값: 전달 인자값, 인수, Argument
		// output 값: return 값, 결과
		
		
		
	}

}
