package Map;


// 필드, getter, setter (데이터만 담음)
public class Goods {
	// 필드
	private String name;
	private int price;
	private String state;
	
	
	//  생성자
	public Goods(String name, int price, String state) {
		this.name = name;
		this.price = price;
		this.state = state;
	}
	
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getState() {
		return state;
	}
	
	
	// setter
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void setState(String state) {
		this.state = state;
	}
	
	
	// 오버라이드
	@Override  
	public boolean equals(Object obj) {  //equals()의 오버라이딩을 하는 이유 : 원래 equals()는 두 참조변수가 주소값이 같은지를 판단하는 기능만 가능. 그래서, value값을 비교하기 위해서는 오버라이딩하여, 주소가 아닌 객체에 저장된 내용을 비교하도록 변경.
		Goods goodsObj = (Goods) obj;  // Goods 으로 형변환
		return this.getName().equals(goodsObj.getName());
	}
	
	@Override
	public String toString() {
		return "물품명 : " +  this.name + ", 가격 : " + this.price + ", 판매상태 : " + this.state + "}";
	}
	
	
}
