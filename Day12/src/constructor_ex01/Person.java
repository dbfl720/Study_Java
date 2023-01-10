package constructor_ex01;


// control + shift + f = 정렬하는 키

public class Person {   // 냉장고. 
	// 속성, 필드 // 속성은 Person과 연관된 것만 정의를 한다.
	// private - 은닉화(Hiding)
	private String name; // 변수아님. 필드임. static에 쌓이는 것임.  // 음료수
	private String yyyymmdd; // 필드에는 무조건 private 쓴다!!! ( 규칙!!)
	private String sex;

	
	
	// 메소드  // 메소드를 통해서 음료수를  친구한테 전달하도록 하는 기능. 

	// 생성자(Constructor) // 무조건 public, 리턴타입 없음.!!!!, void 안씀. void 의미는 리턴타입이 있는데 돌려줄게 없다는 뜻이고, 생성자는 void조차 안씀. // 클래스명과 같아야함!! // 모든 클래스에는 생성자가 있다. 
	// 생성자 : 객체가 생성될 때 처음 불려지는 특수한 메소드.
	// -- 리턴타입이 아예 존재하지 않는다. 클래스명과 동일하다. 최초 한번만 호출된다.
	public Person() {
		System.out.println("응애~~~");
	}

	// 생성자 오버로딩(Constructor Overloading) **** 면접에 많이 나옴!! 메소드명은 똑같은데 파라미터 타입이 다르거나 개수가 다르거나 할 때 일치하는 메소드가 선택된다.
	// 달라서 다르게 봄
	// - 파라미터의 타입이 다르거나 개수가 다르거나 // input이 다른걸로 구분한다.
	// * 보통 파라미터가 있는 생성자는 은닉화 되어있는 변수에 세팅을 하는 역할.  객체를 만들자 마자 값을 세팅하고 싶을때 사용.
	public Person(String name, String yyyymmdd, String gender) { // 생성자가 파라미터가 다르면 다르게 봄.
		System.out.println("파라미터가 있는 생성자");
		this.name = name;
		this.yyyymmdd = yyyymmdd;
		this.sex = gender;
	}

	// setter, getter 캡슐화(Encapsulation) : 외부에서는 캡슐화를 통해 필드에 접근하다.  // 메소드(setter, getter)를 통해서 음료수를  친구한테 전달하도록 하는 기능.  
	// setter : name을 친구가 세팅할 수 있게 해주고 싶다. // 필드 하나하나 변수를 넣을 수 잇다.  // 수정하거나 값을 넣고 싶을 때 사용. 
	// 1. main에서 name이 홍유리 라고 전달   2. input - String name으로 받아온다. 3. 클래스의 필드 name에 저장한다.  
	public void setName(String name) { // input : String name - 일반 변수. // main이 저장할 수 있는 통로.
		this.name = name; // 필드는 this를 붙인다! 구분하기 위해서!!!!  왼쪽 this.name은 필드 name. 오른쪽 name은 변수, 즉 input 값의 name임.
	}

	public void setYyyymmdd(String yyyymmdd) { // main에서 받아오기
		this.yyyymmdd = yyyymmdd; // 오른쪽에 있는 yyyymmdd는 23번째 줄 꺼임. // 검증된 데이터를 저장할수 있는 장점.

	}


	// 모든 메소드는 오버로딩이 가능하다. 
	public void setGender(String gender) {
		this.sex = gender;
	}

	
	
	
	
	// getter : 내가 가지고 있는 것을 주는 것.  즉 필드를 외부에 주는 것. 
	public String getName() {
		return this.name;
	}

	public String getYyyymmdd() {
		return this.yyyymmdd;
	}

	public String getSex() {
		return this.sex;
	}

	
	
	public void greething() {
		System.out.println("안녕하세요");
	}

	public void walking() {
		System.out.println("걷는다.");
	}

	public void introduce() {
		System.out.println("내 이름은 " + this.name + "이고 성별은 " + this.sex + "이다.");
	}

	public void printAge() { // 내용물 안에 들어가는 것은 메소드 안에서 만들어져야 한다.!!
		// yyyy 0 , 1, 2, 3, 4
		String yyyyStr = this.yyyymmdd.substring(0, 4); // yyyy
		int age = 2023 - Integer.valueOf(yyyyStr) + 1; // 여기서만 쓰여지는 일회용 변수. 메소드 안에서 사용되는 일반 변

		System.out.println("나이는 " + age + "세이다.");
	}
}
