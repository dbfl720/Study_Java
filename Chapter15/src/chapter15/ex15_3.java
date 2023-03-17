package chapter15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ex15_3 {

	public static void main(String[] args) {
		// InputStream과 OutputStream
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc); // 복사
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read()) != -1) // input.read()를 호출한 반환값을 변수 data에 저장. data에 저장된 값이 -1이 아닌지 비교.
			output.write(data);     // void write(int b)

	    outSrc = output.toByteArray(); // 스트림의 내용을 byte배열로 반환
	    
	    System.out.println("Input Source : " + Arrays.toString(inSrc));
	    System.out.println("Output Source : " + Arrays.toString(outSrc));
	}

}
