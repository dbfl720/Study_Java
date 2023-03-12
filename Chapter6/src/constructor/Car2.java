package constructor;

public class Car2 {
	// 생성자에서 다른 생성자 호출하기 - this( )
	String color;  //색상
	String gearType;  // 변속기 종류
	int door;
	
	Car2(){ 
		this("white", "auto", 4);		// Car2(String color, String gearType, int door) 호출.
	}
	
	Car2(String color){ 
		this(color, "auto", 4); // Car2(String color, String gearType, int door) 호출.
				
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
}
