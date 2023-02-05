package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market {

	// 필드..?
	private List<Goods> goodsList; // ?????? List<Goods>
	
	
	// 생성자
	public Market() {
		this.goodsList = new ArrayList<>();  // ???? new ArrayList<>() ??????
	}
	
	// 상품 추가
	public void insert(Goods goods) {
		
		//Iterator 사
//		Iterator<Goods> iter = this.goodsList.iterator();
//		while (iter.hasNext()) {
//			Goods saveGoods = iter.next();
//			if (saveGoods.getName().equals(goods.getName())) {
//				System.out.println("등록된 상품이 존재합니다.");
//				return;
//			}
//		}


		// 위의 코드 대신 아래처럼 검사하려면, Goods의 equals를 오버라이드 해야한다.
		if (goodsList.contains(goods)) {
			System.out.println("등록된 상품이 존재합니다.");
			return;
		}
		
		
		// 판매 상태 유효성 확인
		// isValidState 메소드 불러옴.
		if (isValidState(goods.getState()) == false) {
			System.out.println("판매상태가 유효하지 않습니다.");
			return;
		}
		
		boolean addResult = this.goodsList.add(goods);
		System.out.println(addResult ? "추가되었습니다." : "실패했습니다.");
	} 
	
	
	
	
	
	// 상품 출력
	public void read() {
		if (this.goodsList.isEmpty()) {
			System.out.println("비어있습니다.");
			return;
		}
		
		
		// 1. Iterator로 돌리면서 출력하기
//		   Iterator<Goods> iter = this.goodsList.iterator();
//		   while (iter.hasNext()) {
//			   Goods goods = iter.next();
//			   System.out.println("물품명 : " + goods.getName()
//			   + ", 가격: " + goods.getPrice() + ", 판매상태 : " + goods.getState());
//		   }
		   
		   
		// 2. toString 오버라이드 
		System.out.println(this.goodsList);
	}
	
	
	
	
	// 상품 가격 수정
	public void updatePrice(String name, int price) {
		boolean exist = false; // 상품 존재여부
		Iterator<Goods> iter = this.goodsList.iterator();
		while (iter.hasNext()) {
			Goods goods = iter.next();
			if (goods.getName().equals(name)) {
				exist = true;
				goods.setPrice(price);
				break;
			}
		}
		
		if (exist == false) {
			System.out.println("수정할 상품이 존재하지 않습니다.");
		} else {
			System.out.println("수정 되었습니다.");
		}
	}
	
	
	
	public void updateState(Goods goods, String state) { // 바꿀 상품명이 들어있는 객체, 변경할 상태값
		// 존재하는 상품인지 확인 -> "수정할 상품이 존재하지 않습니다."
		if (this.goodsList.contains(goods) == false) {
			System.out.println("수정할 상품이 존재하지 않습니다.");
//			return;  // 반환 타입이 void이기 때문에 안써도 됨.
		}
		
		
		
		// validation - 판매 유효성 체크
		if (isValidState(goods.getState()) == false) {
			System.out.println("판매상태가 유효하지 않습니다.");
//			return;  // 반환 타입이 void 이기 때문에 안써도 됨.
		}
		
		
		Iterator<Goods> iter = this.goodsList.iterator();
		while (iter.hasNext()) {
			Goods saveGoods = iter.next();  // Goods를 saveGoods의 변수로 훝는다.. 하나씩.. // saveGoods는 여기서 만든 변수임.
			if (saveGoods.getName().equals(goods.getName())) {
				saveGoods.setState(state);  // 매대에 있던 상품이 바로 변경된다.
				System.out.println("수정되었습니다.");
			}
		}
	}
	
	
	
	// 상품 삭제
	public void delete(String name) {
		boolean exist = false; // 상품 존재여부
		Iterator<Goods> iter = this.goodsList.iterator();
		while (iter.hasNext()) {
			Goods goods = iter.next();  // goods는 여기서 만든 변수임.
			if (goods.getName().equals(name)) {
				exist = true; // 동일한 상품이 있으면 true로 변경.
				iter.remove();  // goods 대신에 iter를 쓰는 이유는 while문 안에서 goods는 끝나기 때문. 실제로 삭제해야 되는건 Goods안에 있는 것이기 때문에.
				break;
			}
		}
		
		
		if (exist == false) {
			System.out.println("삭제할 상품이 존재하지 않습니다.");
		} else {
			System.out.println("삭제 되었습니다.");
		}
	}
	
	
	
	// 판매 상태 유효성 확인
	private boolean isValidState(String state) {
		if ((state.equals("판매중") || state.equals("판매완료") || state.equals("예약중")) == false) {
			return false;
		}
		
		return true;
	}
	
}// class
