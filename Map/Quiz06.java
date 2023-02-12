package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// 자료구조 활용 추가문제2 - 과일 저장
		
		List<String> fruits = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			//1. 
			System.out.println("1:입력 2:출력 3:삭제 4:종료");
			int number = scan.nextInt();
			
			if(number == 1) {
				System.out.print("과일 이름을 입력하세요: ");
				String fruitName = scan.next();
				
				fruits.add(fruitName);
				System.out.println("입력 성공!");
				
				// * 다른 코드
//				boolean isInsert = 1isInsert ? "입력 성공" : "입력 실패");
				 
			}
			
			else if(number ==2) {
				if(fruits.isEmpty()) {
					System.out.println("비어있습니다.");
					continue;
				} else {
					System.out.println(fruits);
				}
			}
			
			else if(number == 3) {
				System.out.print("삭제할 과일 이름을 입력하세요: ");
				String delete = scan.next();
				System.out.println(fruits.remove(delete) ? "삭제 성공" : "삭제 실패");
										
			} // -- 3 끝
			
			
			else if(number == 4) {
					System.out.println("종료합니다.");
					break; 
					}
							 
			else {
					System.out.println("잘못입력했습니다.");
				}
			
			
			
		
		} // while

	} // main
	

}
