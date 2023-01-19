package map_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		List<String> fruits = new ArrayList<>();
		
		
		while (true) {
			System.out.println("1:입력 2: 출력 3:삭제 4: 종료");
			int num = scan.nextInt();
			if (num == 1 ) {
				// 입력
				// ** 선생님			
				System.out.println("과일 이름을 입력하세요: ");
				String fruit = scan.next();
//				if(fruits.add(fruit)) { // add 자체가 boolean 
//					System.out.println("입력 성공");
//				} else {
//					System.out.println("입력 실패");
//				}
				System.out.println(fruits.add(fruit) ? "입력 성공" : "입력 실패");
				
				
				// 내가 푼 것.
//				System.out.println("과일 이름을 입력하세요: ");	
//				String num2 = scan.next();
//				fruits.add(num2);
//				System.out.println("입력 성공");
				
			
			} else if (num == 2) {
				// 출력 iterator // 2.출력: 과일이 있으면 출력하고, 아무것도 없을 경우 "비어있습니다." 라고 출력한다.
				
				// ** 선생님이 푼 것.
				if (fruits.isEmpty()) {
					System.out.println("비어있습니다.");
					continue; 
				}
				Iterator<String> iter = fruits.iterator();
				while (iter.hasNext()) {
					 System.out.println(iter.next());
				}
				
						
				
				
				// 내가 푼 것. 
//				Iterator<String> iter = fruits.iterator();
//				while (iter.hasNext()) {
//					String fruit = iter.next();
//					if(fruits.isEmpty()) {
//						System.out.println("비어있습니다.");
//					} else {
//						System.out.println(fruits);
//					}
//					
//				}
				
				
			} else if (num == 3) {
				// 삭제
				System.out.println("삭제할 과일 이름을 입력하세요: ");
				String deleteFruit = scan.next();
				System.out.println(fruits.remove(deleteFruit) ? "삭제 성공" : "삭제 실패");
				
				
				
			} else if (num == 4) {
				// 종료
				System.out.println("종료합니다.");
				break;  // 제일 가까이 있는 반복문을 빠져 나가는 것임.
			} else {
				// 잘못
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

}
