package map_quiz;

public class Goods {
	// 필드
	private String nameGoods;
	private int price;
	private String state;
	
	
	
	// setter
	public void setName(String name) {
		this.nameGoods = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	// 수정하는 메소드
	public void update (String price) {
		for (int i = 0; i < this.nameGoods.length(); i++) {
			
		}
	}
	
	
	
	
	
	
	//Getter
	public String getName() {
		return this.nameGoods;
		
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getState() {
		return this.state;
	}
	
	
	
	@Override
	public String toString() {
		return "물품명: " + this.nameGoods + ", 가격: " + this.price + ", 판매상태: " + this.state;
	}
	
} // class
