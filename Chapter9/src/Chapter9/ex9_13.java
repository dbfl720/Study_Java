package Chapter9;

import static java.lang.Math.*;

public class ex9_13 {

	public static void main(String[] args) {
		// Math의 메서드
		double val = 90.7552;
		System.out.println("round("+ val + ") = "+ round(val));  // 반올림
		
		val *= 100; // 9075.52
		System.out.println("round(" + val + ") = " + round(val)); // 반올림
		
		System.out.println("round(" + val + ")/100 = " + round(val)/100); // 반올림
		System.out.println("round(" + val + ")/100.0 = " + round(val)/100.0);  // 반올림
		System.out.println();
		
		System.out.println("ceil(1.1) = " + ceil(1.1) );  // 올림
		System.out.println("floor(1.5) = " + floor(1.5) );  // 버림
		System.out.println("round(1.1) = " + round(1.1) );  // 반올림, 소수점 첫째자리에서 반올림한 정수값을 반환(int).
		System.out.println("round(1.5) = " + round(1.5) );  // 반올림
		System.out.println("rint(1.5) = " + rint(1.5) );  // 반올림
		System.out.println("round(-1.5) = " + round(-1.5) );  // 반올림
		System.out.println("rint(-1.5) = " + rint(-1.5) );  // 반올림, 주어진 double값과 가장 가까운 정수값을 double형으로 반환. 두 정수의 정가운데 있는 값은 짝수 정수를 결과로 반환.
		System.out.println("ceil(-1.5) = " + ceil(-1.5) );  // 올림
		System.out.println("floor(-1.1) = " + floor(-1.1) );  // 버림
	}

}
