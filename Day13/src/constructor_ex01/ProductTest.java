package constructor_ex01;

public class ProductTest {

	public static void main(String[] args) {
		// 나의 의식
		Product product = new Product ("새우깡", 1300, "2022-01-08");
		System.out.println("이름:" + product.getName());
	    System.out.println("가격:" + product.getPrice());
	    System.out.println("유통기한:" + product.getDateOfExpiration());
	   
	    System.out.println();
	    
	    System.out.println("제품 5개 가격:" + product.calculatetPrice(5));
	    System.out.println("제품 5개 가격:" + product.calculatetPrice(13));

	    System.out.println(product.availableSale());
	}
}

