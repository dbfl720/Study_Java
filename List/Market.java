package List;

import java.util.ArrayList;
import java.util.List;

public class Market {
//	Market 객체: CRUD 메소드 구현
//	(C: create, insert)
//	같은 상품명 중복 불가 => "등록된 상품이 존재합니다."
//	물품명, 가격, 판매상태를 입력 받는다.(판매상태 정의된 값 외 입력 불가 => "판매상태가 유효하지 않습니다.")
	
//	(R: read, select)
//	비어있는 경우 => "비어있습니다"
//	상품 리스트 출력
//	=> 물품명:oo, 가격:oo, 판매상태:판매중
//	물품명:oo, 가격:oo, 판매상태:예약중
	
//	(U: update)
//	존재하는 상품인지 확인 => "수정할 상품이 존재하지 않습니다."
//	메소드1: 상품명으로 물품의 가격 수정 => "수정 되었습니다."
//	메소드2: 상품명으로 판매상태 수정(판매상태 정의된 값 외 입력 불가)
	
//	(D: delete)
//	존재하는 상품인지 확인 => "삭제할 상품이 존재하지 않습니다."
//	상품명으로 물품 삭제 => "삭제 되었습니다."
	
	
	
	
	private  List<Goods> goodsList;
	
	public Market() {
		this.goodsList = new ArrayList<>();
	}
	
	
	// 상품추가
	public void insert(Goods goods) {
		
		//Goods의 equals를 오버라이딩
		if(goodsList.contains(goods)) {
			System.out.println("등록된 상품이 존재합니다.");
			return;
		}
		
		// 판매 상태 유효성 확인
		if (isValidState(goods.getState()) == false) {
			System.out.println("판매상태가 유효하지 않습니다.");
			return;
		}
		
		boolean addResult = this.goodsList.add(goods);
		System.out.println(addResult ? "추가되었습니다." : "실패했습니다.");
		
		
	}
	
	
	
	// t
	
	
	
	private boolean isValidState(String state) {
		// 판매 상태 유효성 확인
		if ((state.equals("판매중") || state.equals("판매완료") || state.equals("예약중") == false) {
			return false;
		}
		return true;
	}
	
	
}
