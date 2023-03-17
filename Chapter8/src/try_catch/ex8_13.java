package try_catch;

public class ex8_13 {

	public static void main(String[] args) {
		// 연결된 예외(chained exception)
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main
	
	static void install() throws InstallException {
		try {
			startInstall();  // 프로그램 설치에 필요한 준비를 한다.
			copyFiles(); // 파일들을 복사한다.
		} catch (SpaceException2 e) {
			InstallException ie = new InstallException("설치 중 예외 발생.");
			ie. initCause(e); //  연결된 예외.
			throw ie; // 예외 되던지기.
		} catch (MemoryException2 me) {
			InstallException ie = new InstallException ("설치 중 예외발생.");
			ie.initCause(me);  // 연결된 예외.
			throw ie;  // 예외 되던지기.
		} finally {
			deleteTempFiles(); // 프로그램 설치에 사용된 임시파일들을 삭제한다.
		}
	}
	
	static void startInstall() throws SpaceException2, MemoryException2 {
		if (!enoughSapce() ) {
			throw new SpaceException2("설치할 공간이 부족합니다.");
		}
		
		if (!enoughMemory()) {
			throw new MemoryException2("메모리가 부족합니다.");
			// throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
		}
	} // startInstall
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSapce() {
		return false; 
	}
	static boolean enoughMemory() {
		return true;
	}

} // ExceptionTest 

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

class SpaceException2 extends Exception {
	SpaceException2(String msg) {
		super(msg);
	}
}

class MemoryException2 extends Exception {
	MemoryException2(String msg) {
		super(msg);
	}
}