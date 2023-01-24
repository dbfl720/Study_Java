package inheritance;

public class Ex7_7 {

	public static void main(String[] args) {
		// 참조변수의 형변환
		
		Car car = null;
		FireEngine fe = new FireEngine(); // 실제 객체가 무엇인지 중요!! ( 객체 멤버수를 넘으면 안됨!!!)
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;  // car = (Car)fe;에서 형변환이 생략됨
	//	car.water();  컴파일 에러!! Car타입의 참조변수는 water()를 호출할 수 없다.
		fe2 = (FireEngine)car;  // 자손타입 <- 조상타입 .  형변환 생략 불가.
		fe2.water();
		
		

	}

}


	class Car {
		String color;
		int door;
		
		void drive() { 
			System.out.println("drive, Brrr~~ ");
		}
		
		void stop() {
			System.out.println("stop!!");
		}
		
		
		
		
	}
	
	class FireEngine extends Car {
		void water() {
			System.out.println("water!!!");
		}
	}