package Chapter9;

		// toString()의 오버라이딩
	class Card2{
		String kind;
		int number;
		
		Card2() {
			this("SPADE", 1);  // Card(String kind, int number)를 호출
		}
		
		Card2(String kind, int number){
			this.kind = kind;
			this.number = number;
		}
		
		public String toString() {  // 오버라이딩
			return "kind : " + kind + ", number : " + number;  // Card2	인스턴스의 kind와 number를 문자열로 반환.
		}
	}
		
	
	
	
	
		public class Ex9_5 {
			
			public static void main(String[] args) {
				Card2 c1 = new Card2();
				Card2 c2 = new Card2("HEAER", 10);
				System.out.println(c1.toString());
				System.out.println(c2.toString());
	}

}
