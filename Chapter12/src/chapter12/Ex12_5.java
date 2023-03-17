package chapter12;

enum Direction { EAST, SOUTH, WEST, NORTH }

public class Ex12_5 {
	public static void main(String[] args) {
	Direction d1 = Direction.EAST;
	Direction d2 = Direction.valueOf("WEST"); // 값 얻어오기
	Direction d3 = Enum.valueOf(Direction.class, "EAST");  // Enum은 모든 열거형의 최고 조상.
	
	System.out.println("d1 = " + d1);
	System.out.println("d2 = " + d2);
	System.out.println("d3 = " + d3);
	
	System.out.println("d1 == d2 " + (d1 == d2));
	System.out.println("d1 == d3 " + (d1 == d3));
	System.out.println("d1.equals(d3) " + (d1.equals(d3)));
	// System.out.println("d1 > d2 " + (d1 > d2));  // 에러. 비교연산자 사용 불가.
	System.out.println("d1.compareTo(d3) " + (d1.compareTo(d3)));
	System.out.println("d1.compareTo(d2) " + (d1.compareTo(d2)));
	
	
	
	Direction[] dArr = Direction.values();  // 모든 상수 출력
	for(Direction d : dArr)
		System.out.printf("%s=%d%n", d.name(), d.ordinal());
	
	
		// 열거형 예제
		

	} // main
	

}
