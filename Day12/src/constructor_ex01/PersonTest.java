package constructor_ex01;

public class PersonTest {

	public static void main(String[] args) {
		// 나의 의식
		// 한번밖에 안됨. 초기 세팅
		Person p = new Person("바다", "19950202", "남자"); // new 하면서 사람 탄생. // Person() : 생성자, (new가 되는 모든 것들.)
	

//		p.name = "홍유리";  // 사람 창조됨. // 이렇게 접근은 좋지 못함. // 바로 필드에 저장하는 방식.
//		p.yyyymmdd = "20100720";
//		p.sex = "여자";

		
		//세터를 이용해 변경 가능.
		p.setName("홍유리"); // setter를 이용해서 변경 가능. 이름을 줄테니깐 너의 필드에 저장해라.
		p.setYyyymmdd("20100720");
		p.setGender("여자");

		System.out.println(p.getName());
		System.out.println(p.getYyyymmdd());
		System.out.println(p.getSex());
//
//		p.greething();
//		p.walking();
//		p.introduce();
//		p.printAge();

	}

}
