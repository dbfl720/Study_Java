package PracticeGoods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//물품 리스트를 관리하고 CRUD 메소드가 이곳에 있어야함. (필드, 메소드)

public class Market {

	// 필드
	private List<Goods> goodsList;
	
	// 생성자
	public Market() {
		this.goodsList = new ArrayList<>();
	}
	
	
	// 상품 추가  // Create
	public void insert(Goods goods) {
		
		if (goodsList.contains(goods)) {
			System.out.println("등록된 상품이 존재합니다.");
			return;
		}
		
		
		// 판매 상태 유효성 확인
		if (isValidState(goods.getState()) == false) {
			System.out.println("판매상태가 유효하지 않습니다.");
			return;
		}
		
		
		boolean addResult = this.goodsList.add(goods);
		System.out.println(addResult ? "추가되었습니다 " : "실패했습니다.");
	}
	
	
	// 상품 출력		// Read
	public void read() {
		if (this.goodsList.isEmpty()) {
			System.out.println("비어있습니다.");
			return;
		}
		System.out.println(this.goodsList);
				
	}
	
	
	// 상품 가격 수정 // update
	public void updatePrice(String name, int price) {
		boolean exist = false;
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
	
	
	public void updateState(Goods goods, String state) {
		if (this.goodsList.contains(goods) == false) {
			System.out.println("수정할 상품이 존재하지 않습니다.");
			return;
		}
		
		
		if (isValidState(goods.getState()) == false) {
			System.out.println("판매상태가 유효하지 않습니다.");
			return;
		}
		
		Iterator<Goods> iter = this.goodsList.iterator();
		while (iter.hasNext()) {
			Goods saveGoods = iter.next();
			if (saveGoods.getName().equals(goods.getName()))
				saveGoods.setState(state);
			System.out.println("수정되었습니다.");
		}
	}
	
	
	
	// 상품 삭제  // delete
	public void delete(String name) {
		boolean exist = false;
		Iterator<Goods> iter = this.goodsList.iterator();
		while (iter.hasNext()) {
			Goods goods = iter.next();
			if (goods.getName().equals(name)) {
				exist = true;
				iter.remove();
				break;
			}
		}
		
		if (exist == false) {
			System.out.println("삭제할 상품이 존재하지 않습니다.");
		} else {
			System.out.println("삭제 되었습니다.");
		}
		
	}
	
	private boolean isValidState(String state) {
		if ((state.equals("판매중") || state.equals("판매완료") || state.equals("예약중")) == false ) {
			return false;
		}
		return true;
				
	}
	
	
} // class
