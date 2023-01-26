package polymorphism;

// 여러 종류의 객체를 배열로 다루기 예제
public class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2(){  // 기본 생성자
		
		
	}
}

	class Tv2 extends Product2 {
		Tv2() {
			super(100); // 조상클래스의 생성자 Product2(int price)를 호출한다.
		}
		public String toString() {
			return "Tv";
		}
	}
	
	
	class Computer2 extends Product2{
		Computer2() {
			super(200);
		}
		public String toString() {
			return "Computer";
		}
		
	}
	
	class Audio2 extends Product2 {
		Audio2() {
			super(50);
		}
		public String toString() {
			return "Audio";
		}
	}
	
	class Buyer2{
		int money = 1000;
		int bonusPoint = 0;
		Product2[] cart = new Product2[10]; // 구입할 제품을 저장하기 위한 배열
		int i = 0; // Product 배열에 사용될 카운터
		
		void buy(Product2 p) {
			if(money < p.price) {
				System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
				return;
			}
			
			money -= p.price;
			bonusPoint += p.bonusPoint;
			cart[i++] = p;
			System.out.println(p + "을/를 구입하셨습니다.");
		}
		
		void summary() {
			int sum = 0;
			String itemList = "";
			
			for(int i = 0; i < cart.length; i++) { // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
				if(cart[i] == null) 
					break;
				sum += cart[i].price;
				itemList += cart[i] + ",";
				
			}
			System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
			System.out.println("구입하신 제품은 " + itemList + "입니다.");
		}
		
	}
	
	
	
	
