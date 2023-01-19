package map_quiz;

public class Person {

	// 필드
	private String name;
	private int birthDate;
	
	
	
	
	// 메소드
	
	// Setter
	public void setName(String name) {  // output : void  // input : String name
		this.name = name;
	}
	
	public void setbirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
	// Getter
	public String getName() {
		return this.name;
	}
	
	public int getBirthDate() {
		return this.birthDate;
	}
	
	
	@Override
	public String toString() {
		return "이름 : " + this.name + ", 생년월일: " + this.birthDate;
	}
}
