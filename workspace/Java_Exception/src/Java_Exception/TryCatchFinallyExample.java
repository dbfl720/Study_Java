package Java_Exception;

public class TryCatchFinallyExample {
	String[] strArray = {"10", "2a"};
	int value = 0;
	for(int i = 0; i<=2; i++) {
		try {
			value = Integer.parseInt(strArray[i]); 
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했");
		} catch(NumberformatException e) {
			System.out.println("숫자로 ㅂ면환할 수 없음");
		}finally {
			System.out.println(value);
		}
	}
	

}
