package Chapter3;

public class Ex3_10 {

	public static void main(String[] args) {
		// 산술 변환 (3)
		
		long a = 1_000_000 * 1_000_000;		// 오버플로우 발생.
		long b = 1_000_000 * 1_000_000L;   // long타입으로 자동 형변환해서 오버플로우 발생 안함.
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
