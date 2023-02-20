package Map;

public class MarketTest2 {

	public static void main(String[] args) {
		Goods2 goods1 = new Goods2("신발1", 15000, "판매중");  // 객체 생성.
		Goods2 goods2 = new Goods2("가방1", 20000, "예약중");
		Goods2 goods3 = new Goods2("가방1", 20000, "예약중");
		Market2 market = new Market2();
		
		market.insert(goods1);
		market.insert(goods2);
		market.insert(goods3);
		market.read();
		market.updatePrice("가방1", 30000);
		market.read();
		market.updateState(goods3, "판매완료");
		market.read();
		market.delete("가방1");
		market.read();
	}

}
