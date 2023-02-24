package List;

public class Goods {
	// 필드, getter, setter (데이터만 담음)
	// Goods 객체: 물품명, 가격, 판매상태(판매중, 판매완료, 예약중)
	
	private String name;
	private int price;
	private String state;
	
	public Goods(String name, int price, String state) { // 생성자
		this.name = name;
		this.price = price;
		this.state = state;
	}
	
	
	public String getName() { // getter
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getState() {
		return state;
	}
	
	
	public void setPrice(int price) { // setter
		this.price = price;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Goods goodsObj = (Goods) obj;  // 형변환
//		return this.getName().equals(goodsObj.getName());
//	}
	
	@Override
	public String toString() {
		// 물품명 : 00, 가격:00, 판매상태:예약중
		return "{물품명:" + this.name + ", 가격:" + this.price + ", 판매상태:" + this.state + "}";
	}
	
}
