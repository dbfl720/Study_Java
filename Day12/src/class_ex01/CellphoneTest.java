package class_ex01;

public class CellphoneTest {

	public static void main(String[] args) {
		// 나의 의식
		Cellphone cp1 = new Cellphone();  // 실물 객체
		cp1.maker = "samsung";
		cp1.model = "zfilp3";
		cp1.color = "pink";
		cp1.price = 200;
		
		System.out.println(cp1.maker);
		System.out.println(cp1.model);
		System.out.println(cp1.color);
		System.out.println(cp1.price);
		
		
		cp1.call();
		cp1.camera();
		
		cp1.color = "white";  // 값 변경 가능.
		cp1.maker = "apple";
		System.out.println(cp1.color);
		System.out.println(cp1.maker);
	}

}
