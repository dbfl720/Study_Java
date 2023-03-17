package Map;

// 필드
public class Person {
	//필드
	private String name;  // 이름
	private int yyyymmdd;  // 생년월일
	
	
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getYyyymmdd() {
		return yyyymmdd;
		
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setYyyymmdd(int yyyymmdd) {
		this.yyyymmdd = yyyymmdd;
	}
	
	
	//오버라이드
	@Override
	public String toString() {
		return "이름: " + this.name + ", 생년월일 : " + this.yyyymmdd;
	}
	

}
