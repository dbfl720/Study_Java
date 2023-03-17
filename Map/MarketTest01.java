package Map;

public class MarketTest01 {

	public static void main(String[] args) {
		Goods01 goods1 = new Goods01("신발1", 15000, "판매중");
		Goods01 goods2 = new Goods01("가방1", 200000, "예약중");
		Goods01 goods3 = new Goods01("가방1", 200000, "예약중");
		Market01 market = new Market01();
		market.insert(goods1);
		market.insert(goods2);
		market.insert(goods3);
		market.read();
		market.updatePrice("가방1", 300);
		market.read();
		market.updateState(goods2, "판매완료");	
		market.read();
		market.delete("가방1");
		market.read();
	}

}
