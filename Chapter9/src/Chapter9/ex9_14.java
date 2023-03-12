package Chapter9;

public class ex9_14 {

	public static void main(String[] args) {
		// 래퍼클래스 예제
		Integer i = new Integer(100);
		Integer i2 = 100;
		
		System.out.println("i == i2 ?" + (i == i2));
		System.out.println("i.equals(i2)" + i.equals(i2));
		System.out.println("i.compareTo(i2)" + i. compareTo(i2));
		System.out.println("i.toString() = " + i.toString());
		
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIXE = " + Integer.SIZE  + " bits");
		System.out.println("BYTES = " + Integer.BYTES + "bytes");
		System.out.println("TYPE = " + Integer.TYPE);

	}

}
