package PracticeGoods;



	// 필드와 게터/세터만 있음. (데이터를 담기)
	
public class Goods {
	private String name;
	private int price;
	private String state;
	
	// 생성자
	public Goods(String name, int price, String state) {
		this.name = name;
		this.price = price;
		this.state = state;
	}
	
	
	// Getter	  : 읽기
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getState() {
		return state;
	}
	
	
	//Setter 
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	

	
	@Override
	public boolean equals(Object obj) {
		Goods goodsObj = (Goods) obj;
		return this.getName().equals(goodsObj.getName());
		
	}
	
	
	@Override
	public String toString() {
		return "{물품명:" + this.name + ", 가격:" + this.price + "판매상태 " + this.state + "}";
	}


}  // class
