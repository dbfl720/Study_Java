package polymorphism;

class Ex7_8 {
 		public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1()); // 이 코드를 줄여씀. Product p = new Tv1(); / b.buy(p); 
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
		
					
		
	}
}