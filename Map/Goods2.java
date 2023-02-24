package Map;

public class Goods2 {
	private String name;
	private int price;
	private String state;
	
	public Goods2(String name, int price, String state) { // 생성자.
		this.name = name;
		this.price = price;
		this.state = state;
	}
	
	public String getName() { // getter 
		return name;
	}
	
	public int getPrice() { // getter
		return price;
	}
	
	public String getState() { // getter
		return state;
	}
	
	public void setPrice(int price) { // setter
		this.price = price;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public boolean equals(Object obj) {
		Goods2 goodsObj = (Goods2) obj;
		return this.getName().equals(goodsObj.getName());
	}
	
	@Override
	public String toString() {
		return "{물품명: " + this.name + ", 가격: " + this.price + ", 판매상태: " + this.state + "}";
	}
	
}
	
	
	

