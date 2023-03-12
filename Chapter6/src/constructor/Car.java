package constructor;

public class Car {
	// 필드.
	String color;
	String gearType;
	int door;
	
	Car() {}  // 기본 생성자.
	
	Car(String c, String g, int d){	// 매개변수가 있는 생성자.
		color = c;
		gearType = g;
		door = d;
	}
	
	
} // class
