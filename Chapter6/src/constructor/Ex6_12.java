package constructor;

public class Ex6_12 {

	public static void main(String[] args) {
		Car c1 = new Car(); // 기본 생성자 호출.
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4); // 매개변수가 있는 생성자 호출.
		
		System.out.println("c1의 color =" + c1.color + ",  gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

	}

}
