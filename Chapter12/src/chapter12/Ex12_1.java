import java.util.ArrayList;
import java.util.List;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Ex12_1 {

	public static void main(String[] args) {
		// 지네릭 타입과 다형성 예제
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		ArrayList<Product> tvList = new ArrayList<Tv>();  // 에러. 지네릭 타입 불일치
//		List<Tv> tvList = new ArrayList<Tv>();  // OK. 다형성 . 지네릭 타입 일치
		
		
		productList.add(new Tv());
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
//		printAll(tvList); // 컴파일 에러, 지네릭 타입 불일치
		
		

	}
	
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}
	

}