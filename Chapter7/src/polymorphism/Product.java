package polymorphism;

//매개변수의 다형성


 	class Product {		
		int price;  // 제품의 가격
		int bonusPoint; // 제품구매 시 제공하는 보너스점수
		
		Product(int price) {
			this.price = price;
			bonusPoint = (int)(price/10.0);  //보너스점수는 제품가격의 10%
		}

 	} 

 	
 	
 	class Tv1 extends Product {
 		Tv1() {
 			// 조상 클래스의 생성자 Product(int price)를 호출한다.
 			super(100);  // Tv의 가격을 100만원으로 한다.
 		}
 		
 		public String toString() {  // Object클래스의 toString()을 오버라이딩한다.
 			return "Tv"; 
		}
 	}
 	
 	
 	
 	class Computer extends Product {
 		Computer() {
 			super(200);
 		}		
 		
 		public String toString() {
 			return "Computer";
 		}
 	}
 	
 	
 	
 	
 	class Buyer {
 		int money = 1000;
 		int bonusPoint = 0;
 		
 		void buy(Product p) {
 			if(money < p.price) {
 				System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
 				return;
 			}
 			
 			money -= p.price;
 			bonusPoint += p.bonusPoint;
 			System.out.println(p.toString() + "을/를 구입하셨습니다.");
 		}
 	}
	
 	

 	