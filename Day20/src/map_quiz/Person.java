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
	public String toString() {	// String을 단순 Object에 포함된 메서드가 아닌 Student에 들어있는 각필드 값들의 정보를 문자열로 출력할 수 있도록 재정의 하였다.
		return "이름 : " + this.name + ", 생년월일: " + this.birthDate;
	}
}
