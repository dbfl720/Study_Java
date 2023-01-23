package constructor;

public class Ex6_13 {

	public static void main(String[] args) {
		// 생성자에서 다른 생성자 호출하기 - this ()
		
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);

		System.out.println("c2의 color = " + c1.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}

}
