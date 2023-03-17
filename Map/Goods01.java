package Map;

public class Goods01 {
	private String name;
	private int price;
	private String state;
	
	// 생성자
	public Goods01(String name, int price, String state) {
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
	
	
	
	@Override
	public boolean equals(Object obj) {
		Goods01 goodsObj = (Goods01) obj;
		return this.getName().equals(goodsObj.getName());
	}
	
	
	@Override
	public String toString() {
		return "{물품명:" + this.name + ", 가격:" + this.price + ", 판매상태:" + this.state + "}";
	}
	
}
