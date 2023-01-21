package map_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Market {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		List<Goods> goodsList = new ArrayList<>();
		
		while (true) {
			 
			
			System.out.println("1:입력  2:출력  3:수정  4:삭제");
			int num = scan.nextInt();
			if (num == 1) {
				
				
				System.out.println("물품명을 입력하세요: ");
				String name = scan.next();		
				
				if (goodsList.contains(name)) {
					System.out.println("등록된 상품이 존재합니다.");
					continue;
				} 									
					System.out.println("가격을 입력하세요: ");
					int price = scan.nextInt();
					
					System.out.println("판매상태 -  판매중 또는 예약중를 입력하세요: ");
					String state = scan.next();					
					if (!state.equals("판매중") || state.equals("예약중") ) {
					  System.out.println("판매상태가 유효하지 않습니다.");
					 continue;
					}
				
					
						
				// 객체 생성
				Goods goods = new Goods();
				goods.setName(name);
				goods.setPrice(price);
				goods.setState(state);
				
				System.out.println(goodsList.add(goods) ? "입력 성공" : "입력 실패");
				
			} else if (num == 2) {
				
				if (goodsList.isEmpty()) {
					System.out.println("비어있습니다.");
					continue;
				}
				
				Iterator<Goods> iter = goodsList.iterator();
				while (iter.hasNext()) {
					Goods goods = iter.next();
					System.out.println(goods.toString());
				}
				
				
			} else if (num == 3) {
				System.out.println("수정할 상품명을 입력하세요: ");
				String findGoodsName = scan.next();
				
				Iterator<Goods> iter = goodsList.iterator();
				while (iter.hasNext()) {
					Goods goods = iter.next();
					if (!findGoodsName.equals(goods.getName())) {
						System.out.println("수정할 상품이 존재하지 않습니다.");
					} else {
						System.out.println("가격을 수정해주세요: ");
						int price = scan.nextInt();					
						System.out.println("판매 상태를 수정해주세요: ");
						String state = scan.next();
						goodsList.add(goods);
						break;
					} 
					
				} 
				
			} else if (num == 4) {
				System.out.println("삭제할 상품명을 입력하세요: ");
				String findGoodsName = scan.next();
				
				
//				if (!findGoodsName.equals(goodsList)) {
//					System.out.println("삭제할 상품이 존재하지 않습니다.");
//					continue;
//				}
				
				
				
				Iterator<Goods> iter = goodsList.iterator();
				while (iter.hasNext()) {
					Goods goods = iter.next();
					if (findGoodsName.equals(goods.getName())) {
						iter.remove();						
					} else {
						System.out.println("삭제할 상품이 존재하지 않습니다.");
					}
					
				} 
				System.out.println("삭제 되었습니다.");
			 } 
			
			
			
	
			
			
			
			
			
			
		} // while 

	} // main

}
