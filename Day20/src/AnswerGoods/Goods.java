package AnswerGoods;

//자식클래스..? 
//필드와 게터/세터만 있어야 하고(데이터만 담음)

public class Goods {
	private String name;
	private int price;
	private String state;
	
	// 생성자  // 필드에 값을 넣는 방법.
	public Goods(String name, int price, String state) {
		this.name = name;
		this.price = price;
		this.state = state;
	}

	
	
	// Getter, Setter  : 캡슐화(encapsulation) - 외부에서는 캡슐화를 통해 필드에 접근한다.
	
	
	
	//Getter // 필드 꺼내는 방법 1. 
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getState() {
		return state;
	}
	
	
	// Setter // 필드에 값을 넣는 방법.
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	// 일반 메소드를 이용해서 필드 꺼내는 방법 2. 
	@Override  // 상속을 한게 아닌데.. 어떻게 Override?????
	public boolean equals(Object obj) {	//output: boolean    input: Object obj
		Goods goodsObj = (Goods) obj;  // ?? 이 문법은 뭐지..?????
		return this.getName().equals(goodsObj.getName());
	}
	
	
	// Iterator<Goods> iter = this.goodsList.iterator(); 
			// while (iter.hasNext()) {
			// 		Goods savedGoods = iter.next(); 
			//		if (savedGoods.getName().equals(goods.getName())) {
			//			System.out.println("등록된 상품이 존재합니다."); 
			//			return; 
			// 		}
			// } 

	
	@Override
	public String toString() {
		// {물품명:oo, 가격:oo, 판매상태:예약중}
		return "{물품명:" + this.name + ", 가격:" + this.price + ", 판매상태:" + this.state + "}";
	}
}
