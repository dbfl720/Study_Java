package constructor_ex01;

public class Product {
	// 필드
	private String name;
	private int price;
	private String dateOfExpiration;
	
	
	// 메소드
	// 명확한 상품이기 때문에 생성자로 메소드 만든다.
	// * 보통 파라미터가 있는 생성자는 은닉화 되어있는 변수에 세팅을 하는 역할.  객체를 만들자 마자 값을 세팅하고 싶을때 사용.
	public Product(String name, int price, String dateOfExpiration) {
		this.name = name;
		this.price = price;
		this.dateOfExpiration = dateOfExpiration;
	}
	
	
	
	
	
	// getter : 내가 가지고 있는 것을 주는 것.  즉 필드를 외부에 주는 것. 
	public String getName() {
		return this.name;
	}
	
	
	public int getPrice() {
		return this.price;
	}
	
	public String getDateOfExpiration(){
		return this.dateOfExpiration;
	}
	
	
	
	// 제품 개수의 따른 가격 
	// input: int(개수)  output:int(가격)
	public int calculatetPrice(int count) {
		return getPrice() * count;
	}
	
	
	
	// 판매 가능 여부
	// input: x  output: String ???
	public String availableSale() {
		// 오늘 날짜 <= 유통기한 : 판매 가능,  오늘 날짜 > 유통기한 : 판매 불가
		// 오 "2023-01-23"   유"2023-01-10"
		
		
		
		// 1)
//		String[] expirationDate = this.dateOfExpiration.split("-");
//		int year = Integer.valueOf(expirationDate[0]);// 숫자변환
//		int month = Integer.parseInt(expirationDate[1]);
//		int day = Integer.parseInt(expirationDate[2]);
//		
//		// 이곳에 하나라도 걸리면 "판매 가능 상품"
//		if (year > 2023) {  // 유통기한 년도 높으면 월, 일 안봐도 됨
//			return "판매 가능 상품";
//		} else if (year ==  2023) { // 년도 같으면 월 봐야함
//			if (month > 1) {  // 유통기한 월이 높으면 일 안봐도 됨
//				return "판매 가능 상품";
//			} else if (month == 1) {
//				if (day >= 10) {
//					return "판매 가능 상품";
//				}
//			}
//		}
//		
//		return "판매 불가 상품";
//	}
	
		
		
		
		
	
		
	
	// 2. index 번호를 비교해서 문제 풀기 , 간단한 방법 String끼리 비교
	   // compareTo  
	   // A(유통기한)- 기준 문자열   B(오늘날짜)-비교대상
	   // 기준 문자열이 크면 1
	   // 같으면 0
	   // 기준 문자열이 작으면 -1 
		// 자바 스트링끼리 크기 비교 검색 !
		if (this.dateOfExpiration.compareTo("2023-01-10") >= 0) { //  판매 가능
			return "판매 가능 상품";
			
		}
			return "판매 불가 상품";
		}
		
	
	
	
	
	
} // 클래스
