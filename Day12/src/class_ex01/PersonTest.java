package class_ex01;

public class PersonTest {

	public static void main(String[] args) {
	// 나의 의식
		
		Person p = new Person();  // new 하면서 사람 탄생.
		
		p.name = "홍유리";  // 사람 창조됨.
		p.yyyymmdd = "20100720";
		p.sex = "여자";
		
		p.greething();
		p.walking();
		p.introduce();
		p.printAge();
		

	}

}
