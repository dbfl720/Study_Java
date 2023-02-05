package Map;

public class MarketTest {

	public static void main(String[] args) {
		Goods goods1 = new Goods("신발1", 15000, "판매중");  // 객체 생성
		Goods goods2 = new Goods("가방1", 200000, "예약중");  // 객체 생성
		Goods goods3 = new Goods("가방2", 200000, "예약중");  // 객체 생성
		Market market = new Market(); // 객체 생성
		market.insert(goods1);
		market.insert(goods2);
		market.insert(goods3);
		market.read();
		market.updatePrice("가방1", 300);
		market.read();
		market.updateState(goods3, "판매완료");
		market.read();
		market.delete("가방2");
		market.read();
		
		

	}

}
