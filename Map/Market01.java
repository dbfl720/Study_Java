package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market01 {

	// 물품 리스트 관리.  CRUD 메소드 모음. // 필드, 메소드.
	
	
	// 필드
	private List<Goods01> goodsList;
	
	// 생성자
	public Market01() {
		this.goodsList = new ArrayList<>();
					
	}
	
	
	// setter?? 
	// 상품 추가
	// Goods01의 equals를 오버라이드 해야한다.??? equals 사용 안하는디..?
	public void insert(Goods01 goods) {
		// 1. 등록된 상품인지 검사.
		if(goodsList.contains(goods)) {
			System.out.println("등록된 상품이 존재합니다.");
			return;
		}
		
		// 2. 판매 상태 유효성 확인
		if(isValidState(goods.getState()) == false) {
			System.out.println("판매상태가 유효하지 않습니다.");
			return;
		}
		
		// 3. 추가 됬는지 결과 확인
		boolean addResult = this.goodsList.add(goods);
		System.out.println(addResult ? "추가되었습니다." : "실패했습니다.");	
		
	} // insert
	
	
	
	
	
	
	
	// setter?? 
	// 상품 출력
	public void read() {
		if(this.goodsList.isEmpty()) {
			System.out.println("비어있습니다.");
			return;
		}
		
		// toString 오버라이드
		System.out.println(this.goodsList);
	
	} // 상품 출력
	
	
	
	
	// setter?
	// 상품 가격 수정
	public void updatePrice(String name, int price) {
		boolean exist = false;  // 상품 존재여부
		Iterator<Goods01> iter = this.goodsList.iterator();
		while (iter.hasNext()) {
			Goods01 goods = iter.next();
			if (goods.getName().equals(name)) {
				exist = true;
				goods.setPrice(price);
				break;
			}
		}
		
		
		// 수정됬는지 안됬는지 출력.
		if (exist == false) {
			System.out.println("수정할 상품이 존재하지 않습니다.");
		} else {
			System.out.println("수정 되었습니다.");
		}
			
		
	} // updatePrice
	
	
	
	
	
	// setter?
	public void updateState(Goods01 goods, String state) { // 바꿀 상품명이 들어있는 객체, 변경할 상태값
		// 존재하는 상품인지 확인 => "수정할 상품이 존재하지 않습니다."
		if(this.goodsList.contains(goods) == false) {
			System.out.println("수정할 상품이 존재하지 않습니다.");
			return;
		}
		
		
		// validation - 판매 유효성 체크
		if (isValidState(goods.getState()) == false) {
			System.out.println("판매상태가 유효하지 않습니다.");
			return;
		}
		
		
		Iterator<Goods01> iter = this.goodsList.iterator();
		while(iter.hasNext()) {
			Goods01 saveGoods = iter.next();
			if(saveGoods.getName().equals(goods.getName())) {
				saveGoods.setState(state); // 매대에 있던 상품이 바로 변경괸다.
				System.out.println("수정되었습니다.");
			}
		}
		
	} // updateState
	
	
	
	
	
	// 상품 삭제
	public void delete(String name) {
		boolean exist = false;  // 상품 존재여부
		Iterator<Goods01> iter = this.goodsList.iterator();
		while(iter.hasNext()) {
			Goods01 goods = iter.next();
			if(goods.getName().equals(name)) {
				exist = true;
				iter.remove();
				break;
			}
		}
		
		// 삭제할 상품 출력
		if (exist == false) {
			System.out.println("삭제할 상품이 존재하지 않습니다.");
		} else {
			System.out.println("삭제 되었습니다.");
		}
		
	} // delete
	
	
	
	private boolean isValidState(String state) {
		// 판매 상태 유효성 확인
		if ((state.equals("판매중") || state.equals("판매완료") || state.equals("예약중")) == false) {
			return false;
		}
		
		return true;
	}
	
}
