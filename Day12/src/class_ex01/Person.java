package class_ex01;

// 설계도, 붕어빵 틀
public class Person {
	
	// 속성, 필드   // 속성은 Person과 연관된 것만 정의를 한다. 
	String name;  // 변수아님. 필드임. static에 쌓이는 것임.
	String yyyymmdd;
	String sex;
	
	
	
	
	// 메소드
	public void greething() {
		System.out.println("안녕하세요");
	}
	
	public void walking() {
		System.out.println("걷는다.");
	}
	
	public void introduce() {
		System.out.println("내 이름은 " + this.name + "이고 성별은 " + this.sex + "이다.");
	}
	
	public void printAge() {  // 내용물 안에 들어가는 것은 메소드 안에서 만들어져야 한다.!! 
		// yyyy  0 , 1, 2, 3, 4 
		String yyyyStr = this.yyyymmdd.substring(0,4);  // yyyy
		int age = 2023 - Integer.valueOf(yyyyStr) + 1;  // 여기서만 쓰여지는 일회용 변수. 메소드 안에서 사용되는 일반 변
		
		System.out.println("나이는 " + age + "세이다." );
	}
	

}
