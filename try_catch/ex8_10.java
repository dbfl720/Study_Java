package try_catch;

import java.io.File;

public class ex8_10 {

	public static void main(String[] args) {
		// 메서드에 예외 선언하기 2
		try {
			File f = createFile("test2.text");
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {  // try - catch로 예외 처리.
			System.out.println(e.getMessage() + "다시 입력해주시기 바랍니다.");
		}

	} // main
	
	static File createFile(String fileName) throws Exception { // 예외 떠넘기기.
		if (fileName == null || fileName.equals(""))
			throw new Exception("파일이름이 유효하지 않습다."); // 예외발생.
		File f = new File(fileName); // File 클래스의 객체를 만든다.
		// File객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
		f.createNewFile();
		return f; // 생성된 객체의 참조를 반환.
	}

}
