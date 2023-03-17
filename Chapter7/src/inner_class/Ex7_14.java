package inner_class;

public class Ex7_14 {

	public static void main(String[] args) {
		// 내부 클래스의 제어자와 접근성
		private int outerIv = 0;
		static int outerCv = 0;
		
		class InstanceInner {
			int iiv outerIv;  // 외부 클래스의 private멤버도 접근 가능!!!
			int iiv2 = outerCv;
		}
		
		static class StaticInner {
			//스태택 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
			// int siv = outerIv;
			static int scv = outerCv;
		}
		
		void myMethod() {
			int lv = 0;
			final int LV = 0;
			
			class 
		}

	}

}
